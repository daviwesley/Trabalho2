package Fila;

public class Fila  {
	private int tam;
	private No inicio;
	private No fim;

	public void adicionar(int x){
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
	
	private void adicionarInicio(int x){
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
	
	public void selectionSort(){
		for(No no1 = inicio; no1!=null; no1 = no1.getProx()){//percorre a lista
			No min = no1;//item da iteração
			//seleciona o menor nó
			for(No no2 = no1; no2!=null; no2 = no2.getProx()){
				if(min.getPrioridade() > no2.getPrioridade()){
					min = no2;
				}

			}
			//faz troca dos nós swap
			No temp = new No();
			temp.setConteudo(no1.getConteudo());//temp = no1;
			no1.setConteudo(min.getConteudo()); //no1 = min;
			min.setConteudo(temp.getConteudo()); //min = temp;
		}

	
	}
}

