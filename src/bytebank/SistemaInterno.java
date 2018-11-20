package bytebank;

public class SistemaInterno {
	
	private int senha = 1234;
	
	public void autentica(Autenticavel autenticavel) {
		boolean autenticou = autenticavel.autentica(this.senha);
		if (autenticou) {
			System.out.println("");
		}
	}
}
