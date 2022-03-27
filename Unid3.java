import java.util.*;

public class Unid3 {
  public static void main(String[] args) {
    List<Integer> listaNumeros = new ArrayList<>();
    Stack<Integer> pilhaNumeros = new Stack<>();
    Queue<Integer> filaNumeros = new LinkedList<>();
    int i;

    // Passo 1: Inserindo os números [1, 2, 3, 4 e 5] na lista
    for (i = 1; i <= 5; i++) {
      listaNumeros.add(i);
      // Iterações da lista
      System.out.print("\nIterando a lista de números: " + listaNumeros);
    }
    System.out.print("\n ");

    // Passo 2: Remova todos os dados da lista e insira-os em uma estruturas.Pilha -
    // com 5 células.
    while (!listaNumeros.isEmpty()) {
      // Mostrar o esvaziamento da lista
      System.out.print("\nRemovendo números da lista: " + listaNumeros);
      // Removendo o próximo elemento da lista e dando para uma variável temporário
      int elementoLista = listaNumeros.remove(0);

      // Adicionando o elemento da lista à pilha na ordem
      pilhaNumeros.push(elementoLista);
      // Imprimindo o número da lista na ordem
      System.out.println("\nAdicionando os números na pilha: " + pilhaNumeros);
    }
    System.out.print("Número de elementos da pilha: " + pilhaNumeros.size());

    System.out.print("\n ");

    // Passo 3: Remova os dados da estruturas.Pilha e insira-os em uma estruturas.
    // Fila - com 10 células.
    // As filas são dinâmicas, então não precisamos previamente declarar a
    // quantidade de elementos que ela contém.

    // Percorrer a pilha para esvaziá-la.
    while (!pilhaNumeros.isEmpty()) {
      // Mostrar o esvaziamento da pilha.
      System.out.print("\nRemovendo números da pilha: " + pilhaNumeros);
      // Removendo o elemento da pilha e dando para uma variável temporária
      int elementoPilha = pilhaNumeros.pop();
      // Adicionando o número da pilha à fila na ordem.
      filaNumeros.add(elementoPilha);
      System.out.println("\nAdicionando os números na fila: " + filaNumeros);
    }
    System.out.print("Número de elementos da fila: " + filaNumeros.size());

    // Repetindo passos 2 e 3 com os números [6, 7, 8, 9 e 10];

    // Inserindo os números [6, 7, 8, 9 e 10] na lista
    for (i = 6; i <= 10; i++) {
      listaNumeros.add(i);
    }
    System.out.println("A lista de números com os números de 6 a 10: " + listaNumeros);
    System.out.print("\n ");

    // Passo 2: Remova todos os dados da lista e insira-os em uma estruturas. Pilha
    // -
    // com 5 células.
    while (!listaNumeros.isEmpty()) {
      // Mostrar o esvaziamento da lista
      System.out.print("\nRemovendo números da lista: " + listaNumeros);
      // Removendo o próximo elemento da lista e dando para uma variável temporário
      int elementoLista = listaNumeros.remove(0);

      // Adicionando o elemento da lista à pilha na ordem
      pilhaNumeros.push(elementoLista);
      // Imprimindo o número da pilha na ordem
      System.out.println("\nAdicionando os números na pilha: " + pilhaNumeros);
    }
    System.out.print("Número de elementos da pilha: " + pilhaNumeros.size());
    System.out.print("\n ");

    System.out.print("\nA fila de números antes da inserção dos números de 6 a 10: " + filaNumeros);
    while (!pilhaNumeros.isEmpty()) {
      // Removendo o elemento da pilha e dando para uma variável temporária
      int elementoPilha = pilhaNumeros.pop();
      // Adicionando o número da piljha à fila na ordem
      filaNumeros.add(elementoPilha);
      // Imprimindo o número da fila na ordem
      System.out.print("\nA fila de números é: " + filaNumeros);
    }

  }
}