import javax.swing.JOptionPane;
public class UsaTriangulo{
    public static void main(String[] args) {
        //Declaração e instanciação de objeto:
        Triangulo t1 = new Triangulo();

        //Entrdada de dados - Modo Gráfico
        t1.base = Float.parseFloat(JOptionPane.showInputDialog(
        "Digite a base do triângulo: "));
        t1.altura = Float.parseFloat(JOptionPane.showInputDialog(
        "Digite a altura: "));

        //Saída de dados

        JOptionPane.showMessageDialog(null,
        "Base = " +
        t1.base +
        "\nAltura = " +
        t1.altura);

    }
}
