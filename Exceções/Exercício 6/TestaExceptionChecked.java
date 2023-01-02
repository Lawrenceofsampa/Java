public class TestaExceptionChecked {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        try{
            conta.deposita();
        }catch(Exception ex){
            System.out.println("Treating...");
        }
    }
}
