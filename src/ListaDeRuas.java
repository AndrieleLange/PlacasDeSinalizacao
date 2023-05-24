import javax.lang.model.element.Element;

public class ListaDeRuas {

    private class Node {

        public Rua element;
        public Node next;
        public Node prev;

        public Node(Rua e) {
            element = e;
            next = null;
            prev = null;
        }
    }

    private Node header;
    private Node trailer;
    private Node current ;
    private int count;

    public ListaDeRuas() {
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
        
    
    }

    private Node containsElement(String element) {
        Node aux = header.next;

        while (aux != trailer) {
            if (aux.element.getId().equals(element)) {
                return aux;
            }
            aux = aux.next;
        }

        return null;
    }

    public Node getHeader() {
        return header;
    }

    public Node getTrailer() {
        return trailer;
    }

    public Rua getConteudoNoAtual() {
        if (current != header && current != trailer && current != null) {
            return current.element;
        }else
        current = header.next;
        
        return current.element;
    }

    public void orderedAdd(Rua element, Sinalizacao sem) {
        Node aux = containsElement(element.getId());

        // verifica se já contém o elemento para não inserir duplicado
        if (aux == null) { // se não contém o elemento, insere
            Node n = new Node(element);

            if (header.next == trailer) {
                // se a lista está vazia
                n.prev = header;
                n.next = trailer;
                trailer.prev = n;
                header.next = n;
            } else if (element.getId().compareTo(header.next.element.getId()) < 0) {
                // se for menor que o primeiro, insere no início
                n.next = header.next;
                n.prev = header;
                header.next.prev = n;
                header.next = n;
            } else if (element.getId().compareTo(trailer.prev.element.getId()) >= 0) {
                // se for maior ou igual ao último, insere no final
                n.next = trailer;
                n.prev = trailer.prev;
                trailer.prev.next = n;
                trailer.prev = n;
            } else {
                // senão, procura a posição correta para inserção
                aux = header.next;
                while (aux != trailer &&
                        element.getId().compareTo(aux.element.getId()) >= 0) {
                    aux = aux.next;
                }
                n.next = aux;
                n.prev = aux.prev;
                aux.prev.next = n;
                aux.prev = n;
            }
            count++;

            aux = n; // Atualiza a referência para o novo nó inserido
        }
        aux.element.addLista(sem);
    }

    /**
     * Inicializa o current na primeira posicao (para percorrer do inicio para o
     * fim).
     */
    public void reset() {
        if (header.next != trailer) {
            current = header.next;
        } else {
            current = null; // Caso a lista esteja vazia
        }
    }

    public int size(){
        return count;
    }

   

    public Rua next(ListaDeRuas r) {
        Node aux = r.getCurrentNode();
        Node ext = aux.next;
        if (aux!= trailer && ext != null) {
            Rua str =aux.element;
            r.setCurrent(ext);
            return str;
        }else
        aux = header.next;
        r.setCurrent(aux);
        return aux.element;
    }

    public Rua prev(ListaDeRuas r) {
        Node aux = r.getCurrentNode();
        Node ext = aux.prev;
        if (aux!= header && ext != null) {
            Rua str =aux.element;
            r.setCurrent(ext);
            return str;
        }else 
        aux = trailer.prev;
        r.setCurrent(aux);
        return aux.element;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public Node getCurrentNode() {
        return current;
    }

    
    public Rua getRuaComMaisSinalizacoes() {
        Node aux = header.next;
        Node ruaComMaisSinalizacoes = null;
        int maxSinalizacoes = 0;

        while (aux != trailer) {
            int numSinalizacoes = aux.element.getLista().size();
            if (numSinalizacoes > maxSinalizacoes) {
                maxSinalizacoes = numSinalizacoes;
                ruaComMaisSinalizacoes = aux;
            }
            aux = aux.next;
        }

        if (ruaComMaisSinalizacoes != null) 
            return (ruaComMaisSinalizacoes.element);

       return null; 
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node aux = header.next;
        while (aux != trailer) {
            Rua teste = aux.element;
            sb.append("\n" + teste.toString());
            aux = aux.next;
        }
        return sb.toString();
    }

}
