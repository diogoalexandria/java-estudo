package bytebank;

public class Caixa extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do caixa.");
		return 250;
	}
}
