import java.util.*;

public class Locomotiva extends Trem{
    private int idLocomotiva;
    private int nroMaxVagoes;
    private ArrayList<Locomotiva> garagemLocomotiva = new ArrayList<>();
    private Random ran = new Random();

    public Locomotiva(int idLocomotiva, int idTrem, int capacidadeCarga, int nroMaxVagoes) {
        super(idTrem, capacidadeCarga);
        this.idLocomotiva = idLocomotiva;
        this.nroMaxVagoes = nroMaxVagoes;
    }

    //Creat the locomotivas in te garage 
    public void garagemLocomotivas(){
        for(int i = 0; i<10; i++){
                garagemLocomotiva.add(new Locomotiva(i, 0, ran.nextInt(1000), ran.nextInt(10)));
        }
    }
    
    //Get the list of locomotivas in the garage 
    public void getGaragem(){
        System.out.println("Lista de locomotivas disponíveis na garagem: ");
        for(int i = 0; i<garagemLocomotiva.size(); i++){
            if(i%2 != 0){
                System.out.println(garagemLocomotiva.get(i));
            }
            
            
        }
    }

    //Remove locomotiva from garage 
   /*
   public void removeLocomotiva(int remove){
         for(int i = 0; i<garagemLocomotiva.size(); i++){
             if(garagemLocomotiva.get(idLocomotiva) == remove){
                 garagemLocomotiva.remove(i);
             }
         }
     }
   */ 

    public Locomotiva getId(int id) {
        return garagemLocomotiva.get(id);
    }


    public int getNroMaxVagoes() {
        return nroMaxVagoes;
    }

    @Override
    public String toString() {
        return "Locomotiva: id = " +garagemLocomotiva.get(idLocomotiva)+ ", trem = Disponível, capacidadeCarga = " + " kg, nroMaxVagoes = "+nroMaxVagoes;
    };
}
