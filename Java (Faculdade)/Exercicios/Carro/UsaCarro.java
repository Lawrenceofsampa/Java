
import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class UsaCarro {
    private static Object message;

    public static void main(String[] args) {
        //Declaratio and instantion 
        Carro fusca = new Carro(); // Dois objetos associados a carro
        Carro gol = new Carro();
        
        //Entrada de dados
        //Solicita ao usuário valores e atributos

        //Modo gráfico
        fusca.marca = JOptionPane.showInputDialog("Entre com a marca do carro: "); // Classe JOptionPane.showInputDialog para criar alteração com usuário
        fusca.modelo = JOptionPane.showInputDialog("Digite o modelo: "); //Nota-se que as classes são puxadas daquelas definidas anteriormente no arquivo Carro
        fusca.ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano: "));
        //Saida de dados - Escreva
        //Modo Gráfico

        JOptionPane.showMessageDialog(null,
            "Marca:  " + fusca.marca +
          "\nModelo: " + fusca.modelo +
           "\n Ano: " + fusca.ano +
           "\n Cor: " + fusca.cor);

           //Entrada de dados:
           //Modo texto
           Scanner leia = new Scanner(System.in);
           System.out.println("Digite a marca: ");
           gol.marca = leia.next();
           System.out.println("Entre com o modelo: ");
           gol.modelo = leia.next();
           System.out.println("Digite o ano: ");
           gol.ano = leia.nextInt();
           System.out.println("Digite a cor: ");
           gol.cor = leia.next();

           //Saida de dados
           System.out.println("Marca = " + gol.marca +
           "\nModelo = " + gol.modelo +
            "\n Cor = " + gol.cor + 
            "\nAno = " + gol.ano);


}
}
