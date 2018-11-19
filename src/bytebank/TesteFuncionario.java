package bytebank;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario teste = new Funcionario();
		
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
		
		Gerente gerente2 = new Gerente();
		Funcionario funcionario = new Funcionario();
		Caixa caixa = new Caixa();
		ControleBonificacao controle =  new ControleBonificacao();
		
		controle.registra(gerente2);
		controle.registra(funcionario);
		controle.registra(caixa);
		
		System.out.println("Total de bonificacao: " + controle.getSoma());
		
		
		
	}
}
