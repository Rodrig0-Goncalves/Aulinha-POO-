public class ContaLimite extends ContaBancaria {
    private double limite;
    private double taxaJuros;
    private double jurosDevidos;

    public ContaLimite(int numero, String nome, double saldo, double limite, double taxaJuros) {
        super(numero, nome, saldo);
        this.limite = limite;
        this.taxaJuros = taxaJuros;
        this.jurosDevidos = 0.0;
        deposito(limite); //Give the limite to the account - forced
    }

    public double getLimite() {
        return limite;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public double getJurosDevidos(){
        return this.jurosDevidos;
    }

    @Override
    public double getSaldo(){
        return super.getSaldo() - limite; //remove the extra value before get the balance
    }

    @Override
    public boolean retirada(double valor){
        boolean aux = super.retirada(valor);
        if (aux == false){ //Check method from ContaBancaria - return false if the value is negativa ou bigger 
            return aux;
        }
        if (getSaldo() < 0.0){ //If negative acount, make the fees from the next month
            double juros = Math.abs(getSaldo()) * this.taxaJuros;
            this.jurosDevidos += juros;
        }
        return aux;
    }

    public boolean quitaJuros(){ //pay the debit
        if (getSaldo() - getJurosDevidos() > 0){
            retirada(getJurosDevidos());
            jurosDevidos = 0;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return super.toString()+", juros devidos: "+this.getJurosDevidos();
    }
}
