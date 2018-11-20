package bytebank;

public class Gerente extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacão do gerente.");
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public Gerente () {
		this.autenticador = new Autenticador();
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
