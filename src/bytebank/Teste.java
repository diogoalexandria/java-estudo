package bytebank;

public class Teste {
	public static void main(String[] args) {
		
		Funcionario teste = new Gerente();
		
		teste.setNome("Diogo");
		teste.setCpf("999.999.999-99");
		teste.setSalario(2600.00);
		
		System.out.println("Nome: " + teste.getNome());
		System.out.println("Bonificação: " + teste.getBonificacao());
		
		
		Gerente gerente1 = new Gerente();
		
		gerente1.setNome("teste");
		gerente1.setCpf("000.000.000-00");
		gerente1.setSalario(5000.00);
		gerente1.setSenha(2222);
		
		boolean autenticacao = gerente1.autentica(2222);
		
		System.out.println();
		System.out.println("Nome do gerente: " + gerente1.getNome());
		System.out.println("CPF do gerente: " + gerente1.getCpf());
		System.out.println("Salário do gerente: " + gerente1.getSalario());
		System.out.println("Senha correta: " + autenticacao);
		
		//Funcionario funcionario = new Funcionario(); //Funcionario agora é abstrato não pode ser instanciado!
		Gerente gerente2 = new Gerente();		
		Caixa caixa = new Caixa();
		Estagiario estagiario = new Estagiario();
		ControleBonificacao controle =  new ControleBonificacao();
		
		//funcionario.setSalario(2000.0);
		gerente2.setSalario(5000.0);		
		caixa.setSalario(2500.0);
		estagiario.setSalario(1000.0);
		
		//controle.registra(funcionario);
		controle.registra(gerente2);		
		controle.registra(caixa);
		
		System.out.println("Total de bonificacao: " + controle.getSoma());
		
		Gerente gerente3 = new Gerente();
		gerente3.setSenha(1234);
		Administrador administrador = new Administrador();
		administrador.setSenha(4321);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(gerente3);
		sistema.autentica(administrador);		
		
	}
}
