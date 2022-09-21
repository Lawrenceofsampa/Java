import javax.swing.JOptionPane;

public class Usaclasse {
    public static void main(String[] args) {
        //variáveis aux:
        float base;
        float altura;
        float area;

        //Objetos:
        Tringulo t1;

        //Solicitação:
        base = Float.parseFloat(JOptionPane.showInputDialog("Entre com a base: "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Entre com a altura: "));

        //Instanciação:
        t1 = new Tringulo(base, altura);
        area = t1.calculaArea();
        t1.imprimeDados();
        JOptionPane.showInputDialog(null, "Área: " + area);
        


    }
}
