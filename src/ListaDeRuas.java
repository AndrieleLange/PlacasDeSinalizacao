public class ListaDeRuas {
	private Node header;
	private Node trailer;
	private Node current;//posição corrente
	private int count;

	private class Node {	
		public Node prev;
		public Node next;
		public ListaDeSinalizacoes lista;
		public String nomeDaRua;
		public String idDaRua; //(Av, Rua, Trav, ...)
		public Node(String rua, String id) {
            nomeDaRua = rua;
			idDaRua = id;
            next = null;
            prev = null;
			//acho que tem que add aqui tmb a lista de sinalizações
        }
	}

	public ListaDeRuas() {
        header = new Node(null, null);
        trailer = new Node(null, null);
        header.next = trailer;
        trailer.prev = header;
        count = 0;
    }

	public void add(String logradouro, String id) {
        Node n = new Node(logradouro, id);
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
