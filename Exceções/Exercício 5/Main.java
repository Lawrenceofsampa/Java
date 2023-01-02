public class Main {
    public static void main(String[]args) throws SaldoInsException{
        ContaCorrente cc = new ContaCorrente(145, 192);
        ContaPoupanca cp = new ContaPoupanca(193, 411);
        
        cc.deposita(1000.00);
        cp.deposita(1000.00);
        cc.transfere(500.00, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
        
    }
}
