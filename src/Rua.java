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
    public Sinalizacao getSinalizacao(){
        return lista.get1sinal();
    }


    public String getNomeDaRua() {
        return nomeDaRua;
    }


    public String getIdDaRua() {
        return idDaRua;
    }

    //adiciona na lista a sinalização
    public void setLista(Sinalizacao sinal){
        this.lista.add(sinal);
    }

    
}
