package bytebank;

public class Caixa extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificac�o do caixa.");
		return 250;
	}
}
