public class TesteContas {
    public static void main(String[] args) throws SaldoInsException {
        ContaCorrente cc = new ContaCorrente(152, 4411);

        ContaPoupanca cp = new ContaPoupanca(152,146);

        cp.deposita(200.0);
        cc.transfere(400.00, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
