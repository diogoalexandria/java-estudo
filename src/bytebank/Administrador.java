package bytebank;

public class Administrador extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;
	
	@Override
	public double getBonificacao() {
		return 100;
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	
	}
	
	public Administrador() {
		this.autenticador = new Autenticador();
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
