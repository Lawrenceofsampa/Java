public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(44, 411);
        ContaPoupanca cp = new ContaPoupanca(280, 1984);

        cc.deposita(100.0);
        cp.deposita(200.0);
        cc.transfere(10.0, cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}
