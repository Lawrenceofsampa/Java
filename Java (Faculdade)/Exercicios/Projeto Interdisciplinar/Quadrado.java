package Projeto_Inter;

import javax.swing.JOptionPane;

public class Quadrado extends Ponto{
    private float lado;
    private float area;


    public Quadrado(){}

    public float getLado() {
        lado = Integer.parseInt(JOptionPane.showInputDialog("Entre com o lado: "));
        return lado;
    }  

    public void setLado(float lado) {
        this.lado = lado;
    }  
   
    public float AreaQuadrado(){
        area = lado * lado;
        return area;
    }

    public float PerimetroQuadrado(){
        float perimetro;
        perimetro = lado * 4;
        return perimetro;
    }
    public void retornaAreaQ(){
        JOptionPane.showMessageDialog(null, "Área do quadrado: " + AreaQuadrado() + " m²");
    }
    public void retornaPeriQ(){
        JOptionPane.showMessageDialog(null, "Perimetro do quadrado: " + PerimetroQuadrado() +" m²");
    }
}

