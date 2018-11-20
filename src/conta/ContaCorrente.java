package conta;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);//O java já faz implicitamente sem precisar chamar se for construtores padrões.
	}
	
	@Override
	public boolean saca(double valor) {
		double valorDescontar =  valor + 0.2;
		return super.saca(valorDescontar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;		
	}
}
