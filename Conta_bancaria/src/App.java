/* 
public class App {
    public static void main(String args[]){
        ContaLimite cl = new ContaLimite(100, "Luizinho", 3000, 1500, 0.15);
        cl.retirada(3500);
        cl.deposito(1200);
        System.out.println(cl.toString());
        ContaRemunerada cr = new ContaRemunerada(120,"Lala Pato", 2500, 0.05);
        cr.deposito(4000);
        System.out.println(cr.toString());
    }
}
*/

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    //Recebe qualquer intância do tipo conta bancária, sem precisar cópiar método para todas contas - referencia pro tipo pai e acessa todas suas filhas
     public static void FazDeposito(ContaBancaria conta){ 
         Scanner s = new Scanner(System.in);
         System.out.println("Quanto gostaria de depositar: ");
         int valor = Integer.parseInt(s.nextLine());
         conta.deposito(valor);
    }

    public static void promocao(ArrayList<ContaBancaria> contas, double valor){
        for(int i =0;i<contas.size(); i++){ //Faz um depósito para todas as contas no array ContaBancaria
            contas.get(i).deposito(valor); //Depositando na marra este valor
        }
    }

    //Realiza uma cobrança de um determinado valor em cada conta do arrayList
    public static void cobrança(ArrayList<ContaBancaria> contas, double valor){ 
        for (ContaBancaria cb : contas) {
                if(cb.retirada(valor)== false){
                    System.out.println(cb.getNome()+" Não tinha dinheiro o suficente!");
                }
        }
    }
    //Função que recebe uma conta por parâmetro e retorna os dados de nome, número da conta e saldo
    public static void dados(ContaBancaria conta){
            System.out.println(conta.getNome());
            System.out.println(conta.getNumero());
            System.out.println(conta.getSaldo());
             
    }

    public static void main(String args[]){
        //Guardando os objetos "contaLimite", "contaRemunerada" em um único array do tipo contaBancaria
        ArrayList<ContaBancaria> contas = new ArrayList<>(); //Put all of the new objects in ArrayList to organized and keep the acounts, with for's, we can make unique routines for each
        contas.add(new ContaLimite(100, "Luizinho", 3000, 1500, 0.15));
        contas.add(new ContaRemunerada(120,"Lala Pato", 2500, 0.05)); 
        contas.add(new ContaLimite(200, "Mario", 2300, 3000, 5.0));

        contas.get(0).deposito(4000);
        contas.get(1).retirada(3500);
        contas.get(2).deposito(1200);
        cobrança(contas, 3200); //Métodp feito em todas as contas 
        System.out.println(contas.get(2).toString());
        System.out.println(contas.get(1).toString());

        dados(contas.get(0));
        
        /*
        Pega o tipo da classe ou tipos 
        if(cl instanceof ContaLimite){
            System.out.println("Cl é uma conta limite");
          }
         if(cl instanceof ContaBancaria){
             System.out.println("Cl é uma conta bacaria");
         }
          ContaBancaria cb = cl;
             cb.deposito(1000); //Referencia a conta bancária
             //cb.getLimite(); não permite pq cl agora é tipo cb 
        
        */
    }
}