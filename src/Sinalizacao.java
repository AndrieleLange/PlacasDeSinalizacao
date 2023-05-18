import java.time.LocalDate;
/**
 * falta o toString
 * 
 * provavelmente devemos adicionar setters também
 */

public class Sinalizacao {

    private String id;
    private String logradouro;
    private String descricao;
    private LocalDate implantacao;
    private String lado;
    private String localDeInstalacao;

    public Sinalizacao(String descricao, LocalDate implantacao,String lado,
            String localDeInstalacao, String logradouro,String id) {
        this.descricao = descricao;
        this.implantacao = implantacao;
        this.lado = lado;
        this.localDeInstalacao = localDeInstalacao;
        this.logradouro = logradouro;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public String getlogradouro(){
        return logradouro;
    }

    @Override
    public String toString() {
        return "\n Sinalizacao:" + descricao + " implantacao: " + implantacao  + ", lado: " + lado + ", localDeInstalacao: " + localDeInstalacao +"\n" ;
    }



    //Métodos get e toString (para data de implantação, imprimir dd/mm/aa)
}
