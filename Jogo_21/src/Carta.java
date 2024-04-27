public class Carta {
    private Naipe naipe;
    private ValorCarta valor;

    public Carta(ValorCarta valor, Naipe naipe) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public ValorCarta getValorCarta() {
        return valor;
    }
    
    public String toString() {
        return "Carta [naipe=" + naipe + ", valor=" + valor + "]";
    }
    
    

    
}
