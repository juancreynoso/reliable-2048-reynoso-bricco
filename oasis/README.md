# OASIs simplificado (Proyecto 5, Ejercicio 2)

Dado un método Java y una aserción, consulta a un LLM y le muestra al usuario evidencia para refinarla.
La herramienta **nunca cambia la aserción sola**: la decisión es del usuario.

| Sospecha | Qué le pide al LLM | Qué hace la herramienta | Qué reporta |
|---|---|---|---|
| Aserción **demasiado fuerte** (falso positivo) | Entradas válidas que la violen | Las ejecuta sobre el método real | Las entradas que de verdad la violan |
| Aserción **demasiado débil** (falso negativo) | Mutantes del método que la aserción no detecte | Compila y ejecuta cada mutante | Los mutantes que dan otro resultado y aun así cumplen la aserción |

Al final el LLM explica la evidencia y propone aserciones (solo sugerencias).

## Uso

```bash
export OPENROUTER_API_KEY=...
python3 oasis/refiner.py oasis/cases/can_merge/case.json --report oasis/report-can_merge.md
python3 oasis/refiner.py oasis/cases/can_merge/case.json --assertion "result == (a == b && a >= 2)"
python3 -m unittest oasis/test_oasis.py       # sin LLM ni API key
```

- Modelo por defecto: `nvidia/nemotron-3-ultra-550b-a55b:free` (OpenRouter). Otro modelo: `OASIS_MODEL=...`.
- Necesita `java` y `javac` en el PATH. Solo usa la librería estándar de Python.

## Formato de un caso (`case.json`)

`source` (el `Subject.java`), `method`, `params` (`["int", nombre]`), `return_type`, `precondition` (qué entradas son válidas),
`assertion` (expresión Java sobre los parámetros y `result`), `description` y `name`.

## Casos de estudio (contratos que infirió Daikon en el TP4)

1. `can_merge`: `Cell.canMergeWith`, postcondición **débil** (solo una dirección del ⇔).
2. `cell_equals`: `Cell.equals`, postcondición **demasiado fuerte** (`value ∈ {2, 4, 2048}`).
3. `merge_value`: `Cell.mergeWith`, postcondición razonable que escondía el desborde de `int` con `2^30`.

Resultados y conclusiones: `INFORME.md`.
