public class UsaVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(0, 0, null, 0);

        v1.setNome("Da silva");
        v1.setSalario(3000);
        v1.setFalta(6);
        v1.setVendas(3000);
        v1.imprimirDados();
    }
}
