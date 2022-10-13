import javax.swing.JOptionPane;

public class Bhaskara {
    int var1, var2, var3;
    float delta, x1, x2;

    public Bhaskara(){
    }

    public Bhaskara(int a, int b, int c){ //Defina primeiro a variável em public e depois associe a ela o valor 
        var1 = a;
        var2 = b;
        var3 = c;
    }

    public float getDelta(){
        delta = (var2 * var2) + (-4 * var1 * var3);
        if(delta >= 0){
            getX1(); getX2();
            return delta;
        }
        else{
            JOptionPane.showInputDialog("Não!");
        }
    }
    public double getX1(){
        double x1;
        x1 = (double) ((-(var2) + Math.sqrt(delta)) / 2 * var2);
        return x1;
    }

    public double getX2(){
        double x2;
        x2 = (double) ((-(var2) - Math.sqrt(delta)) / 2 * var2);
        return x2;
    }

    public void entrada(){
        var1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de A: "));
        var2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de B: "));
        var3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor de C: "));
    }

    public void Print(){
        JOptionPane.showInputDialog(null, "O valor de delta é: " + getDelta());
        JOptionPane.showInputDialog("O valor de x1 é: " + getX1());
        JOptionPane.showInputDialog("O valor de x2 é: " + getX2());
    }
    public static void main(String[] args) {
        //Object:
        Bhaskara bh;
        bh = new Bhaskara();
        bh.entrada();
        bh.Print();
    }
}


