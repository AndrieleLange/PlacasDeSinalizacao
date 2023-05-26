ppublic class Rua {
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
    StringBuilder sb = new StringBuilder();
    sb.append("\n================================================================================================================");
    sb.append("\n").append(id);
    sb.append("\nPrimeira Sinalização: ").append(lista.getHead().toString());
    sb.append("\nUltima Sinalização: ").append(lista.getTail().toString());
    sb.append("\nNúmero de Sinalizações: ").append(lista.size());
    sb.append("\n==========================================================================================================================");
    return sb.toString();
}
}
