
import java.util.Scanner;
import java.time.Month;

public class MenuApp {
    private ListaDeRuas listaRuas;
 


    

    public MenuApp(ListaDeRuas listaRuas){
        this.listaRuas = listaRuas;
        
    }

    public void exibirMenu() {
        
       
        
        int opcao;
        Scanner scanner = new Scanner(System.in);

        do {//é isso que o menu tem que ter e precisa mostrar
            System.out.println("Menu:");
            System.out.println("1. inicio");
            System.out.println("2. Rua/av/trav com mais registros de sinalizações");
            System.out.println("3. next");
            System.out.println("4. prev");
            System.out.println("5. Rua mais implant");
            System.out.println("6. Mês com mais implantações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                clearConsole();
                    inicio();
                    exibirMenu();
                    break;
                case 2:
                clearConsole();
                    verAtual();
                    exibirMenu();
                    break;
                case 3:
                clearConsole();
                    percorrerListaRuas();
                    exibirMenu();

                    break;
                case 4:
                clearConsole();
                    percorrerListaRuasP();
                    exibirMenu();

                    
                    break;
                case 5:
                clearConsole();
                    verMaisSinal();
                    exibirMenu();

                    
                    break;
                case 6:
                clearConsole();
                    Month mes = Month.of(listaRuas.getConteudoNoAtual().getLista().getMesMaisSinalizacoes());
                    System.out.println("Mes com mais sinalizações: " + mes);
                    exibirMenu();
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

    public final static void clearConsole()
{ System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); }





    

    
            
        

    
}

