public class App {
    public static void main(String[] args) throws Exception {
        Sinalizacao t = new Sinalizacao("swdewe", null, "n232", "null");
        ListaDeSinalizacoes ts = new ListaDeSinalizacoes();
        ts.add(t);
        Rua rU = new Rua(ts, "av sss", "err");
        ListaDeRuas r = new ListaDeRuas();
        r.orderedAdd(rU);
        

        LeituraArquivo l = new LeituraArquivo();

        System.out.println(l.toString());
      
        
    }

    // Poderiam ser duas classes
	// Leitura do arquivo e a colocação das informações na lista
	// Menu de opções
}
