import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriarArquivo {
    public static void main(String args[]) throws IOException{
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> idLocomotiva = new ArrayList<Integer>();
        ArrayList<Integer> numMax = new ArrayList<Integer>();
        ArrayList<Double> pesoMax = new ArrayList<Double>();

        //declaration of variables used in program
        String garagemTrem = Paths.get("").toAbsolutePath().toString();
        String adiciona = garagemTrem+"//"+"locomotiva.dat";
        Path path = Paths.get(adiciona);
        String resp = "sim";
        
        //Variável "escreve" localiza o arquivo "Locomotiva.dat" e escreve os dados dentro dele 
       try (PrintWriter escreve = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
        //First question
        System.out.println("Insira os dados dos trens pedidos abaixo: ");
        while(resp.equalsIgnoreCase("sim")){ //Turn the program cyclic;

        System.out.print("Identificar da locomotiva: ");
        idLocomotiva.add(in.nextInt()); //Recibe a value from keyboard;
        escreve.print(idLocomotiva+","); //Write on the file;

        System.out.print("Número máximo de vagões que consegue puxar: ");
        numMax.add(in.nextInt()); //Recibe a value from keyboard;
        escreve.print(numMax+","); //Write on the file;

        System.out.print("Peso máximo que consegue tracionar: ");
        pesoMax.add(in.nextDouble()); //Recibe a value from keyboard;
        escreve.print(pesoMax); //Write on the file;

        escreve.println(); //Leave one under the other;

        //For add more trens in list
        System.out.print("Gostaria de inserir mais um trem? ");
        in.nextLine(); //Take of the rest of line;
        resp = in.nextLine(); //Continue with the program or not;
        }
        System.out.println("Fim do programa!");

       } catch (IOException e) {
        System.err.format("Error!");
       } 
    }
}
