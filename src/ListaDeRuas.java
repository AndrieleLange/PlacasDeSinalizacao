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

    
  
    private Node containsElement(Rua element) {
        Node aux = header.next;
        
        while (aux != trailer) {
            if (aux.element.equals(element)) {
                return aux;
            }
            aux = aux.next;
        }
        
        return null;
    }  


    public void orderedAdd(Rua element)  { 
        Node aux = containsElement(element); // verifica se ja contem element para não inserir duplicado
        if (aux == null) {  // se nao contem element, insere
            Node n = new Node(element);

            if (header.next == trailer) { 
                // se a lista está vazia
                n.prev = header;
                n.next = trailer;
                trailer.prev = n;
                header.next = n;

            } 
            else if (element.compareTo(header.next.element)<0) { 
                // se for menor que o primeiro, insere no inicio
                n.next = header.next;
                n.prev = header;
                header.next = n;
                n.next.prev = n;
            }
            else if (element.compareTo(trailer.prev.element)>0) {
                // se for maior que o ultimo, insere no final
                n.next = trailer;
                n.prev = trailer.prev;
                trailer.prev.next = n;
                trailer.prev = n;
            }
            else {
                // senao procura a posicao correta para insercao
                aux = header.next;
                boolean inseriu=false;
                while (aux!=trailer && !inseriu) {
                    if (element.compareTo(aux.element)<0) {
                        inseriu = true;
                        n.next = aux;
                        n.prev=aux.prev;
                        aux.prev.next = n;
                        aux.prev = n;
                    }
                    aux = aux.next;
                }
            }
            count++;
        }
    }
	public void add(Rua r) {
        Node n = new Node(r);
        n.next = trailer;
        n.prev = trailer.prev;
        trailer.prev.next = n;
        trailer.prev = n;
        count++;
    }

	
	// reset()
	/**
     * Inicializa o current na primeira posicao (para percorrer do inicio para o fim).
     */
    public void reset() {
        current = header.next;
    }

	// contains(nome da rua)	// fazer primeiro pra usar depois


	// insereOrdenado(idDaRua, nome da rua, Sinalizacao) // procura pela rua, se já tem 
	// 			// insere a nova sinalização; se não tem, cria um novo nodo
	// usar o contains aqui

	// next()
	//não entendi pra que isso serve
	/*public String next() {
        if (current != trailer) {
            String ruaAVTravSla = current.next();
            current = current.next;
            return ruaAVTravSla;
        }
        return null;
    } */

	// prev()

	// String getRuaComMaisSinalizacoes ()
	
	
	// toString
}
