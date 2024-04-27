public class Economica extends Passagem{
    public int qantBagagem = 0;

    public Economica(int novoVoo, double custoBagagem, int qantBagagem){
        super(novoVoo, custoBagagem, qantBagagem = 0);
        this.qantBagagem = qantBagagem; //quantidade limitada de bagem, ou nenhum 
    }

    public void setQantBagagem(int qantBagagem){
        this.qantBagagem = 0;
    }

    public double getCustoAdd(){
       double passagemEconomica = super.getCusto()*1.1; //Acrescimo ao valor da passagem
        return passagemEconomica; 
    }


    @Override
    public String toString() {
        return super.toString() +"\n Custo adicional: "+getCustoAdd();
    }


}