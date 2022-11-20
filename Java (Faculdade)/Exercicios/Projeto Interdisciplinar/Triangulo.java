package Projeto_Inter;

import javax.swing.JOptionPane;

public class Triangulo extends Ponto{
    private float area;
    private float lado1, lado2, lado3;
    private float perimetro;

    public Triangulo(){

    }
    public float getLado1Triangulo(){
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o lado 1 do triângulo: "));
        return lado1;
    }
    public float getLado2Triangulo(){
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o lado 2 do triângulo: "));
        return lado2;
    }
    public float getLado3Triangulo(){
        lado3 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o lado 3 do triângulo: "));
        return lado3;
    }

    public void setLado1_Triangulo(float lado1){
        this.lado1 = lado1;
    }
    public void setLado2_Triangulo(float lado2){
        this.lado2 = lado2;
    }
    public void setLado3_Triangulo(float lado3){
        this.lado3 = lado3;
    }

    public float Calcula_AreaTriangulo(){
        area = x * y / 2;
        return area;
    }
    public float Calcula_PeriTriangulo(){
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }
    public void retornoArea_Triangulo(){
        JOptionPane.showMessageDialog(null, "A area do triangulo é: " + Calcula_AreaTriangulo() + " cm²");
    }
    public void retornoPeri_Triangulo(){
        JOptionPane.showMessageDialog(null, "O Perimetro do triangulo é: " + Calcula_PeriTriangulo() + " cm");
    }
}


