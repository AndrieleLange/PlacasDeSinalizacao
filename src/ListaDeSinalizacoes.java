import java.time.LocalDate;
/**
 * aqui deve ser uma lista de encadeamento simples
 * onde vamos salvar as informações de uma sinalização
 * 
 * ainda falta entender como que vamos linkar
 * essa lista com a lista duplamente encadeada
 */
public class ListaDeSinalizacoes {
    private class Node {
        public Sinalizacao element;
        public Node next;
        public Node(Sinalizacao element){
            this.element = element;
            next = null;
        }
        public Node(Sinalizacao element, Node next){
            this.element = element;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private Node current;
    private int count;
   

    public ListaDeSinalizacoes() {//iniciar uma lista de sinalizações
        head = null;
        tail = null;
        count = 0;
    }

    //acredito que aqui a gente não precisa se preocupar em add
    //infos que são iguais
    public void add(Sinalizacao sin){
        Node n = new Node(sin);
        if(head == null){
            head = n;
        } else{
            tail.next = n;
        }
        tail = n;
        count++;
    }

	public int size(){// retorna o total de sinalizações
        return count;
    } 

    //acredito que este seja o reset pedido
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }  


    // public LocalDate getMes(int index){// retorna o mês de implantação da iésima sinalização 
    //     LocalDate mes;
    //     for(int i = 0; i< count; i++){
    //         //if()

    //     }

    //     return mes;
    // }

    /**

	// Métodos
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


     */

}