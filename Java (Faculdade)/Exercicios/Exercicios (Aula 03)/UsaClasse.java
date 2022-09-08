import javax.swing.JOptionPane;
import java.util.Scanner;
public class UsaClasse {
    public static void main(String[] args) {
        //Declaração e instanciação de objeto:
        Celular c1 = new Celular();
        Cliente cl = new Cliente();
        Medicamento me = new Medicamento();
        
        //Modo gráfico Celular:
        c1.marca = JOptionPane.showInputDialog("Entre com a marca do celular: ");
        c1.lancamento = JOptionPane.showInputDialog("Entre com a data de lançamento: ");
        c1.modelo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o o modelo: "));
        c1.preco = Float.parseFloat(JOptionPane.showInputDialog("Entre com o peço: "));

        //Saida celular:
        JOptionPane.showMessageDialog(null, "Marca: " + c1.marca +
         "\n Lancamento: " + c1.lancamento +
          "\n Modelo: " + c1.modelo +
           "\n Preço: " + c1.preco);
           // \n Para quebra de linha

           //Modo gráfico Cliente:
        Scanner leia = new Scanner(System.in);
        System.out.println("Entre com a idade: ");
        cl.idade = leia.nextInt();
        System.out.println("Entre com o nome: ");
        cl.nome = leia.next();
        System.out.println("Entre com o sexo: ");
        cl.sexo = leia.next();

        //Saída Cliente:
        System.out.println("Idade: " + cl.idade +
           "\nNome: " + cl.nome +
            "\nSexo: " + cl.sexo);


        //Modo gráfico Medicamento:
        me.farmacia = JOptionPane.showInputDialog("Entre com a fármacia que você comprou o medicamento: ");
        me.tipo = JOptionPane.showInputDialog("Entre com o tipo do mediocamento (Ex. Genérico): ");
        me.validade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a validade do medicamento: "));

        //Saida Medicamento:
        JOptionPane.showMessageDialog(null, "\n Farmácia: " + me.farmacia +
        "\n Tipo: " + me.tipo +
        "\n Validade: " + me.validade);
    }
}
