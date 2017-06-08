package Hash;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash h = new Hash();
		Funcionario f = new Advogado("Davi Wesley", "daviwesley","Dr.", true,123456);
		Funcionario g = new Advogado("Daniel", "daviwesley","Dr.", true,123456);
		h.put(f);
		h.put(g);
		if(123456 == h.get("daviwesley")){
			System.out.println("Senha correta");
		}else{
			System.out.println("Senha Incorreta");
		}
		

	}

}
