package Hash;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hash h = new Hash();
		Funcionario f = new Advogado("Davi", "Dr.", true, 123456);
		Funcionario g = new Advogado("David", "Dr.", true, 12356);
		Funcionario i = new Advogado("Daniel", "Dr.", true, 877460);
		h.put(f);
		h.put(g);
		h.put(i);
		if(877460 == h.get("Daniel")){
			System.out.println("Senha correta");
		}else{
			System.out.println("Senha Incorreta");
		}
		h.imprimirHash();

	}

}
