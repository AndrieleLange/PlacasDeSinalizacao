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
<<<<<<< HEAD
        return "\n Sinalizacao: " + descricao + ", implantacao: " + implantacao  + ", lado: " + lado + ", localDeInstalacao: " + localDeInstalacao + " ";
=======
        return "\n Data de implantação: " +implantacao+ "\n Sinalizacao:" + descricao + ", lado: " + lado + ", localDeInstalacao: " + localDeInstalacao +"\n" ;
>>>>>>> 6e9e87443b803868f76e3645a2f514b97da0d008
    }



    //Métodos get e toString (para data de implantação, imprimir dd/mm/aa)
}
