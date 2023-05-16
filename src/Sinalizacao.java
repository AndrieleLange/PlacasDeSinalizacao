import java.time.LocalDate;
/**
 * falta o toString
 * 
 * provavelmente devemos adicionar setters também
 */

public class Sinalizacao {
    
    private String descricao;
    private LocalDate implantacao;
    private double numInicial;
    private double numFinal;
    private String lado;
    private String localDeInstalacao;

    public Sinalizacao(String descricao, LocalDate implantacao, int numInicial, int numFinal, String lado,
            String localDeInstalacao) {
        this.descricao = descricao;
        this.implantacao = implantacao;
        this.numInicial = numInicial;
        this.numFinal = numFinal;
        this.lado = lado;
        this.localDeInstalacao = localDeInstalacao;
    }

    public String getDescricao() {
        return descricao;
    }
    public LocalDate getImplantacao() {
        return implantacao;
    }
    public double getNumInicial() {
        return numInicial;
    }
    public double getNumFinal() {
        return numFinal;
    }

    public String getLado() {
        return lado;
    }

    public String getLocalDeInstalacao() {
        return localDeInstalacao;
    }

    //Métodos get e toString (para data de implantação, imprimir dd/mm/aa)
}
