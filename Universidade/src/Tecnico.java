public class Tecnico extends Funcionario{ //extends usado para se refirir a métodos utilizados anteriormente
    private int categoria;


    public Tecnico(String nome, double salBase, int categoria) {
        super(nome, salBase); //contrutor da classe funcionário/"pai"
        this.categoria = categoria;
    }

    public int getCategoria() {
        return this.categoria;
    }


    @Override //Sobre escreve a escrita anterior - previne erro de digitação
    public double getSalarioLiquido(){
        double salLiq = super.getSalarioLiquido();
        if(categoria >=3){ //verificar se categoria superior a três
            salLiq = salLiq * 1.05;

        }
        return salLiq;
    }

    @Override //sobre escreve toString() da classe "pai"
    public String toString() {
        return super.toString() + "; \ncategoria: " + getCategoria();
    }

    
}
