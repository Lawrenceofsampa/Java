public abstract class Conta{
    protected double saldo;
    private int numero, agencia; //agencia = 40; pode-se adicionar um valor ao atributo que valerá sempre que se criar um novo objeto podendo mudar caso adicione um valor ao atributo no main
    private static int total;
    private Cliente titular; //= new Cliente(); para sempre que se criar uma ContaCliente cria se um objeto de referência a esta classe, isto é, uma nova conta.

    //Construtor com parâmetros:
    public Conta(int agencia, int numero){
        total++;
        System.out.println("O número de contas é: " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

   public abstract void deposita(double valor);

   public void saca(double valor)throws SaldoInsException{
    if(this.saldo < valor){
        throw new SaldoInsException("Saldo: " + this.saldo + ", Valor solictado: " + valor);
    }

    this.saldo -= valor;
   }

   //Método para transferir saldo de uma conta a outra
   public void transfere(double valor, Conta destino /*Criação de objeto em método*/)throws SaldoInsException{
    this.saca(valor);
    destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }
    int getNumero(){
        return this.numero;
    }

    void setNumero(int numero){
        if(numero < 0){
            System.out.println("Number below zero!");
        }
        this.numero = numero;
    }

    int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Number below zero!");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    int getTotal(){
        System.out.println(saldo);
        return total;
    }

}

