public class ContaPoupanca extends Conta{

    ContaPoupanca(int agencia,int numero){
        super(agencia, numero);
    }

    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
}
