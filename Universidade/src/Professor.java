public class Professor extends Funcionario{ //extends usado para se refirir a métodos utilizados anteriormente
    private int cargaHoraria;

    public Professor(String nome, double salBase, int cargaHoraria){
        super(nome, salBase); //faz o construtor da classe funcionário
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() { //único diferencial
        return this.cargaHoraria;
    }


    public double getValorHora(){
        double vh = getSalBase()/44; //método classe pai para utilizar 
        double salLiq = vh*getCargaHoraria(); //valor hora calculado anteriorente X carga horaria que foi passada por parâmetro
        salLiq -= getINSS(); //Salário líquido e diminui o valor do INSS, método da classe pai
        return salLiq;
    }


    @Override //usado para sobre escrever o método da classe pai com o novo atributo
    public String toString() {
        return super.toString() + "; \nValor horá: " + getValorHora();
    }

}
