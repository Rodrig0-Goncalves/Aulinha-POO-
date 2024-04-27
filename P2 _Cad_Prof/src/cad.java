
import java.util.Scanner;
public class cad {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        int op = 5;
        do{
            System.out.println("\fBem vindo a matricula: ");
        System.out.println("1) Cadastrar um novo professor");
        System.out.println("2) Listar todos os professores cadastrados");
        System.out.println("3) Exibir a classificação de um professor dado seu nome");
        System.out.println("4) Fim");
        System.out.print("Escolha uma das opções:");

         op = in.nextInt();
        }while(op < 0 || op > 4);

        switch (op) {
            case 1:
            System.out.println("Nome do professor?");
            String nome  = in.next();
      
            System.out.println("Quantos anos de experiencia ele tem?");
            int experiencia  = in.nextInt();
            Professor p = new Professor(nome,experiencia);
            System.out.println(p.toString());
      
            System.out.println("Categoria:"+p.classifica());
            in.close();
                break;

                case 2:
                    System.out.println("Você escolheu a opção de 'Listar todos os professores cadastrados'!");
                break;

                case 3:
                System.out.println("Você escolheu a opção de 'Exibir a classificação de professores'!");
                break;

                case 4:
                System.out.println("Você escolheu a opção de 'Fim'!");
                break;
        
            default:
                break;
        }
    
    }
}
