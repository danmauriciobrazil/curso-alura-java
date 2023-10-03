
public class CriarConta {

	public static void main(String[] args) {
		//curso alura
	Conta contaDoDanilo = new Conta(123,5656);
	contaDoDanilo.deposita(100);
	System.out.println("Saldo disponível : " + contaDoDanilo.pegaSaldo());
	
	Conta contaDoLuiz = new Conta(1234,5656);
	contaDoLuiz.deposita(200);
	System.out.println("Saldo disponível : " + contaDoLuiz.pegaSaldo());
	
	Conta contaDoPaulo = new Conta(123,5656);
	contaDoPaulo.deposita(400);
	System.out.println("Saldo disponível : " + contaDoPaulo.pegaSaldo());

	Conta contaDoPaulo = new Conta(12332,5656);
		contaDoPaulo.deposita(400);
		System.out.println("Saldo disponível : " + contaDoPaulo.pegaSaldo());

	Funcionarios funcDanilo = new Funcionarios();
	funcDanilo.setSalário(145.00);
	funcDanilo.setNome("Danilo");
	System.out.println("valor do salário de :" + funcDanilo.getNome()+" é :" +funcDanilo.getBonificacao());
	}
	
}
