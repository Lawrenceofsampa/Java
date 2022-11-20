package Projeto_Inter;

import javax.swing.JOptionPane;

public class Ponto {
    protected float x;
    protected float y;

    public Ponto(){

    }

    public float getBase() {
        x = Float.parseFloat(JOptionPane.showInputDialog("Entre com a base: "));
        return x;
    }
    public float getAltura() {
        y = Float.parseFloat(JOptionPane.showInputDialog("Entre com a altura: "));
        return y;
    }

    public void setBase(float base) {
        this.x = base;
    }
    public void setAltura(float altura) {
        this.y = altura;
    }
}