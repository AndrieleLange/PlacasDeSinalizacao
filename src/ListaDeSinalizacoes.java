public class ListaDeSinalizacoes {
    private class Node {
        public Sinalizacao element;
        public Node next;
    }
    private int count;

    /**
     * // Métodos
	add(sinalização)
    */
	public int size(){// retorna o total de sinalizações
        return count;
    } 

    // public int getMes(int index){
    //     int mes ;
    //     for(int i = 0; i< count; i++){
    //         //if()

    //     }

    //     return mes;
    // }

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

  public class ListaDeSinalizacoes {    
        private String descricao;
        private LocalDate implantacao;
        private int numInicial;
        private int numFinal;
        private int count = 0;//não parece certo pq não sria salvo em um array
        //private ---- lado;
        //private ---- localDeInstalacao;
    
    
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

}

     */

}