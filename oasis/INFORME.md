# Ejercicio 2: herramienta tipo OASIs

## Qué hace la herramienta

Dado un método Java y una aserción (postcondición) sobre su resultado, ayuda a decidir si la aserción es demasiado fuerte o demasiado débil. Usa un LLM solo para proponer; todo lo que reporta se comprueba ejecutando código Java real.

1. **Aserción demasiado fuerte (falso positivo).** El LLM propone entradas que cumplen la precondición. La herramienta genera un `Harness.java`, lo compila junto al método y lo ejecuta. Las entradas que violan la aserción se reportan.
2. **Aserción demasiado débil (falso negativo).** El LLM propone mutantes del método. Se compilan y se corren sobre las mismas entradas. Un mutante que no viola la aserción y difiere del original en alguna entrada es un mutante sobreviviente no equivalente: la aserción no lo detecta.
3. **Feedback.** Con la evidencia anterior, el LLM explica el problema y sugiere aserciones nuevas.
4. **El usuario decide.** La herramienta nunca modifica la aserción. Con `--interactive` se puede escribir una nueva y repetir el ciclo.

Archivos: `llm.py` (cliente de la API, compatible con OpenAI), `javaharness.py` (generación, compilación y ejecución), `refiner.py` (el ciclo y el reporte). Solo usa la librería estándar de Python.

Uso: `python3 oasis/refiner.py oasis/cases/<caso>/case.json --model <modelo> --report <archivo.md>` con `OPENROUTER_API_KEY` en el entorno.

## Casos de estudio

Modelo usado: `nvidia/nemotron-3-ultra-550b-a55b:free` (OpenRouter, sin costo). Los casos salen de los invariantes que Daikon infirió en el TP4.

| Caso | Aserción | Resultado de la herramienta |
|---|---|---|
| `can_merge` (`Cell.canMergeWith`) | `!result \|\| (a == b && a >= 2)` | Débil: 5 mutantes sobrevivientes (no fusionar 2,2, 4,4, 8,8, 16,16, o exigir valor ≥ 4; el que siempre da `false`). Sugirió `result == (a == b && a >= 2)`. |
| `cell_equals` (`Cell.equals`) | `!result \|\| a == 2 \|\| a == 4 \|\| a == 2048` | Fuerte: 15 entradas, como (0,0), (8,8), (16,16), la violan. También débil: 5 mutantes sobreviven (por ejemplo el que solo da `true` para 2, 4 y 2048), todos distintos del original en (0,0). Sugirió `result == (a == b)`. |
| `merge_value` (`Cell.mergeWith`) | `(long) result == 2L * a` | Fuerte: la entrada (2^30, 2^30) devuelve -2147483648 y la viola. 3 mutantes detectados; 2 descartados por equivalentes (solo agregan un contador o una bandera estática). |

Reportes completos: `report-can_merge.md`, `report-cell_equals.md`, `report-merge_value.md`.

## Qué aprendimos

- **Funciona como ayuda, no como oráculo.** En los tres casos encontró evidencia ejecutable y sugerencias útiles.
- **Interpretar sigue siendo trabajo humano.** En `merge_value` la herramienta encontró la entrada clave (2^30), pero el LLM concluyó que "el programa implementa correctamente el doblado con overflow". En realidad es un bug real: `Cell.mergeWith` con dos celdas de 2^30 produce un valor negativo y lanza excepción (el mismo problema que el fuzzer de tableros del Ejercicio 1 encontró por otro camino, y que ahí se evitó acotando las fichas iniciales a `Board.MAX_INITIAL_TILE`). La evidencia fue correcta; la conclusión del LLM no. Por eso la decisión final es del usuario.
- **Una aserción solo ve lo que habla su método.** La sugerencia `result == (a == b && a >= 2)` para `can_merge` es consistente con el código actual, pero no detecta el desborde: `canMergeWith(2^30, 2^30)` devuelve `true` y recién `mergeWith` falla. Ese problema solo aparece al revisar una aserción sobre `mergeWith` (caso `merge_value`).

## Limitaciones

- **Equivalentes sospechosos.** Un mutante que se comporta igual sobre las entradas probadas se descarta como posiblemente equivalente. Puede ser un mutante real que ninguna entrada distingue. En `merge_value` se descartaron 2 así, y son equivalentes de verdad (solo agregan un efecto secundario). Un mutante cuyo resultado difiere del original **no** se descarta aunque el original ya viole la aserción en esa entrada.
- **Dependencia de lo que proponga el LLM.** Cuantas más y mejores entradas, mejor la detección. En una corrida de `can_merge` el LLM no dio ninguna entrada usable y solo se ejecutaron las 4 entradas que acompañaban a los mutantes: igual aparecieron los 5 sobrevivientes, pero con menos margen.
- **No determinista.** Otro modelo u otra corrida puede proponer otras entradas y mutantes.
- **Alcance.** Solo métodos Java con parámetros y retorno simples, sin estado. Los casos fueron portados a funciones estáticas con la misma lógica que el original.
- **Modelo gratis.** Sujeto a límites de uso; las corridas pueden tardar por reintentos.

## Verificación sin LLM

`python3 -m unittest oasis/test_oasis.py` prueba el ciclo completo con un LLM simulado (3 tests), de modo que el código se puede validar sin API key.

## Corrección posterior

En una revisión se encontró un bug del clasificador de mutantes: las entradas donde el original ya violaba la aserción no se tenían en cuenta, y un mutante que difería justo ahí se descartaba como "equivalente". Afectaba a `merge_value` (3 de los 4 descartados diferían en 2^30) y a `cell_equals`. Se corrigió en `refiner.py`, se agregaron 2 tests que lo reproducen y se regeneraron los tres reportes.
