package Hash;

public class Hash {
	private int conteudo[] = new int[11];

	public void adicionar(int chave) {
		int a = chave % 7;
		this.conteudo[this.hash(chave)] = chave;
	}

	public void imprimir() {
		for (int i = 0; i < this.conteudo.length; i++) {
			System.out.println("Posicão " + i + "conteudo= " + this.conteudo[i]);
		}
	}

	public boolean ePrimo(int n) {
		boolean primo = true;
		for (int i = 3; i <= Math.sqrt(n); i += 2)
			if (n % i == 0) {
				primo = false;
				break;
			}
		if ((n % 2 != 0 && primo && n > 2) || n == 2)
			return true;
		else
			return false;
	}
	
	public int primoAnterior(int n)
    {
        n--;
        while(!ePrimo(n))
            n--;
        return n;
    }
	
	public int hash(int value)
    {
        return primoAnterior(11) - (value%primoAnterior(11));
    }
	
}
