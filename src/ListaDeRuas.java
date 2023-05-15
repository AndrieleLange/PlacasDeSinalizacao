public class ListaDeRuas {

    private ListaSinalizacoes lista;
    private String nomeDaRua;
    private String idDaRua; //(Av, Rua, Trav, ...)
    private LinkedListOfString list;
    

	public ListaDeRuas(ListaSinalizacoes lista, String nomeDaRua, String idDaRua) {
        this.lista = lista;
        this.nomeDaRua = nomeDaRua;
        this.idDaRua = idDaRua;
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
