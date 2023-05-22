import java.time.LocalDate;


public class Sinalizacao {

    private String nomeRua;
    private String logradouro;
    private String descricao;
    private LocalDate implantacao;
    private String lado;
    private String localDeInstalacao;
   


    public Sinalizacao(String descricao,String lado,
            String localDeInstalacao, String logradouro,String nomeRua,LocalDate implantacao) {
        this.descricao = descricao;
        this.implantacao = implantacao;
        this.lado = lado;
        this.localDeInstalacao = localDeInstalacao;
        this.logradouro = logradouro;
        this.nomeRua= nomeRua;
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

    public String getNomeRua() {
        return nomeRua;
    }

    public String getlogradouro(){
        return logradouro;
    }

    @Override
    public String toString() {
        return "\n Data de implantação: " +implantacao+ "\n Sinalizacao:" + descricao + ", lado: " + lado + ", localDeInstalacao: " + localDeInstalacao +"\n" ;
    }



    
}
