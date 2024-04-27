import java.util.Scanner;

public class Menu{
    public Menu(){
        Scanner in = new Scanner(System.in);
        int opInicial = 0, creatTrain = 7, creatLocomotiva = 9, idTrem, capacidadeCarga = 10000, addChain = 0;

        Trem novoTrem = new Trem (creatTrain, capacidadeCarga);
        Locomotiva locomotivas = new Locomotiva(0, 0, 0, 0);
        Vagao vagaos = new Vagao(0, 0, 0);

        locomotivas.garagemLocomotivas();
        vagaos.garagemVagao();
        novoTrem.garagemTrem();
        

       
        while(opInicial != 5){//do the loop until initial option equal 5
            System.out.println("\f1 - Criar um trem: ");
            System.out.println("2 - Editar um trem: ");
            System.out.println("3 - Listar todos os trens criados: ");
            System.out.println("4 - Desfazer um trem: ");
            System.out.println("5 - Fim ");
            System.out.print("Escolha uma das opções: ");
            opInicial = in.nextInt(); //Initial option select

            
            switch (opInicial) { 
                case 1:{
                        System.out.println("O identificador do seu trem é: "+creatTrain);
                        System.out.println("O identificador da sua locomotiva é: "+creatLocomotiva);
                        novoTrem = new Trem(creatTrain, capacidadeCarga);
                        creatTrain++; 
                        creatLocomotiva++;
                    
                    
                    break;
                }
                case 2: {
                    System.out.println("Indique qual o id do trem a ser modificado: ");
                    if(novoTrem.existe(in.nextInt()) == true){
                        while(in.nextInt() == 1){
                         System.out.println("Insira: \n1 - Adiocionar vagão \n2 - Adicionar locomotiva \n3 - Remover último elemento ");
                         //addChain = in.nextInt();//Armazena a adição do usuário - não utilizado mais

                            switch(in.nextInt()){
                                 case 1: //Add vagão on a train
                                   vagaos.getGaragem();       
                                    System.out.println("Selecione com o Id qual vagão você gostaria: "); 
                                    addChain = in.nextInt();
                                    novoTrem.adVagao(addChain, (creatTrain-1)); //Add vagao in our trains
                                    break;

                                 case 2: //Add a locomotiva ona train
                                    locomotivas.getGaragem();   
                                    System.out.println("Selecione com o Id qual Locomotiva você gostaria: ");
                                    addChain = in.nextInt();
                                    novoTrem.adLocomotiva(addChain, (creatTrain-1)); //Add locomotiva in our train
                                    break;

                                case 3: //Undo a train
                                     System.out.println("Indique o id do trem que deseja remover o último elemento: ");
                                      novoTrem.desfazTrem(in.nextInt());
                                      break;  
                                    }
                                }
                        }   else { //Stop coding if train doesn't exist
                            System.out.println("Erro, trem não encontrado!");
                            break;
                        }

                        System.out.println("Gostaria de adicionar mais locomotivas ou vagões? "); 
                        System.out.println("1 - Sim. \n2 - Não.");
                    break;
                }
                case 3: {
                    novoTrem.getGaragem();
                    break;
                }
                case 4: { //Undo a train and turn avaible yours locomotivas e vagões
                    System.out.println("Indique o id do trem a ser desfeito: ");
                    idTrem = in.nextInt();
                    novoTrem.desfazTrem(idTrem);
                    break;
                }
                case 5: {
                    System.out.println("Fim do programa!");
                    break;
                }
                

            }
        }
    }
}