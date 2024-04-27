import java.util.Random;

public class Deck {
    public final int tamMax = 104;
    private Carta[] cartas;
    private int proxLivre;
    private int cursor;

    public Deck(){
        cartas = new Carta[tamMax];
        proxLivre = 0;
    }

    public void insereEmCima(Carta carta){
        if(proxLivre == tamMax){
            throw new RuntimeException("Deck cheio");
        }
        cartas[proxLivre] = carta;
        proxLivre++;
    }

    public Carta retirarDeCima(){
        if(proxLivre == 0){
            throw new RuntimeException("Deck vazio");
        }
        proxLivre--;
        return cartas[proxLivre];
    }

    public Carta retirarDebaixo(){
        if(proxLivre == 0){
            throw new RuntimeException("Deck vazio");

        }
        Carta aux = cartas[0];
        for(int i = 0; i<proxLivre - 1; i++){
            cartas[i] = cartas[i+1];
        }
        proxLivre--;
        return aux;
    }

    public int qtdadeCartas(){
        return proxLivre;
    }

    public int somaDosValor(){
        int soma  = 0;
        for(int i = 0; i< proxLivre; i++){
            soma += cartas[i].getValorCarta().getValorCarta();
        }
        return soma;
    }

    public void embaralha(){
        Random r = new Random();
        for(int i = 0; i<2000; i++){
            int p1 = r.nextInt(52);
            int p2 = r.nextInt(52);
            Carta aux = cartas[p1];
            cartas [p1] = cartas[p2];
            cartas[p2] = aux;

        }
        
    }
    public void reset(){
        cursor = 0;
    }

    public Carta next(){
        if(cursor == proxLivre){
            return null;
        }
        else{
            Carta aux = cartas[cursor];
            cursor++;
            return aux;
        }
    }
}
