public class ListaDeRuas {
/**
 * mais um problema
 * 
 * tem que arrumar o odered sla oq 
 * 
 * 
 * não sei como que vamos fazer aquilo de fazer uma lista de sinalizações
 * pra uma rua, tipo como fazemos uma condição?
 */
    private class Node{
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
    private Node current;    
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
            if (aux.element.getNomeDaRua().equals(element)) {
                return aux;
            }
            aux = aux.next;
        }
        
        return null;
    }  


    	// insereOrdenado(idDaRua, nome da rua, Sinalizacao) // procura pela rua, se já tem 
	// 			// insere a nova sinalização; se não tem, cria um novo nodo
	// usar o contains aqui

    //usando como add()
    public void orderedAdd(Rua element, Sinalizacao sem) {
        Node aux = containsElement(element.getNomeDaRua());
    
        // verifica se já contém o elemento para não inserir duplicado
        if (aux == null) {  // se não contém o elemento, insere
            Node n = new Node(element);
            
            if (header.next == trailer) { 
                // se a lista está vazia
                n.prev = header;
                n.next = trailer;
                trailer.prev = n;
                header.next = n;
            } 
            else if (element.getNomeDaRua().compareTo(header.next.element.getNomeDaRua()) < 0) { 
                // se for menor que o primeiro, insere no início
                n.next = header.next;
                n.prev = header;
                header.next.prev = n;
                header.next = n;
            }
            else if (element.getNomeDaRua().compareTo(trailer.prev.element.getNomeDaRua()) >= 0) {
                // se for maior ou igual ao último, insere no final
                n.next = trailer;
                n.prev = trailer.prev;
                trailer.prev.next = n;
                trailer.prev = n;
            }
            else {
                // senão, procura a posição correta para inserção
                aux = header.next;
                while (aux != trailer && element.getNomeDaRua().compareTo(aux.element.getNomeDaRua()) >= 0) {
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
     * Inicializa o current na primeira posicao (para percorrer do inicio para o fim).
     */
    public void reset() {
        current = header.next;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node aux = header.next;
        while (aux != trailer) {
            Rua teste = aux.element;
            sb.append("\n"+teste.toString());
            aux = aux.next;
        }
        return sb.toString();
    }


	// next()
	//não entendi pra que isso serve

        
    } 
	// prev()

	// String getRuaComMaisSinalizacoes ()
	
	
	

