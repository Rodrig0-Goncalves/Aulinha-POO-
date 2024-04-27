import java.util.*;
public class Vagao extends Trem{
    private int idVagao; //Id of vagao
    private ArrayList<Vagao> garagemVagao = new ArrayList<>(); //Lista de vagões na garage,
    private Random ran = new Random(); //Adiciona capacidades aleatórias para os vagões
    

    public Vagao(int idVagao, int idTrem, int capacidadeCarga){
        super(idTrem, capacidadeCarga);
        this.idVagao = idVagao;
    }

    //Preenche o array da garagem de vagão
    public void garagemVagao(){
        for(int i = 0; i<10; i++){
                garagemVagao.add(new Vagao(i+1, 0, ran.nextInt(10000)));

        }
    }

    //Get para a garagem de vagão preenchida anteriormente 
    public void getGaragem(){
        System.out.println("Vagões disponíveis na garagem: ");
        for(int i = 0; i<garagemVagao.size(); i++){
            if(i % 2 == 0){
                System.out.println(garagemVagao.get(i));
            }
            
        }
    }

    //Remove Vagão from garage - arrumar com arraylist 
    /* 
    public void removeVagao(int remove){
         for(int i = 1; i<garagemVagao.size(); i++){
             if(){
                 garagemVagao.remove(i);
             }
         }
     } 
     */ 

    public Vagao getId(int i) {
        return garagemVagao.get(i);
    }


    @Override
    public String toString() {
        return "Vagao: id: " + garagemVagao.get(idVagao) + ", trem: Disponível, Capacidade de Carga: " +" Kg";
    }
}