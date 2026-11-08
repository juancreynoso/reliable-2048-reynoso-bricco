# OASIs simplificado (Proyecto 5, Ejercicio 2)

Dado un método Java y una aserción, consulta a un LLM y le muestra al usuario evidencia para refinarla.
La herramienta **nunca cambia la aserción sola**: la decisión es del usuario.

| Sospecha | Qué pide al LLM | Qué hace la herramienta | Qué reporta |
|---|---|---|---|
| Aserción **demasiado fuerte** (falso positivo) | Entradas válidas que la violen | Las ejecuta sobre el método real | Entradas que de verdad la violan |
| Aserción **demasiado débil** (falso negativo) | Mutantes del método que la aserción no detecte | Compila y ejecuta cada mutante | Mutantes **no equivalentes** que sobreviven (difieren del original en alguna entrada y la aserción sigue valiendo) |

Al final el LLM redacta feedback y propone aserciones candidatas (solo sugerencias).

## Uso

```bash
export OPENROUTER_API_KEY=...        # o NVIDIA_API_KEY con --provider nvidia
python3 oasis/refiner.py oasis/cases/can_merge/case.json --report oasis/report-can_merge.md
python3 oasis/refiner.py oasis/cases/cell_equals/case.json --interactive
python3 oasis/refiner.py oasis/cases/merge_value/case.json --model <otro-modelo>
```

- Modelo por defecto: `meta-llama/llama-3.3-70b-instruct:free` (OpenRouter). Los nombres de modelos gratuitos cambian: usar `--model` o `OASIS_MODEL`.
- `--interactive`: tras cada análisis podés escribir una aserción nueva y se repite el ciclo.
- Necesita `java` y `javac` en el PATH. Solo usa la librería estándar de Python.

## Formato de un caso (`case.json`)

`source` (archivo `Subject.java` autocontenido), `method`, `params` (`[tipo, nombre]`; tipos: int, long, boolean, double, String),
`return_type`, `precondition` (qué entradas son válidas), `assertion` (expresión Java con `result` y los parámetros), `description`.

## Casos de estudio (contratos de Daikon del TP4)

1. `can_merge`: `Cell.canMergeWith`, postcondición Daikon **débil** (solo una dirección del ⇔). Se espera que sobreviva, por ejemplo, un mutante que devuelva siempre `false`.
2. `cell_equals`: `Cell.equals`, postcondición Daikon **demasiado fuerte** (`value ∈ {2,4,2048}`). Se espera un contraejemplo como `(8, 8)`.
3. `merge_value`: `Cell.mergeWith`, postcondición razonable (`2*a == result`) que esconde el desborde de `int` con `2^30`.

## Tests

`python3 -m unittest oasis/test_oasis.py` prueba la tubería con un LLM falso. Verifican el código de la herramienta, no a ningún modelo real.
