package conta;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 11111);
		contaCorrente.deposita(100.0);
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 22222);
		contaPoupanca.deposita(200.0);
		System.out.println("Saldo da conta poupan�a: " + contaPoupanca.getSaldo());
		
		System.out.println("Tranferindo...");
		contaCorrente.transfere(10.0, contaPoupanca);
		
		System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupan�a: " + contaPoupanca.getSaldo());
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		System.out.println("Registrando Conta Corrente...");
		calculadorImposto.registra(contaCorrente);
		System.out.println("Total de imposto: " + calculadorImposto.getValorImposto());
		System.out.println("Registrando Seguro de vida...");
		calculadorImposto.registra(seguroDeVida);
		System.out.println("Total de imposto: " + calculadorImposto.getValorImposto());

	}

}
