package Celular;

import javax.swing.JOptionPane;

public class UsaCelular {
    public static void main(String[] args) {
        //Declaração e instanciação de objeto:
        Celular c1 = new Celular();

        //Modo gráfico (Interação com usuário):
        c1.marca = JOptionPane.showInputDialog("Entre com a marca do celular: ");
        c1.lancamento = Integer.parseInt(JOptionPane.showInputDialog("Entre com a data de lançamento: "));
        c1.modelo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o o modelo: "));
        c1.preco = Float.parseFloat(JOptionPane.showInputDialog("Entre com o peço: "));

        //Saida (Print):
        JOptionPane.showMessageDialog(null, "Marca: " + c1.marca +
         "\n Lancamento: " + c1.lancamento +
          "\n Modelo: " + c1.modelo +
           "\n Preço: " + c1.preco);
           // \n Para quebra de linha
    }
}
