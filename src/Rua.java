public class Rua {
    private ListaDeSinalizacoes lista;
    private String nomeDaRua;
    private String idDaRua; //(Av, Rua, Trav, ...)


	public Rua(ListaDeSinalizacoes lista, String nomeDaRua, String idDaRua) {
        this.lista = lista;
        this.nomeDaRua = nomeDaRua;
        this.idDaRua = idDaRua;
    }


    public ListaDeSinalizacoes getLista() {
        return lista;
    }

    //pra poder retornar a sinalização e salvar caso já tenha na lista 
    

    public String getNomeDaRua() {
        return nomeDaRua;
    }


    public String getIdDaRua() {
        return idDaRua;
    }

    //adiciona na lista a sinalização
    public void addLista(Sinalizacao sinal){
        if(idDaRua.equals(sinal.getlogradouro()) && nomeDaRua.equals(sinal.getId()))

        this.lista.add(sinal);
    }


    @Override
    public String toString() {
<<<<<<< HEAD
        return "\n =========================================================================================="+
        "\n Rua:  " + nomeDaRua + "." + idDaRua + " Sinalizações: " + lista.toString() + 
        "  ==================================================================================================";
=======
        return "\n================================================================================================================"
         +"\n"+ nomeDaRua + "." + idDaRua + " "+ lista.toString()+
         "\n==========================================================================================================================";
>>>>>>> 6e9e87443b803868f76e3645a2f514b97da0d008
    }

    
}
