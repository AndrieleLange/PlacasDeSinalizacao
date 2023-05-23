public class Rua {
    private ListaDeSinalizacoes lista;
    private String nomeDaRua;
    private String logradouro; //(Av, Rua, Trav, ...)
    private String id;


	public Rua(ListaDeSinalizacoes lista, String nomeDaRua, String logradouro) {
        this.lista = lista;
        this.nomeDaRua = nomeDaRua;
        this.logradouro = logradouro;
        this.id = logradouro + " " + nomeDaRua;
    }


    public ListaDeSinalizacoes getLista() {
        return lista;
    }

    //pra poder retornar a sinalização e salvar caso já tenha na lista 
    

    public String getNomeDaRua() {
        return nomeDaRua;
    }


    public String getlogradouro() {
        return logradouro;
    }

    //adiciona na lista a sinalização
    public void addLista(Sinalizacao sinal){
        if(logradouro.equals(sinal.getlogradouro()) && nomeDaRua.equals(sinal.getNomeRua()))

        this.lista.add(sinal);
    }


    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "\n================================================================================================================"
         +"\n"+ id  +
          " "
          + lista.toString()+
         "\n==========================================================================================================================";
    }

    
}
