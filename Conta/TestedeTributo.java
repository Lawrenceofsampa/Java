public class TestedeTributo {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(153, 142);
        SeguroDeVida seguro = new SeguroDeVida();
        CalculaImposto calc = new CalculaImposto();


        cc.deposita(100.00);
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getValorTotal());
        
    }
}
