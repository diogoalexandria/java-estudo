package bytebank;

public abstract class Funcionario { //Não podemos instaciar objetos dessa classe.
	
	private String nome;
	private String cpf;
	private double salario;
	
	//Getters
	//Método sem corpo! Os filhos precisam implementar obrigatoriamente!
	public abstract double getBonificacao();	
	
	public String getNome() {
		return nome;		
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;		
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;		
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
