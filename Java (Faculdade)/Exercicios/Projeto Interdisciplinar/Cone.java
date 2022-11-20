package Projeto_Inter;

import javax.swing.JOptionPane;

public class Cone extends Ponto{
    private double raio;
    private double geratriz;
    private double altura;
    double area;
    double volume;

    public Cone(){}

    public double get_raio(){
        raio = Double.parseDouble(JOptionPane.showInputDialog("Entre com o raio"));
        return raio;
    }

    public double get_geratriz(){
        geratriz = Double.parseDouble(JOptionPane.showInputDialog("Entre com a geratriz"));
        return geratriz;
    }

    public double get_altura(){
        altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura"));
        return altura;
    }

    public void set_raio(double raio){
        this.raio = raio;
    }

    public void set_geratriz(double geratriz){
        this.geratriz = geratriz;
    }

    public void set_altura(double altura){
        this.altura = altura;
    }

    public double calculaArea_Cone(){
        double pi;
        pi = 3.14;
        area = pi * raio + raio + geratriz;
        return area;
    }

    public double calculaVolume_Cone(){
        volume = ((raio + Math.sqrt(2)) * altura) / 3;
        return volume;
    }

    public void imprimeDados_AreaCone(){
        JOptionPane.showMessageDialog(null,"A area do Cone é: " + calculaArea_Cone() + " cm²");
    }

    public void imprimeDados_VolumeCone(){
        JOptionPane.showMessageDialog(null,"O volume do Cone é: " + calculaVolume_Cone() +" cm³");
    }

}
