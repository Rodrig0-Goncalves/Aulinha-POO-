import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LerArquivo {
    public static void main(String[] args) { //DON'T RUN 
        String diretorio = Paths.get("").toAbsolutePath().toString();

        String nome = diretorio+"\\"+"locomotiva.dat";

        Path path = Paths.get(nome);

        int cont = 0;
        String linha = "";
        try (Scanner ler = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
            linha = ler.nextLine();
        } catch (IOException e) {
            System.err.format("Error!");
        }

        String numeros[] = linha.split(",");
        for(int i = 0; i<numeros.length; i++){
           cont += Integer.parseInt(numeros[i]);

        }
            System.out.println("Número de itens no arquivo: "+cont);

    }
}
