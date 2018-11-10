
public class Gerente extends Funcionarios {

	private int senha =123;
	
	public boolean autenticaSenha(int senha) {
		if(this.senha == senha){
			return true;
		}else {
			return false;
		}
	}
	
	
	
}

