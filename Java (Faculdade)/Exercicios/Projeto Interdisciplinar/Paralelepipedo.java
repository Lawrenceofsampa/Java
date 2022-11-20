package Projeto_Inter;

import javax.swing.JOptionPane;

public class Paralelepipedo extends Ponto{
    private float comprimento;
    private float largura;
    float volume;
    float area;

    public Paralelepipedo(){}
    
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }
    public void setLargura(float largura){
        this.largura = largura;
    }

    public float getComprimento() {
        comprimento = Float.parseFloat(JOptionPane.showInputDialog(null,"Entre com o comprimento do paralelepipedo: "));
        return comprimento;
    }

    public float getLargura() {
        largura = Float.parseFloat(JOptionPane.showInputDialog(null,"Entre com a comprimento da largura: "));
        return largura;
    }

    public float calculaVolumePara(){
        volume = comprimento * largura * y;
        return volume;
    }
    public float calculoAreaPara(){
        area = (2 * comprimento * largura) + (2 * comprimento * y + (2 * largura * y));
        return area;
    }
    public void imprimeDadosVolPara(){
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é: " + calculaVolumePara() + " cm³");
    }
    public void imprimeDadosAreaPara(){
        JOptionPane.showMessageDialog(null,"A área do paralelepipedo é: " + calculoAreaPara() + " m²");
    }
}
