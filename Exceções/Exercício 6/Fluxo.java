public class Fluxo {
	//O compiler, quando perceber o problema na execução do programa irá voltar procurando soluções para este já que é uma pilha de execução, mas assim que ele identifica a exceção este não volta a executar o bloco deixado para trás pois é lá que esta o problema. Sendo assim, o compiler finaliza na última linha de código disponivel sem problemas de volta.


	public static void main(String[] args){
		System.out.println("Ini do main");
		try{
		    metodo1();
		} catch(Exception ex /*ex é uma referência*/) {
		    String msg = ex.getMessage();
		    System.out.println("Exception " + msg);
		    ex.printStackTrace();
		} 
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaException{
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaException{
		System.out.println("Ini do metodo2");
	    throw new MinhaException("Deu erro");
		//System.out.println("Fim do metodo2");		
	}
}

