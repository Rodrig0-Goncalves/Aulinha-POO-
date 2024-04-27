public class Baralho {
    private Deck deck;

    public Baralho(){
        deck = new Deck();
        for(int i = 0; i<Naipe.values().length;i++){
            for(int j =0; j<ValorCarta.values().length;j++){
                Carta c = new Carta(ValorCarta.values()[j], Naipe.values()[i]);
                deck.insereEmCima(c);
            }
        }
    }
    public Carta retirarDeCima(){
        return deck.retirarDeCima();
    }

    public void embaralha(){
        deck.embaralha();
    }

}
