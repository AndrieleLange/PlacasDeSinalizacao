
import java.util.Scanner;
import java.time.Month;

public class MenuApp {
    private ListaDeRuas listaRuas;
 

    public MenuApp(ListaDeRuas listaRuas){
        this.listaRuas = listaRuas;
        
    }

    public void exibirMenu() {
        bg();
        
       
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Rua/av/trav com mais registros de sinalizações");
            System.out.println("2. Modo navegação");            
            System.out.println("3. Mês com mais implantações no total");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                clearConsole();
                    verMaisSinal();
                    break;
                case 2:
                    clearConsole();
                    modoNavegação();
                    break;
                case 3:
                    clearConsole();
                    Month mon = Month.of(listaRuas.getMesComMaisSinalizacoesConcatenadas(listaRuas));
                    System.out.println("Mes com mais sinalizações: " + mon);
                    break;
                
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }


    private void verMaisSinal(){
        Rua ext = listaRuas.getRuaComMaisSinalizacoes();

        System.out.println("\nNome da Rua "+ext.getId()+" \nNumero Total de sinalizaões: "+ ext.getLista().size());

    }

    private void verAtual(){
        Rua ext = listaRuas.getConteudoNoAtual();
        System.out.println(ext.toString());
    }

    private void percorrerListaRuas() {
        Rua ruaAtual = listaRuas.next(listaRuas);
        if (ruaAtual != null) {
            System.out.println(ruaAtual.toString());
        }
    }
    private void percorrerListaRuasP() {
        Rua ruaAtual = listaRuas.prev(listaRuas);
        if (ruaAtual != null) {
            System.out.println(ruaAtual.toString());
        }
    }
    private void inicio() {
        Rua ruaAtual = listaRuas.reset(listaRuas);
        if (ruaAtual != null) {
            System.out.println(ruaAtual.toString());
        }
    }
    private void bg() {
        listaRuas.reset(listaRuas);
        
    }

    private void modoNavegação(){
        int opcaoModo;
        Scanner scanner = new Scanner(System.in);
        verAtual();
        boolean fechaPrograma = true;
        do{
            
            System.out.println("10) Anterior              20) Próximo");
            System.out.println("30)  Início da lista      40) Retornar ao menu");
            opcaoModo = scanner.nextInt();
            switch(opcaoModo){
                case 10: 
                clearConsole(); 
                    percorrerListaRuasP();
                break;

                case 20: 
                clearConsole(); 
                    percorrerListaRuas();
                break;

                case 30:
                clearConsole(); 
                    inicio();
                break;

                case 40:
                fechaPrograma = false;
                break;
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                break;
            }
        }while(fechaPrograma);

    }


    public final static void clearConsole()
{ System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }

}