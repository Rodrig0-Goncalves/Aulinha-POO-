
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;


public class App {

    public static void AcrescentaHora(Professor f){
        if(f instanceof Pesquisador == true){
            int novaCarga = f.getCargaHoraria()+3;
            System.out.println(novaCarga);
        }else if(f instanceof Professor == true){
            int novaCarga = f.getCargaHoraria()+5;
            System.out.println(novaCarga);
        }
    }
    public static void main(String[] args) throws Exception {
        List<Funcionario> lst = new LinkedList<>();
    
    lst.add(new Funcionario("Zé", 1000.0));

    lst.add(new Tecnico("Primo do zé", 1000.0, 5));

    lst.add(new Professor("Mãe do primo do Zé", 2000.0, 20));

    lst.add(new Pesquisador("Pai do primo do Zé", 2000.0, 10, 5));

    Pesquisador pes2 = new Pesquisador("Irmão do pai do primo do Zé", 2000.0, 8, 3);
    System.out.println(pes2);

    Pesquisador pes3 = new Pesquisador("Irmão da mãe do primo do Zé", 2000.0, 9, 3);
    System.out.println(pes3);

    Professor p1 = new Professor("Júlia", 5300, 20);
    lst.add(new Tecnico("Caio", 3000, 20));

    AcrescentaHora(pes3);
    AcrescentaHora(p1);    
    }
}
