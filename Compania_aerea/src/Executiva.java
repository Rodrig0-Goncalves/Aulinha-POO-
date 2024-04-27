public class Executiva extends Passagem {
    private int mala;

    public Executiva(int novoVoo, double custoBagagem, int qantBagagem, int mala){
        super(novoVoo, custoBagagem, qantBagagem);
        this.mala = mala; //pode-se fazer uma verificação da quantidade de malas, pessoa não levar um milhão de malas
    }

    public int getMala() {
        return this.mala;
    }

    public double getCustoAdd(){ //Acrescenta 3% ao valor da passagem
        double passagemExecutiva = super.getCusto() *0.3;
        return passagemExecutiva;
    }


    @Override
    public String toString() {
        return super.toString()+"\n Custo Adicional: "+getCustoAdd();
    }


}
