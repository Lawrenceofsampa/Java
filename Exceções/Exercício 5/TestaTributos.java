public class TestaTributos {
    public static void main(String[]args){
        ContaCorrente cc = new ContaCorrente(142, 78);
        SeguroDeVida sv = new SeguroDeVida();
        CalculadorDeImposto ci = new CalculadorDeImposto();


        cc.deposita(150);
        ci.registra(cc);
        ci.registra(sv);

        System.out.println(ci.getTotalImposto());
    }
}
