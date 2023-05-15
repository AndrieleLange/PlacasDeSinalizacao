import java.time.LocalDate;


public class Sinalizacao {
    
    private String descricao;
    private LocalDate implantacao;
    private int numInicial;
    private int numFinal;
    private int count = 0;//não parece certo pq não sria salvo em um array
    //private ---- lado;
    //private ---- localDeInstalacao;
    
    public Sinalizacao(String desc, LocalDate impl, int numI, int numF){
        descricao = desc;
        implantacao = impl;
        numInicial = numI;
        numFinal = numF;

        count++;
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
}
