"""Minimal OpenAI-compatible chat client (OpenRouter / NVIDIA) using only the stdlib."""

import json
import os
import time
import urllib.error
import urllib.request

PROVIDERS = {
    "openrouter": {
        "url": "https://openrouter.ai/api/v1/chat/completions",
        "key_env": "OPENROUTER_API_KEY",
        # Free-tier model names change often: override with --model or OASIS_MODEL.
        "model": "meta-llama/llama-3.3-70b-instruct:free",
    },
    "nvidia": {
        "url": "https://integrate.api.nvidia.com/v1/chat/completions",
        "key_env": "NVIDIA_API_KEY",
        "model": "meta/llama-3.3-70b-instruct",
    },
}


class LLMError(RuntimeError):
    pass


class LLMClient:
    def __init__(self, provider="openrouter", model=None, api_key=None, temperature=0.7):
        if provider not in PROVIDERS:
            raise LLMError(f"unknown provider {provider!r}; use one of {sorted(PROVIDERS)}")
        cfg = PROVIDERS[provider]
        self.url = cfg["url"]
        self.model = model or os.environ.get("OASIS_MODEL") or cfg["model"]
        self.api_key = api_key or os.environ.get(cfg["key_env"])
        self.temperature = temperature
        if not self.api_key:
            raise LLMError(f"set the {cfg['key_env']} environment variable (API key for {provider})")

    def chat(self, system, user):
        body = json.dumps({
            "model": self.model,
            "temperature": self.temperature,
            "messages": [{"role": "system", "content": system},
                         {"role": "user", "content": user}],
        }).encode()
        req = urllib.request.Request(self.url, data=body, headers={
            "Authorization": f"Bearer {self.api_key}",
            "Content-Type": "application/json",
        })
        last = None
        for attempt in range(5):
            try:
                with urllib.request.urlopen(req, timeout=180) as resp:
                    data = json.load(resp)
                content = data["choices"][0]["message"].get("content")
                if content:
                    return content
                last = "empty response"
            except urllib.error.HTTPError as e:
                last = f"HTTP {e.code}: {e.read().decode(errors='replace')[:300]}"
                if e.code not in (429, 500, 502, 503, 504):
                    break
            except (urllib.error.URLError, TimeoutError, KeyError, json.JSONDecodeError) as e:
                last = repr(e)
            time.sleep(2 ** attempt)
        raise LLMError(f"LLM request failed: {last}")


def extract_json(text):
    """Return the first JSON object found in an LLM reply (fenced or not)."""
    dec = json.JSONDecoder()
    for i, ch in enumerate(text):
        if ch == "{":
            try:
                obj, _ = dec.raw_decode(text[i:])
                if isinstance(obj, dict):
                    return obj
            except json.JSONDecodeError:
                continue
    raise LLMError("no JSON object in LLM reply: " + text[:200])
