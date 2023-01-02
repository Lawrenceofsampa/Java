public class ContaPoupanca extends Conta{
    
    ContaPoupanca(int agencia,int numero){
        super(agencia, numero);
    }
    public void deposita(double valor){
        this.saldo += valor;
    }

    
}
