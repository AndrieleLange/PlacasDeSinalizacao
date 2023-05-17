import java.time.LocalDate;
/**
 * falta o toString
 * 
 * provavelmente devemos adicionar setters também
 */

public class Sinalizacao {
    
    private String descricao;
    private LocalDate implantacao;
    private String lado;
    private String localDeInstalacao;

    public Sinalizacao(String descricao, LocalDate implantacao,String lado,
            String localDeInstalacao) {
        this.descricao = descricao;
        this.implantacao = implantacao;
        this.lado = lado;
        this.localDeInstalacao = localDeInstalacao;
    }

    public String getDescricao() {
        return descricao;
    }
    public LocalDate getImplantacao() {
        return implantacao;
    }

    public String getLado() {
        return lado;
    }

    public String getLocalDeInstalacao() {
        return localDeInstalacao;
    }

    @Override
    public String toString() {
        return "Sinalizacao [descricao=" + descricao + ", implantacao=" + implantacao  + ", lado=" + lado + ", localDeInstalacao=" + localDeInstalacao + "]";
    }



    //Métodos get e toString (para data de implantação, imprimir dd/mm/aa)
}
