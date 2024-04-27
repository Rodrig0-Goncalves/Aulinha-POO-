public class Funcionario{
    private String nome;
    private double salBase;


    public Funcionario(String nome, double salBase) {
        this.nome = nome;
        this.salBase = salBase;
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalBase() {
        return this.salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getINSS(){
        return getSalBase()*0.1;
    }

    public double getSalarioLiquido(){
        return getSalBase() - getINSS();
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +"; \nSalário base: " + getSalBase() + "; \nSalário liquido: "+getSalarioLiquido();
    }

}