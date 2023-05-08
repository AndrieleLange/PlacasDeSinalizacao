import java.time.LocalDate;

public class Sinalizacao {
    private String descricao;
    private LocalDate implantacao;
    private int numInicial;
    private int numFinal;
    private int count = 0;
    //private ---- lado;
    //private ---- localDeInstalacao;
    public Sinalizacao(String descricao, LocalDate implantacao, int numInicial, int numFinal) {
        this.descricao = descricao;
        this.implantacao = implantacao;
        this.numInicial = numInicial;
        this.numFinal = numFinal;
        //this.lado = lado;
        //this.localDeInstalacao = localDeInstalacao;
        count++;
    }

    public class ListaDeSinalizacoes {
        private class Node {
            public Sinalizacao element;
            public Node next;
        }
    }

    /**
     * // Métodos
	add(sinalização)
    */
	public int size(){// retorna o total de sinalizações
        return count;
    } 

    /**
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
// Obs: Poderia ter uma classe Rua
public class ListaDeRuas {
	private class Node {	
		public Node prev
		public Node next
		public ListaDeSinalizacoes lista
		public String nomeDaRua
		public String idDaRua (Av, Rua, Trav, ...)
	}
	reset()
	next()
	prev()
	String getRuaComMaisSinalizacoes ()
	insereOrdenado(idDaRua, nome da rua, Sinalizacao) // procura pela rua, se já tem 
				// insere a nova sinalização; se não tem, cria um novo nodo
	contains(nome da rua)	
	toString
}

public class App { // Poderiam ser duas classes
	// Leitura do arquivo e a colocação das informações na lista
	// Menu de opções
}
     */

}
