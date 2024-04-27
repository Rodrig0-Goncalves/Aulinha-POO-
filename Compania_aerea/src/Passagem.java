public class Passagem{
    private int novoVoo;
    public double custoBagagem;
    private int qantBagagem;
    public double valorPassagem;

    public Passagem(int novoVoo, double custoBagagem, int qantBagagem) { //contrutor da classe "passagem"
        this.novoVoo = novoVoo;
        this.custoBagagem = custoBagagem;
        this.qantBagagem = qantBagagem;
    }
    public void getValorPassagem(){
        valorPassagem = 100.0;
    }

    public int getNovoVoo(){
        return this.novoVoo;
    }

    public int getQantBagagem() {
        return this.qantBagagem;
    }

    public double getCusto(){
        double custo = 0.0;
        return custo;
    }

    public boolean acessoPrioritario(){
        return true;
    }


    @Override
    public String toString() {
        return "\n Voo: "+getNovoVoo()+" \n Custo Bagagem: "+getQantBagagem();
    }

}