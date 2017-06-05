package Pilha;

import Fila.No;
import Processo.Processo;

public class Pilha {

	private No inicio;
	private No fim;
	private Object processo;
	private No prox;
	private int tam;
	
	private void adicionarInicio(Object x){
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
	
	public void adicionar(Object x){
		//adicionar no fim
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
	
	public void removerFinal(){
		No aux = fim.getAnt();
		aux.setProx(null);
		fim = aux;
	}
	
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(No n = inicio; n != null; n = n.getProx()){
			string.append(n.getConteudo());
			string.append(" ");
		}
		return string.toString();
	}
	
}
