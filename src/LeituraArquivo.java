
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

public class LeituraArquivo {

    public static void main(String[] args) throws ParseException {
        //iniciando as listas
        ListaDeSinalizacoes ls = new ListaDeSinalizacoes();
        ListaDeRuas lr = new ListaDeRuas();





        String linhas[] = new String[110000];
        int numLinhas = 0;

        Path filePath = Paths.get("dataEditado.csv");
        
        // Ler o arquivo
        try ( BufferedReader reader = Files.newBufferedReader(filePath, Charset.defaultCharset())) {
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


        for (int i = 0; i <numLinhas; i++) {
            String[] campos = linhas[i].split(";");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            String descricao = campos[1];//vai para sinalização
            String estado = campos[2];//vai para a sinalização
            String complemento = campos[3]; //R-24A - N/P SEMÁFORO vai para a sinalização

            int anoImplantacao = 1;
            int mesImplantacao = 1;
            int diaImplantacao = 1;            
            
                if(campos[4].contains("/")){
                    
                LocalDate date = LocalDate.parse(campos[4], formatter);
                anoImplantacao = date.getYear();
                mesImplantacao = date.getMonthValue();
                diaImplantacao = date.getDayOfMonth();
                
            }
    LocalDate data = LocalDate.of(anoImplantacao, mesImplantacao, diaImplantacao);
            
            //isso vai para rua
            String logradouro = campos[5].split(" ", 2)[0];
            String nomeLog = campos[5].split(" ", 2)[1];
            

            double numInicial;
            if(campos[6].equals(""))
                numInicial = 0;
            else
                numInicial = Double.parseDouble(campos[6]);
            
            double numFinal;
            if(campos[7].equals(""))
                numFinal = 0;
            else
                numFinal = Double.parseDouble(campos[7]);
            
            String defronte = campos[8];
            String cruzamento = campos[9];
            String lado = campos[10];
            String fluxo = "";
            if(campos.length>=12)
                fluxo = campos[11];
            String localInstalacao = "";
            if(campos.length>=13){
                localInstalacao = campos[12];}

                    
                    
                    lr.orderedAdd(new Rua (new ListaDeSinalizacoes(), logradouro, nomeLog),new Sinalizacao(descricao, lado, localInstalacao, nomeLog,logradouro,data));
                    
                    
                }             
                System.out.println(lr.toString());
                
            }
            
            
        
           
            
            
        }
    



