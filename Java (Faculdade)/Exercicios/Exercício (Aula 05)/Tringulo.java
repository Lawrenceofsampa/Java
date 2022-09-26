import javax.swing.JOptionPane;

public class Tringulo {
    float base;
    float altura;
    String dados;

    public Tringulo(){
    }

    public Tringulo(float b, float a){
        base = b;
        altura = a;
    }

    //Construtor com parâmetros:
    public float calculaArea(){
        float area;
        area = (base * altura) / 2;
        return area; //Var local funciona apenas em calculaArea
    }

    public String imprimeTriangulo(){
        JOptionPane.showMessageDialog(null, "\n Base: " + base
        + "\n Altura: " + altura +
         "\nÁrea: " + calculaArea());
         return dados;
    }
}