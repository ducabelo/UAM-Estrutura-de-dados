# Estrutura de Dados - Atividade 3 - Universidade Anhembi Morumbi.

## Enunciado

Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
- Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
- Passo 2: Remova todos os dados da lista e insira-os em uma estruturas.Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
- Passo 3: Remova os dados da estruturas.Pilha e insira-os em uma estruturas.Fila - com 10 células); 
- Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
- Passo 5: Repita os passos 2 e 3. 
- Passo 6: Exiba todos os números que foram inseridos na fila. 
 
Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 
 
 
## Resposta:

Nas estruturas de dados pedidas no enunciado temos os seguintes conceitos de ordenação:

A Lista é ordenada, portanto a ordem em que insiro os elementos será mantida ao usar um laço para iterar sobre os elementos.

Na Pilha temos o conceito LIFO (Last In First Out - Último a entrar, Primeiro a Sair), portando as iterações irão seguir esse conceito.

E na Fila usamos o FIFO (First In First Out - Primeiro a entrar, Primeiro a Sair), o que também será respeitado ao iterar sobre está estrutura.

Portanto, na nossa ordem primeiro passamos por uma Lista, depois colocamos os elementos dessa Lista em ordem em uma Pilha, esvaziando a Lista e depois os colocamos em uma Fila, esvaziando a Pilha. 


A ordem da lista será:
```
1 2 3 4 5
```
Ou seja, manteve a ordem de inserção e o primeiro a ser colocado também foi o primeiro a sair.

Removemos os elementos da lista a partir sempre do 1º elemento, método remove(0), e a transferimos para a pilha.
A impressão da pilha mostra que a ordem dos elementos estão na ordem inicial, isto porque a ordem de saída da lista é a mesma da entrada, ou seja, o que entra primeiro saíu primeiro porque assim o quisemos por conta do remove(index: 0), mostrado acima.
```
1 2 3 4 5 
```

Ao retirarmos os elementos da pilha, usando o método pop(), e inserindo os elementos na fila, teremos:
```
5 4 3 2 1 
```
Isto aconteceu porque na pilha o que entra por último, saí primeiro, em outras palavras, a ordem dos elementos foi invertida.


Depois repetimos os passos 2 e 3, mas desta vez criaremos uma nova lista com os númetos de 6 a 10.

```
6 7 8 9 10
```

Removemos os elementos da lista a partir sempre do 1º elemento, método remove(0), e a transferimos para a pilha.
```
6 7 8 9 10 
```

Ao retirarmos os elementos da pilha, usando o método pop(), e inserindo os elementos na fila, teremos:
```
5 4 3 2 1 10 9 8 7 6
```
Sempre lembrando que quando extraímos elementos da pilha, o último elemento a entrar é o primeiro a sair.