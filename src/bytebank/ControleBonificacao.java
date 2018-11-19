package bytebank;

public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();//Apesar de estar sendo passado como parametro um funcionario qualquer o metodo executado será o do objeto passado especificamente.
		this.soma = this.soma + bonificacao;
	}
	
	public double getSoma() {
		return soma;
	}
}
