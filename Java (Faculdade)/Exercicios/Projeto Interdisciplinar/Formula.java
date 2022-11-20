package Projeto_Inter;

import javax.swing.JOptionPane;

public class Formula extends Ponto{
    private int a;
    private int b;
    private int c;
    private double delta;
    private double x1;
    private double x2;
    
    public Formula(){}

    public int getA(){
        a = Integer.parseInt(JOptionPane.showInputDialog("EQUAÇÃO 2° GRAU \nDigite o valor de A: "));
        return a;
    }

    public int getB(){
        b = Integer.parseInt(JOptionPane.showInputDialog("EQUAÇÃO 2° GRAU \nDigite o valor de B: "));
        return b;
    }

    public int getC(){
        c = Integer.parseInt(JOptionPane.showInputDialog("EQUAÇÃO 2° GRAU \nDigite o valor de C: "));
        return c;
    }

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void setC(int c){
        this.c = c;
    }
   
    public double calculoDeRaiz(){
        delta = (b * b) - (4 * a * c);
        if (delta > 0){
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Delta = " + delta + "\nX1 = " + x1 + "\nX2 = " + x2);
        } else {
            JOptionPane.showMessageDialog(null, "Não tem raiz");
        }
        return delta;
    }
}