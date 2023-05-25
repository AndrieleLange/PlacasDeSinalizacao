
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        for (int i = 0; i < numLinhas; i++) {
            String[] campos = linhas[i].split(";");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            String descricao = campos[1];// vai para sinalização
        
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
            String lado = campos[10];

            String localInstalacao = "";
            if (campos.length >= 13) {
                localInstalacao = campos[12];
            }
            
            lr.orderedAdd(new Rua(new ListaDeSinalizacoes(), logradouro, nomeRua),
                        new Sinalizacao(descricao, lado, localInstalacao, nomeRua, logradouro, data));

        }
         
        MenuApp meni = new MenuApp(lr);
        meni.exibirMenu();
         
    }
}

    


