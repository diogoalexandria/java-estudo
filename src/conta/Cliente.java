package conta;

import bytebank.Autenticador;
import bytebank.Autenticavel;

public class Cliente implements Autenticavel{
	
	private String nome;
	private String cpf;
	private String profissao;
	private Autenticador autenticador;
	
	public String getNome() {
		return nome;
	}	
	public String getCpf() {
		return cpf;
	}	
	public String getProfissao() {
		return profissao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public Cliente() {
		this.autenticador = new Autenticador();
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
