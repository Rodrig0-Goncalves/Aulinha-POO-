public class Coelho{
    private String raca;
    private double peso;
    private static int cont = 0;
    
    public Coelho(String raca, double peso){
        this.raca = raca;
        this.peso = peso;
        cont++;
    }

    public String getRaca(){
        return raca;
    }

    public double getPeso(){
        return peso;
    }

    public static int getCont(){
        return cont;
    } 

    public String toString(){
        return "Coelho da raça "+raca+", peso: "+peso+"Kg";
    }

}