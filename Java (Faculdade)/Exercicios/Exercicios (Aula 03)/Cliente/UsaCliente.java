package Cliente;

import java.util.Scanner;

public class UsaCliente {
    public static void main(String[] args) {
        //Declaração do bjeto e instanciação:
        Cliente cl = new Cliente();

        //Modo gráfico:
        Scanner leia = new Scanner(System.in);
        System.out.println("Entre com a idade: ");
        cl.idade = leia.nextInt();
        System.out.println("Entre com o nome: ");
        cl.nome = leia.next();
        System.out.println("Entre com o sexo: ");
        cl.sexo = leia.next();

        //Saída:
        System.out.println("Idade: " + cl.idade +
           "\nNome: " + cl.nome +
            "\nSexo: " + cl.sexo);
    }
}
