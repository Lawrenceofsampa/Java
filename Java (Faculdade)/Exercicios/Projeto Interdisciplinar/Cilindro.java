package Projeto_Inter;

import javax.swing.JOptionPane;

public class Cilindro extends Ponto{
    private float area_base;
    private float area_lateral;
    private float volume;
    private float area;

    public Cilindro(){

    }

    public float getArea_Base(){
        area_base = Float.parseFloat(JOptionPane.showInputDialog("Entre com a base da area: "));
        return area_base;
    }

    public float getArea_Lateral(){
        area_lateral = Float.parseFloat(JOptionPane.showInputDialog("Entre com a area lateral: "));
        return area_lateral;
    }

    public void setArea_Base(float area_base){
        this.area_base = area_base;
    }

    public void setArea_Lateral(float area_lateral){
        this.area_lateral = area_lateral;
    }

    public float calculaVolCilindro(){
        volume = (area_base + area_lateral*2) * y;
        return volume;
    }
    public float calculaAreaCilindro(){
        area = (area_base + area_lateral) * 2;
        return area;
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + calculaVolCilindro() + " cm³");
    }
    public void imprimeDadosArea(){
        JOptionPane.showMessageDialog(null, "A area do cilindro é: " + calculaAreaCilindro() + " m²");
    }
}
