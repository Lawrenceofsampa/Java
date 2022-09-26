import javax.swing.JOptionPane;

public class Data {
    int dia;
    int mes;
    int ano;   

    public Data(){
    }
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    public void cadastraDados(){
        dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Entre com o mês:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano:"));

    }

    public void imprimeData(){
        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
    }
}
