# Trabalho1-LFA
## Definição do Autômato a partir do Arquivo CSV

O autômato finito determinístico (AFD) utilizado neste projeto é definido por meio de um arquivo `.csv`, no qual cada linha e coluna representa uma parte da estrutura formal do autômato.

### Formato do Arquivo CSV

O arquivo deve seguir a seguinte estrutura:

- **Linha 1:** representa o **conjunto de estados finais**. Cada número separado por ´;´ representa o índice de um estado final.
- **Demais linhas:** cada linha representa um **estado**, onde:
  - A **coluna 1** indica o **estado de destino** ao receber o símbolo `'a'`.
  - A **coluna 2** indica o **estado de destino** ao receber o símbolo `'b'`.
  - Se houver mais símbolos no alfabeto, as colunas subsequentes representam as transições desses símbolos.

### Exemplo

Considerando o autômato: `Automato1.csv`:

Temos:

- O **estado 3** é o **único estado final**.
- O autômato possui **4 estados** (`0`, `1`, `2`, `3`), e o **estado inicial é o `0`** (primeira linha após os estados finais).
- O alfabeto é `{a, b}`, com:
  - Coluna 1 → transição com símbolo `'a'`
  - Coluna 2 → transição com símbolo `'b'`

As transições são:

- Estado 0: `'a' → 1`, `'b' → 2`
- Estado 1: `'a' → 3`, `'b' → 2`
- Estado 2: `'a' → 1`, `'b' → 3`
- Estado 3: `'a' → 3`, `'b' → 3`


