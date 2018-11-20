package bytebank;

public class Estagiario extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o método de  bonificacao do estagiário.");
		return 50;
	}
}
