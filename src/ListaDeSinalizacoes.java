import java.time.LocalDate;


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
  private Node current ;
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

  public Sinalizacao getHead() {
    return head.element;
  }

  public Sinalizacao getTail() {
    return tail.element;
  }

  public int getMesMaisSinalizacoes() {
    if (head == null) {
        return -1; // Lista vazia, nenhum mês com sinalizações
    }

    int[] meses = new int[12]; // Array para contar as sinalizações por mês
    LocalDate ero = LocalDate.of(1, 1, 1);

    Node current = head;
    while (current != null) {
      if(current.element.getImplantacao()!=ero){
        LocalDate dataImplantacao = current.element.getImplantacao();
        int mes = dataImplantacao.getMonthValue();
        meses[mes - 1]++;
        current = current.next;
      }
    }

    int mesMaisSinalizacoes = 0;
    int maxSinalizacoes = 0;

    for (int i = 0; i < meses.length; i++) {
        if (meses[i] > maxSinalizacoes) {
            maxSinalizacoes = meses[i];
            mesMaisSinalizacoes = i + 1;
        }
    }

    return mesMaisSinalizacoes;
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


public void setCurrent(Node node) {
  current = node;
}

public Node getCurrentNode() {
  return current;
}

public void concatenar(ListaDeSinalizacoes outraLista) {
  if (head == null) {
    head = outraLista.head;
    tail = outraLista.tail;
  } else {
    tail.next = outraLista.head;
    tail = outraLista.tail;
  }
  count += outraLista.count;
}

public Sinalizacao getCurrent() {
  if (current != null) {
      return current.element;
  } else {
      return null;
  }
}

public Sinalizacao next() {
  if (current != null && current.next != null) {
      current = current.next;
      return current.element;
  } else {
      return null;
  }
}

public Sinalizacao prev() {
  if (current != null && current != head) {
      Node prevNode = head;
      while (prevNode.next != current) {
          prevNode = prevNode.next;
      }
      current = prevNode;
      return current.element;
  } else {
      return null;
  }
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
  

}


