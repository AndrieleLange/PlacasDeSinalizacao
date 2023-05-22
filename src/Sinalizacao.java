import java.time.LocalDate;


public class Sinalizacao {

    private String id;
    private String logradouro;
    private String descricao;
    private LocalDate implantacao;
    private String lado;
    private String localDeInstalacao;
   


    public Sinalizacao(String descricao,String lado,
            String localDeInstalacao, String logradouro,String id,LocalDate implantacao) {
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
        return "\n Data de implantação: " +implantacao+ "\n Sinalizacao:" + descricao + ", lado: " + lado + ", localDeInstalacao: " + localDeInstalacao +"\n" ;
    }



    
}
