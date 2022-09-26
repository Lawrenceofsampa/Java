import javax.swing.JOptionPane;

public class Usaclasse {
    public static void main(String[] args) {
        //variáveis aux:
        float base;
        float altura;
        Data d1;

        //Objetos:
        Tringulo t1;
        d1 = new Data();

        //Solicitação:
        base = Float.parseFloat(JOptionPane.showInputDialog("Entre com a base: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Entre com a altura: "));

        //Instanciação:
        t1 = new Tringulo(base, altura);
        t1.imprimeTriangulo();
        d1.cadastraDados();
        d1.imprimeData();
        


    }
}
