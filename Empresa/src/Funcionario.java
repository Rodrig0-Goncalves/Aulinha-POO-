public class Funcionario{
    private String nome;
    private String email;
    private double salario;
    private int cargaHoraria;


    public Funcionario(String nome, String email, double salario, int cargaHoraria) { //Parametros para contrutor
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    //Métodos get's
    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }


    public double getSalario(){
        return this.salario;
    }  

    public double getSalarioLiquido(){
        double salario = getSalario();
        double salarioLiquido;
        if(salario>=4000){
            salarioLiquido = salario*0.2;
        }else if(salario<4000 || salario>3000){
            salarioLiquido = salario*0.1;
        }else{
            salarioLiquido = salario*0.08;
        }
        return salarioLiquido;
    }

    public double bonus(){
        double bonus;
        double salario =getSalario();
        if(cargaHoraria>8){
            bonus = salario+200;
        }else if(cargaHoraria<=8 || cargaHoraria>=6){
            bonus = salario+150;
        }else{
            bonus = salario+100;
        }
        return bonus;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nE-mail: " + getEmail() + "\nSalário: " + getSalario()+"\nBônus: "+bonus();
    }
    


}