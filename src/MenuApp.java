import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

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
            System.out.println("1. Rua/av/trav com mais registros de sinalizações");
            System.out.println("2. Modo navegação");
            System.out.println("3. Mês com mais implantações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    verAtual();
                    break;
                case 2:
                    percorrerListaRuas();
                    break;
                case 3:
                    LocalDate menorData = listaRuas.getConteudoNoAtual().getLista().getMenorData();
                    System.out.println("Menor data de implantação das sinalizações: " + menorData);
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

    private void verAtual(){
        System.out.println(listaRuas.getConteudoNoAtual().toString());
    }

    private void percorrerListaRuas() {
     
        listaRuas.next();
        
    }

    

    
            
        

    
}

