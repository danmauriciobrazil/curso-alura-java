
public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
	
		primeiraConta.saldo +=200;
		primeiraConta.agencia =1;
		primeiraConta.numero =1234;
		primeiraConta.titular = "Danilo";
		primeiraConta.saldo +=200;
		System.out.println("Primeira Conta " + primeiraConta.saldo);
		
		segundaConta.saldo +=50;
		segundaConta.agencia =1;
		segundaConta.numero =1234;
		segundaConta.titular = "Danilo";
		segundaConta.saldo +=200;
		System.out.println("Segunda Conta " + segundaConta.saldo);
		
	}
}
