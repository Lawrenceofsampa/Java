public class UsaCurso{
    public static void main(String[] args) {
        
        Curso c1, c2;
        c1 = new Curso();
        c1.cadastraCurso();
        c1.calculaTotalMensalidade();
        c1.imprimeDados();

        c2 = new Curso("ADS","3K",30, 300);
        c2.calculaTotalMensalidade();
        c2.imprimeDados();


    }
}
