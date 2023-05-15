import java.time.LocalDate;

public class ListaDeSinalizacoes {
    private class Node {
        public Sinalizacao element;
        public Node next;
        public Node(String element){
            this.element = element;
            next = null;
        }
    }

    private Node head;
    private Node taeil;
    private Node current;
    private int count = 0;

    private String descricao;
    private LocalDate implantacao;
    private int numInicial;
    private int numFinal;
    private String lado;
    private String localDeInstalacao;

    

    public ListaDeSinalizacoes(String descricao, LocalDate implantacao, int numInicial, int numFinal, String lado,
            String localDeInstalacao) {
                head = new Node(null);
                taeil = new Node(null);
                head.next = taeil;
                taeil.next = head;
        this.implantacao = implantacao;
        this.numInicial = numInicial;
        this.numFinal = numFinal;
        this.lado = lado;
        this.localDeInstalacao = localDeInstalacao;
        count++;
    }
    /**
     * // Métodos
	add(sinalização)
    */
	public int size(){// retorna o total de sinalizações
        return count;
    } 
    public void reset() {
        current = header.next;
    }
     public String getDescricao() {
            return descricao;
        }
        public LocalDate getImplantacao() {
            return implantacao;
        }
        public int getNumInicial() {
            return numInicial;
        }
        public int getNumFinal() {
            return numFinal;
        }
        public int getCount() {
            return count;
        }

    // public int getMes(int index){// retorna o mês de implantação da iésima sinalização 
    //     int mes ;
    //     for(int i = 0; i< count; i++){
    //         //if()

    //     }

    //     return mes;
    // }

    /**
	
	public LocalDate getDataImplantacao(int index){ // retorna data de implantação da iésima 

//sinalização, para depois comparar qual 
// é maior ou menor
    }
	getMenorData() // retorna a data da primeira sinalização instalada 
// (considerando esta lista)

	getMaiorData() // retorna a data da última sinalização instalada 
// (considerando esta lista)
	
	next()
}


     */

}