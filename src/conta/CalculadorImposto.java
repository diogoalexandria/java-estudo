package conta;

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValor();
		this.totalImposto += valor;
	}
	
	public double getValorImposto() {
		return totalImposto;
	}
}
