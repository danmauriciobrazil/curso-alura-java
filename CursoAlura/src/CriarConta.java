
public class CriarConta {

	public static void main(String[] args) {
		
	Conta contaDoDanilo = new Conta(123,5656);
	contaDoDanilo.deposita(100);
	System.out.println("Saldo disponível : " + contaDoDanilo.pegaSaldo());
	
	Conta contaDoLuiz = new Conta(1234,5656);
	contaDoLuiz.deposita(200);
	System.out.println("Saldo disponível : " + contaDoLuiz.pegaSaldo());
	
	Conta contaDoPaulo = new Conta(123,5656);
	contaDoPaulo.deposita(400);
	System.out.println("Saldo disponível : " + contaDoPaulo.pegaSaldo());
	
	Funcionarios funcDanilo = new Funcionarios();
	funcDanilo.setSalário(145.00);
	funcDanilo.setNome("Danilo");
	System.out.println("valor do salário de :" + funcDanilo.getNome()+" é :" +funcDanilo.getBonificacao());
	
	Funcionarios funJuca = new Funcionarios();
	funJuca.setNome("Juca");
	funJuca.getBonificacao();
	funJuca.setSalario(5000);
	System.out.println("Valor da bonificação é:" + funJuca.getBonificacao());
	
	Gerente gerente = new Gerente();
	
	gerente.setNome("Danilo Mauricio");
	gerente.autenticaSenha(123);
	System.out.println("validação de senha: " + gerente.autenticaSenha(123) );
	
	}
	
}
