import javax.swing.JOptionPane;

public class Tringulo {
    float base;
    float altura;

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
        return area;
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "\n Área: " + this.base
        + "\n Altura: " + this.altura);
    }

}