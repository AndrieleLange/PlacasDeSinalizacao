import java.time.LocalDate;

public class ListaDeSinalizacoes {
    private class Node {
        public Sinalizacao element;
        public Node next;
        public Node header;
        public Node taeil;
    }
    private int count = 0;//não parece certo pq não sria salvo em um array
    private String descricao;
    private LocalDate implantacao;
    private int numInicial;
    private int numFinal;
    //private ---- lado;
    //private ---- localDeInstalacao;

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