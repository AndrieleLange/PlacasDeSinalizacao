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


    public String getNomeDaRua() {
        return nomeDaRua;
    }


    public String getIdDaRua() {
        return idDaRua;
    }

    
}
