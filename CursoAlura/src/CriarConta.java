
public class CriarConta {

	public static void main(String[] args) {
		
	Conta contaDoDanilo = new Conta();
	contaDoDanilo.deposita(100);
	System.out.println("Saldo dispon�vel : " + contaDoDanilo.pegaSaldo());
	}
	
}
