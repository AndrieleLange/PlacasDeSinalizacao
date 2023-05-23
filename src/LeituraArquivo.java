
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LeituraArquivo {

    public static void main(String[] args) throws ParseException {
        // iniciando as listas

        ListaDeRuas lr = new ListaDeRuas();

        String linhas[] = new String[110000];
        int numLinhas = 0;

        Path filePath = Paths.get("dataEditado.csv");

        // Ler o arquivo
        try (BufferedReader reader = Files.newBufferedReader(filePath, Charset.defaultCharset())) {
            String line = reader.readLine();
            line = reader.readLine();
            while (line != null) {
                linhas[numLinhas] = line;
                numLinhas++;
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.err.format("Erro na leitura do arquivo: ", e.getMessage());
        }

        for (int i = 0; i < 3000; i++) {
            String[] campos = linhas[i].split(";");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            String descricao = campos[1];// vai para sinalização
            String estado = campos[2];// vai para a sinalização
            String complemento = campos[3]; // R-24A - N/P SEMÁFORO vai para a sinalização

            int anoImplantacao = 1;
            int mesImplantacao = 1;
            int diaImplantacao = 1;

            if (campos[4].contains("/")) {

                LocalDate date = LocalDate.parse(campos[4], formatter);
                anoImplantacao = date.getYear();
                mesImplantacao = date.getMonthValue();
                diaImplantacao = date.getDayOfMonth();

            }
            LocalDate data = LocalDate.of(anoImplantacao, mesImplantacao, diaImplantacao);

            // isso vai para rua
            String nomeRua = campos[5].split(" ", 2)[0];
            String logradouro = campos[5].split(" ", 2)[1];

            double numInicial;
            if (campos[6].equals(""))
                numInicial = 0;
            else
                numInicial = Double.parseDouble(campos[6]);

            double numFinal;
            if (campos[7].equals(""))
                numFinal = 0;
            else
                numFinal = Double.parseDouble(campos[7]);

            String defronte = campos[8];
            String cruzamento = campos[9];
            String lado = campos[10];
            String fluxo = "";
            if (campos.length >= 12)
                fluxo = campos[11];
            String localInstalacao = "";
            if (campos.length >= 13) {
                localInstalacao = campos[12];
            }

            lr.orderedAdd(new Rua(new ListaDeSinalizacoes(), logradouro, nomeRua),
                        new Sinalizacao(descricao, lado, localInstalacao, nomeRua, logradouro, data));

        }
       /*  Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Percorrer a lista de ruas e exibir informações");
            System.out.println("2. Verificar rua com mais sinalizações");
            System.out.println("3. Exibir todas as ruas e suas sinalizações");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    percorrerListaRuas(lr);
                    break;
                case 2:
                    verificarRuaComMaisSinalizacoes(lr);
                    break;
                case 3:
                    exibirTodasAsRuas(lr);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void percorrerListaRuas(ListaDeRuas lr) {
        lr.reset();
        while (lr.getCurrent() != lr.getTrailer()) {
            Rua rua = lr.getCurrent().element;
            System.out.println("Rua: " + rua.getNomeRua());
            System.out.println("Logradouro: " + rua.getLogradouro());
            System.out.println("Número de sinalizações: " + rua.getListaSinalizacoes().getSize());
            System.out.println();
            lr.next();
        }
    }

    private static void verificarRuaComMaisSinalizacoes(ListaDeRuas lr) {
        
    }

    private static void exibirTodasAsRuas(ListaDeRuas lr) {
        System.out.println(lr.toString());*/
    }
}

    


