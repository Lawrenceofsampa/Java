public class UsaClasse{
    //Criar méttodo principal
    public static void main(String args[]){
        //Declaração de objeto (Reserva espaço na memoria)
        Pessoa p1; //#1 
        //Instanciar o objeto (Associar os atributos  e métodos ao espaço declarado)
        p1 = new Pessoa(); //#2
        //Declaração e instanciação na mesma linha (Basicamente a mesma cois de #1, mas muito mais simplificado e direto)
         Pessoa p2 = new Pessoa(); //#3

         //Exibe os valores dos atributos
         System.out.println("Nome = " + p1.nome); //Comando de saída em java (Mesma coisa em python ós que masi complicado)
         System.out.println("Renda =" +p1.idade); //Para que saia o nome de um atributo faz-se necessário a definição do objeto e do valor (Ex: p1.idade) 
         System.out.println("Renda =" +p1.renda);
         //Atribuir valores para p2, ou seja, alterar os dados contidos

         p2.nome = "Silvio";
         p2.idade = 93;
         p2.renda = 5000.00;

         //Necessário criar outro formato de print para

         System.out.println("Nome = " + p2.nome);
         System.out.println("Renda = " + p2.idade); 
         System.out.println("Renda = " + p2.renda);
    }    
}
