public class ContaBancaria {
    private int numero;
    private String nome;
    private double saldo;

    public ContaBancaria(int numero, String nome, double saldo) { //Construtor
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        //Parameters for contrutor
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean deposito(double valor){ //Check if amount deposited is not negative
        if (valor <= 0.0){
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean retirada(double valor){ //Remove value
        if (valor <= 0.0 || saldo-valor < 0.0){ // check if is negative or meke the balance negative
            return false;
        }
        saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return "ContaBancaria: numero: " + numero + ", nome: " + nome + ", saldo: " + saldo;
    }
}
