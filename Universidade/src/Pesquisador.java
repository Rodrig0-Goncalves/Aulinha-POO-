public class Pesquisador extends Professor{ //extensão da classe professor, "é um tipo de professor" 
    private int cargaPesq;


    public Pesquisador(String nome, double salBase, int cargaHoraria, int cargaPesq) {
        super(nome, salBase, cargaHoraria); //construtor da classe professor 
        this.cargaPesq = cargaPesq;
    }

    public int getCargaPesq() {
        return this.cargaPesq;
    }

    @Override
    public int getCargaHoraria(){ //Adicionando a carga de pesquisa na carga horária 
        return super.getCargaHoraria()+ getCargaPesq();
    }

    @Override //Sobre escrevendo com o método adicional
    public String toString() {
        return super.toString() + "\nCarga de pesquisa: "+getCargaPesq();
    }

}