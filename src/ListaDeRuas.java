public class ListaDeRuas {
/**
 * mais um problema
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
	public String next() {
        if (current != trailer) {
            String ruaAVTravSla = current.nomeDaRua;
            current = current.next;
            return ruaAVTravSla;
        }
        return null;
    } 

	// prev()

	// String getRuaComMaisSinalizacoes ()
	
	
	// toString
}
