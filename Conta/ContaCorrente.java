
public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double getValorImposto(){
        return super.saldo * 0.01;
    }

    ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }
    @Override
    public boolean sacar(double valor) {
        double valorAsacar = valor + 0.2;
        return super.sacar(valorAsacar);
    }

    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
}
