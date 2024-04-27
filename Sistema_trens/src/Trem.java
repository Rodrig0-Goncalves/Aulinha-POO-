import java.util.ArrayList;

public class Trem{
    private int id; //Id of the train 
    private ArrayList<Integer> listaTrem = new ArrayList<>(); //List of trains in the garage - trains created 
    private int capacidadeCarga;
    private Vagao vagao;
    private Locomotiva locomotiva;

    private int proxLivre = 0;;
    
    //private ArrayList<Characte> trem = new ArrayList<>();
    private int[] trem = new int[10]; //List of vagões add on the train


    //NÃO PRECISA REMOVER O ÚLTIMO VAGÃO, PODENDO APENAS DIMINUIR O ARRAY DO TREM

    public Trem(int id, int capacidadeCarga){ //Constructor
        this.id = id;
        this.capacidadeCarga = capacidadeCarga;
        listaTrem.add(id);
    }

     //Creat a gargem fo trains
     public void garagemTrem(){
        for(int i = 0; i<5; i++){
            listaTrem.add(i);
        }
    }

    //Show all of the train in the garage
    public void getGaragem(){
        System.out.println("Lista de trem na garagem: ");
        for(int i = 0; i<listaTrem.size(); i++ ){
                System.out.println("Trem id: "+listaTrem.get(i));
            
        }
    }


    public void getTrem(int id){ //get the train through id
       for(int i = 0; i<listaTrem.size(); i++){
            if(listaTrem.get(i) == id){
                System.out.println("Trem "+listaTrem.get(i));
            }
        }
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    //Add a vagão on a train
    public void adVagao(int idSelec, int id){
        if(tremCheio() == false){
            for(int i =0; i<listaTrem.size(); i++){
                if(listaTrem.get(i) == id){
                    trem[proxLivre] = idSelec;
                    proxLivre++;
                }
                //vagao.removeVagao(idSelec);
            }
            System.out.println("Vagão de número " +idSelec+" adcionado ao trem "+id); 
        }
    }

    //Add locomotiva in our train
    public void adLocomotiva(int idSelec, int id){
        if(tremCheio() == false){
            for(int i =0; i<listaTrem.size(); i++){
                if(listaTrem.get(i) == id){
                    trem[proxLivre] = idSelec;
                    proxLivre++;
                }
               // locomotiva.removeLocomotiva(idSelec);
            }
            System.out.println("Locomotiva de número " +idSelec+" adcionado ao trem "+id); 
        }

    }

    //Remove the last train according to id
    public void removeUltimoElemento(int idSelec){
        for(int i = 0; i<listaTrem.size(); i++){
            if(listaTrem.get(i) == idSelec){
                proxLivre = proxLivre-1;

            }
            System.out.println("Seu novo trem: "+trem[proxLivre]);
        }
    }
    
    //Undo a train according to id/arrumado
    public void desfazTrem(int idSelec){
        for(int i = 0; i<listaTrem.size(); i++){
            if(listaTrem.get(i) == idSelec){
                listaTrem.remove(idSelec);
            }
        }
        System.out.println("Trem de id: "+idSelec+" foi desfeito!");
    }

    public boolean existe(int id){
       for(int i = 0; i<listaTrem.size(); i++){
            if(listaTrem.get(i) == id){
                 return true;
            }
        }
        return false;    
    }

    public void verTrem(int id){
        for(int i = 0; i<listaTrem.size(); i++){
            if(listaTrem.get(i) == id){
                System.out.println(listaTrem.get(i));
            }
        }
        
    }

    public boolean tremCheio(){
        if(proxLivre == trem.length){
            return false;
        }
        return true;
    }

}