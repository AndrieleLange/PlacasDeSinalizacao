import java.time.LocalDate;

public class Sinalizacao {
    private String descricao;
    private LocalDate implantacao;
    private int numInicial;
    private int numFinal;
    //private ---- lado;
    //private ---- localDeInstalacao;
    public Sinalizacao(String descricao, LocalDate implantacao, int numInicial, int numFinal) {
        this.descricao = descricao;
        this.implantacao = implantacao;
        this.numInicial = numInicial;
        this.numFinal = numFinal;
        //this.lado = lado;
        //this.localDeInstalacao = localDeInstalacao;

    }

    public class ListaDeSinalizacoes {
        private class Node {
            public Sinalizacao element;
            public Node next;
        }

    

}
