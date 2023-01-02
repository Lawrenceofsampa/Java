public class Conexao implements AutoCloseable{
    public Conexao(){
        System.out.println("Opening");
    }

    void leDados(){
        System.out.println("Getting the code...");
        throw new IllegalStateException();
    }

    void fecha(){
        System.out.println("Closing conection");
    }

    @Override
    public void close() {   
        System.out.println("A mistake was made!");
    }
}
