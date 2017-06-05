package Hash;

public class Hash {
	private int conteudo[] = new int[7];
	
	
	public void adicionar(int chave){
		int a = chave % 7;
		this.conteudo[a] = chave;
	}
	
	public void imprimir(){
		for( int i = 0; i < this.conteudo.length; i ++){
			System.out.println("Posicão " + i + "conteudo= " + this.conteudo[i]);
		}
	}
}
