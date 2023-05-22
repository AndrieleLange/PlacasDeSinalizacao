public class Rua {
    private ListaDeSinalizacoes lista;
    private String nomeDaRua;//(Av, Rua, Trav, ...)
    private String logradouro; 


	public Rua(ListaDeSinalizacoes lista, String nomeDaRua, String logradouro) {
        this.lista = lista;
        this.nomeDaRua = nomeDaRua;
        this.logradouro = logradouro;
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
        if(logradouro.equals(sinal.getlogradouro()) && nomeDaRua.equals(sinal.getId()))

        this.lista.add(sinal);
    }


    @Override
    public String toString() {
        return "\n================================================================================================================"
         +"\n"+ nomeDaRua + " " + logradouro + " "+ lista.toString()+
         "\n==========================================================================================================================";
    }

    
}
