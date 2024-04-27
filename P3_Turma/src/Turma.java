class Turma{
    private int numero;
    private String professor;
    private int vagas;
    private Aluno[] alunos;
    private int qtdadeAlunos;
    private static Aluno[] qAlunos;

    public void AdiocionaAluno(Aluno x){
        int i = 0;
        qAlunos[i] = x;
        i++;

    }

    public Turma(int nro,String nomeProf,int vagas){
        if (nro<=0 || nomeProf.length() < 2 || vagas <=0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.numero = nro;
        this.professor = nomeProf;
        this.vagas = vagas;
        this.alunos = new Aluno[vagas];
        this.qtdadeAlunos = 0;
    }
    public void novoAluno(Aluno aluno){
        if (qtdadeAlunos == vagas){
            throw new IllegalStateException("Turma cheia!");
        }
        alunos[qtdadeAlunos] = aluno;
        qtdadeAlunos++;
    }

    //MÉTODO PARA BUSCAR A NOTA DE UM ALUNO 
    public void getNotaAluno(int matricula, String nome, int nro){
        for(int i = 0; i<alunos.length; i++){
                if(matricula == qAlunos[i].getMatricula() && nome == qAlunos[i].getNome()){
                        System.out.println(qAlunos[i].getNota(nro));
                }
        }

    }

    //MÉTODO PARA RETORNAR TODOS OS ALUNOS
    public void getTodosAluno(){
        for(int k = 0; k<qAlunos.length; k++){
            System.out.println(qAlunos[k]);
        }

    }

    //MÉTODO PARA BUSCAR OS ALUNOS APROVADOS
    public void AlunosAprovados(){
         for(int j = 0; j<qAlunos.length; j++){
            if(qAlunos[j].getNota(j) >= 7.0){
                System.out.println("O aluno "+qAlunos[j].getNome()+" está aprovado!!");
            }
         }
    }

    //MÉTODO PARA BUSCAR ALUNOS REPROVADOS
    public void AlunosReprovados(){
        for(int j = 0; j<qAlunos.length; j++){
           if(qAlunos[j].getNota(j) <= 7.0){
               System.out.println("O aluno "+qAlunos[j].getNome()+" está reprovado!!");
           }
        }
   }
    }

  