import java.util.Scanner;

public class MenuApp {
    private ListaDeRuas listaDeRuas;

    public MenuApp() {
        listaDeRuas = new ListaDeRuas();
    }

    public static void main(String[] args) {
        MenuApp app = new MenuApp();
        app.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (choice) {
                
                case 1:
                    displayRuas();
                    break;
                case 2:
                    displaySinalizacoes();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (choice != 3);
        
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("3. Exibir Ruas");
        System.out.println("4. Exibir Sinalizações de uma Rua");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void addRua() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da rua: ");
        String nomeRua = scanner.nextLine();
        System.out.print("Digite o logradouro da rua: ");
        String logradouro = scanner.nextLine();
        Rua rua = new Rua(new ListaDeSinalizacoes(), nomeRua, logradouro);
        listaDeRuas.orderedAdd(rua, null);
        System.out.println("Rua adicionada com sucesso!");
    }

    private void addSinalizacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da rua onde deseja adicionar a sinalização: ");
        String nomeRua = scanner.nextLine();
        System.out.print("Digite a descrição da sinalização: ");
        String descricao = scanner.nextLine();
        // Adicione os outros dados necessários para criar uma Sinalizacao
        // ...

        // Verifica se a rua existe na lista de ruas
        Rua rua = getRuaByName(nomeRua);
        if (rua != null) {
            // Cria a sinalização
            Sinalizacao sinalizacao = new Sinalizacao(descricao, /* outros parâmetros */);
            // Adiciona a sinalização à rua
            rua.addLista(sinalizacao);
            System.out.println("Sinalização adicionada à rua com sucesso!");
        } else {
            System.out.println("A rua informada não existe na lista.");
        }
    }

    private void displayRuas() {
        System.out.println("\n===== LISTA DE RUAS =====");
        System.out.println(listaDeRuas.toString());
    }

    private void displaySinalizacoes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da rua para exibir as sinalizações: ");
        String nomeRua = scanner.nextLine();
        Rua rua = getRuaByName(nomeRua);
        if (rua != null) {
            System.out.println("\n===== SINALIZAÇÕES DA RUA " + nomeRua + " =====");
            System.out.println(rua.getLista().toString());
        } else {
            System.out.println("A rua informada não existe na lista.");
        }
    }

    private Rua getRuaByName(String nomeRua) {
        Node aux = listaDeRuas.next();
        while (aux != listaDeRuas.prev()) {
            if (aux.getElement().getNomeDaRua().equals(nomeRua)) {
                return aux.getElement();
            }
            aux = aux.getNext();
        }
        return null;
    }
}
