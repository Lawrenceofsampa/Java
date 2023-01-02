public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double getValorImposto() {
        return super.saldo * 10 / 100;
    }
    
    ContaCorrente(int agencia,int numero){
        super(agencia, numero);
    }
    @Override
    public void saca(double valor) throws SaldoInsException{
        double sacando = valor + 0.10;
        super.saca(sacando);
    }
    public void deposita(double valor){
        this.saldo += valor;
    }
}
