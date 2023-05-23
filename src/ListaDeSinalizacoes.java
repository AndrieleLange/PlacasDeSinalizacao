import java.time.LocalDate;
import java.time.Month;

/**
 * aqui deve ser uma lista de encadeamento simples
 * onde vamos salvar as informações de uma sinalização
 *
 *
 */
public class ListaDeSinalizacoes {

  private class Node {

    public Sinalizacao element;
    public Node next;

    public Node(Sinalizacao element) {
      this.element = element;
      next = null;
    }
  }

  private Node head;
  private Node tail;
  private int count;

  public ListaDeSinalizacoes() { //iniciar uma lista de sinalizações
    head = null;
    tail = null;
    count = 0;
  }

  //pra pegar a primeira sinalização (que  no caso seria única)
  public Sinalizacao get1sinal() {
    return head.next.element;
  }

  public void add(Sinalizacao sin) {
    Node n = new Node(sin);
    if (head == null) {
      head = n;
    } else {
      tail.next = n;
    }
    tail = n;
    count++;
  }

  public int size() { // retorna o total de sinalizações
    return count;
  }

  //acredito que este seja o reset pedido
  public void clear() {
    head = null;
    tail = null;
    count = 0;
  }

  public Month getMes(int index) {
    if (index >= 0 && index < count) {
        Node aux = head;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }
        LocalDate dataImplantacao = aux.element.getImplantacao();
        return dataImplantacao.getMonth();
    }
    return null;
}

public LocalDate getMenorData() {
  if (head == null) {
      return null; // Lista vazia
  }

  LocalDate menorData = head.element.getImplantacao();
  Node current = head.next;

  while (current != null) {
      LocalDate data = current.element.getImplantacao();
      if (data.isBefore(menorData)) {
          menorData = data;
      }
      current = current.next;
  }

  return menorData;
}

public LocalDate getMaiorData() {
  if (head == null) {
      return null; // Lista vazia
  }

  LocalDate maiorData = head.element.getImplantacao();
  Node current = head.next;

  while (current != null) {
      LocalDate data = current.element.getImplantacao();
      if (data.isAfter(maiorData)) {
          maiorData = data;
      }
      current = current.next;
  }

  return maiorData;
}


  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    Node aux = head;

    while (aux != null) {
      Sinalizacao tt = aux.element;
      s.append("\n" + tt.toString());
      aux = aux.next;
    }

    return s.toString();
  }
  // public LocalDate getMes(int index){// retorna o mês de implantação da iésima sinalização
  //     LocalDate mes;
  //     for(int i = 0; i< count; i++){
  //         //if()

  //     }

  //     return mes;
  // }

  /**

	// Métodos
	int getMes(index) // retorna o mês de implantação da iésima sinalização 

	LocalDate getDataImplantacao(index) // retorna data de implantação da iésima 
//sinalização, para depois comparar qual 
// é maior ou menor

	getMenorData() // retorna a data da primeira sinalização instalada 
// (considerando esta lista)

	getMaiorData() // retorna a data da última sinalização instalada 
// (considerando esta lista)
	
reset()

	next()
}


     */

}
