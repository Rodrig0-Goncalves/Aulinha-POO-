public class Diretor extends Funcionario {
    private int nivel; 
    
    public Diretor(String nome, String email, double salario, int cargaHoraria, int nivel){
        super(nome, email, salario, cargaHoraria); //referenciar para o contrutor de funcionário
        this.nivel = nivel; 

    }

    public int getNivel(){
        return nivel;
    }

    public String note(){
        String note;
        if(nivel == 3){
            note = "Mack pro max";
        }else if(nivel == 2){
            note = "Mack pro";
        }else{
            note = "Mack";
        }
        return note;
    }

    @Override
    public String toString(){
       return super.toString()+"\nNotebook: "+note();
    }

}
