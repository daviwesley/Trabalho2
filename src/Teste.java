import Pilha.Pilha;
import Processo.Processo;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processo p = new Processo();
		Pilha a = new Pilha();
		a.adicionar(p);
		p.ImprimirProcesso();
		String davi = "b";
		int d = davi.hashCode();
		System.out.println(d);
	}
}
