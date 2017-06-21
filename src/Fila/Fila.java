package Fila;


public class Fila<T>  {
	private int tam;
	private No inicio;
	private No fim;

	public void adicionar(T x){
		//adiciona no fim
		if(this.inicio == null){
			this.adicionarInicio(x);
		}else{
		No n = new No();
		n.setConteudo(x);
		fim.setProx(n);
		fim = n;
		this.tam++;
		}
	}
	
	private void adicionarInicio(T x){
		No n = new No();
		n.setConteudo(x);
		if(inicio == null){
			inicio = n;
			fim = n;			
		}else{
			n.setProx(inicio);
			this.inicio = n;				
		}		
		this.tam++;
	}
	
	public void remover(){
		//remove do inicio
		if(inicio == null){
			throw new IllegalArgumentException("A lista est� vazia");
		}
		No temp = inicio;
		inicio = temp.getProx();
		this.tam--;
	}
	
	@Override
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(No n = inicio; n != null; n = n.getProx()){
			string.append(n.getConteudo());
			string.append(" ");
		}
		return string.toString();
	}

	public T pegar(int i) {
        No<T> atual = this.inicio;
        for (int j = 0; j < i; j++) {
            atual = atual.getProx();
        }
        return atual.getConteudo();
    }
	
	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}
	
	
}

