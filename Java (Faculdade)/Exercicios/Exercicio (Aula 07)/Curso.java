import javax.swing.JOptionPane;

public class Curso {
    String nome, turma;
    int qtdeAlunos;
    float mensalidade;

    public Curso(){

    }

    public Curso(String n, String t, int q, float m){
        nome = n;
        turma = t;
        qtdeAlunos = q;
        mensalidade = m;
        
    }

    public void cadastraCurso(){
        nome = JOptionPane.showInputDialog("Entre com o nome do curso: ");
        turma = JOptionPane.showInputDialog("Entre com a turma: ");
        qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de alunos: "));
        mensalidade = Float.parseFloat(JOptionPane.showInputDialog("Entre com a mensalidade: "));
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null,
         "\n Nome: " + nome +
          "\n Quantidade de alunos: " + qtdeAlunos +
          "\n Turma: " + turma +
          "\n Mensalidade: " + calculaTotalMensalidade());
    }

    public float calculaTotalMensalidade(){
        if (qtdeAlunos > 0){
            float total; 
            total = qtdeAlunos * mensalidade;
            return total;
        }
        else{
            return 0;
        }
    }
}
