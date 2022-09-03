import javax.swing.JOptionPane;
public class UsaData{
    public static void main(String[] args) {
        //Declaração e instanciação de objeto:
        Data d1 = new Data();

        //Entrada de dados:
        d1.dia = Integer.parseInt(JOptionPane.showInputDialog(
            "Entre com o dia: "));
        d1.mes = Integer.parseInt(JOptionPane.showInputDialog(
            "Entre com o mês: "));
        d1.ano = Integer.parseInt(JOptionPane.showInputDialog(
            "Entre com o ano: "));

        //Saida dos dados:
        JOptionPane.showMessageDialog(null,
        "Dia = " +
        d1.dia +
        "Mês = " +
        d1.mes +
        "Ano = " +
        d1.ano);
    }
}
