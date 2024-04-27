
public class App {
    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno(1019,"Huguinho Pato");
        a.setNota(1, 8);
        a.setNota(2, 6);
        a.setNota(3, 10);

        Aluno b = new Aluno(1020,"Pateta");
        b.setNota(1, 9);
        b.setNota(2, 5);
        b.setNota(3, 7  );

        Aluno c = new Aluno(1021,"Pluto");
        c.setNota(1, 3);
        c.setNota(2, 4);
        c.setNota(3, 9);

        Turma.AdiocionaAluno(a);
        Turma.AdiocionaAluno(b);
        Turma.AdiocionaAluno(c);

        /* 
        System.out.println(a.getMatricula());
        System.out.println(a.getNome());
        */

        for(int i=1;i<=a.MAX_NOTAS;i++){
            System.out.println(a.getNota(i));
        }
        System.out.println("Media: "+a.media());
        if (a.aprovado()){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado.");
        }
        Turma t = new Turma(10,"Pato Donald",10);
        t.novoAluno(a);
        t.novoAluno(b);
        t.novoAluno(c);

        t.novoAluno(new Aluno(1022,"Luizinho Pato"));


    }
}
