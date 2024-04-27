import java.util.Random;

public class App {
   public static void ImprimeCarta(Deck d) {
    d.reset();
    Carta aux = null;
    while((aux=d.next())!=null){
        System.out.println(aux);
    }
   }

   public static void main(String[] args) {
    Baralho b1 = new Baralho();
    b1.embaralha();
    Deck j1 = new Deck();
    Deck j2 = new Deck();

    j1.insereEmCima(b1.retirarDeCima());
    j1.insereEmCima(b1.retirarDeCima());
    j2.insereEmCima(b1.retirarDeCima());
    j2.insereEmCima(b1.retirarDeCima());

    while(true){
        System.out.println("Cartas do jogador 1:");
        ImprimeCarta(j1);
        int somaJ1 = j1.somaDosValor();
        System.out.println("Somatório do jogador 1:"+somaJ1);
        System.out.println("Cartas do jogador 2:");
        ImprimeCarta(j2);
        int somaJ2 = j1.somaDosValor();
        System.out.println("Somatório do jogador 2:"+somaJ2);

        if(somaJ1 >21){
            System.out.println("Jogador 2 ganhou!");
            break;
        }
        if(somaJ2>21){
            System.out.println("Jogador 1 ganhou!");
        }

    }

   }


}
