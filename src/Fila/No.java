package Fila;

public class No {

	private Object conteudo;
	private int prioridade;
	private No prox;
	private No ant;
	
	public Object getConteudo() {
		return conteudo;
	}
	public void setConteudo(Object conteudo) {
		this.conteudo = conteudo;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public No getProx() {
		// TODO Auto-generated method stub
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}

	public No getAnt() {
		return ant;
	}
	public void setAnt(No ant) {
		this.ant = ant;
	}
	
	
}
