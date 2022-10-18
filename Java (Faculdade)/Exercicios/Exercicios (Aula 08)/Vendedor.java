import javax.swing.JOptionPane;
public class Vendedor {
    float vendas, salario;
    String nome;
    int falta;
    
    public Vendedor(float v, float s, String n, int f){
        vendas = v;
        salario = s;
        nome = n;
        falta = f;
    }

    public void setVendas(float v){
        this.vendas = v;
    }

    public float getVendas(){
        return vendas;
    }

    public void setSalario(float s){
        this.salario = s;

    }

    public float getSalario(){
        return salario;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return nome;
    }

    public void setFalta(int f){
        this.falta = f;
    }

    public int getFalta(){
        return falta;
    }

    public void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome +
        "\nFalta: " + falta +
          "\nComissão: " + calcularComissao() +
          "\nDesconto: " + descontoFalta() +
          "\nSalario: " + calcularSalario());
    }

    public float calcularSalario(){
        salario = (salario + calcularComissao() - descontoFalta());
        return salario;
    }

    public float calcularComissao(){
        float comissao;
        if(vendas >= 1000 && vendas <= 2000){
            comissao = vendas *10 / 100; 
        }
        else{
            comissao = vendas * 15 / 100;
        }
        return comissao;
    }

    public float descontoFalta(){
        float desconto;
        desconto = (salario/30)*falta;
        return desconto;
    }
}
