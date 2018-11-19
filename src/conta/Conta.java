package conta;

public abstract class Conta {
	protected double saldo;
    private int agencia;
    private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Nº de contas: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando conta...");
		System.out.println("Conta criada!");
		System.out.println(this.numero + " " + this.agencia);
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}		
		return false;
	}
	
	//getters
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	//setters
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Número inválido.");
		}
		this.numero = numero;		
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Agência inválida.");
		}
		this.agencia = agencia;
	}	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static void setTotal(int total) {
		Conta.total = total;
	}
}
