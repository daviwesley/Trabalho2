package Processo;
import java.util.Random;

public class Processo {

	private int ID;
	private int prioridade;
	private String nomeVitima;
	private String nomeAcusado;
	private String nomeAdvogado;
	private String shortDescription;
	
	public Processo(int prioridade, String nomeVitima, String nomeAcusado, String nomeAdvogado,
			String shortDescription) {
		super();
		this.ID = gerarID();
		this.prioridade = prioridade;
		this.nomeVitima = nomeVitima;
		this.nomeAcusado = nomeAcusado;
		this.nomeAdvogado = nomeAdvogado;
		this.shortDescription = shortDescription;
	}

	public Processo() {
		// TODO Auto-generated constructor stub
		super();
	}

	

	public int gerarID() {
		Random rand = new Random();
		int randomNum = rand.nextInt((10000 - 1000) + 1) + 1000;
		return randomNum;
	}

	public void ImprimirProcesso() {
		System.out.println("ID: " + this.ID);
		System.out.println("Nome da Vítima: " + this.nomeVitima);
		System.out.println("Nome do Acusado: " + this.nomeAcusado);
		System.out.println("Nome do Advogado: " + this.nomeAdvogado);
		System.out.println("Descrição: " + this.nomeVitima);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public String getNomeVitima() {
		return nomeVitima;
	}

	public void setNomeVitima(String nomeVitima) {
		this.nomeVitima = nomeVitima;
	}

	public String getNomeAcusado() {
		return nomeAcusado;
	}

	public void setNomeAcusado(String nomeAcusado) {
		this.nomeAcusado = nomeAcusado;
	}

	public String getNomeAdvogado() {
		return nomeAdvogado;
	}

	public void setNomeAdvogado(String nomeAdvogado) {
		this.nomeAdvogado = nomeAdvogado;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public void Imprimir(){
		System.out.println("Id: " + this.getID());
        System.out.println("Nome da Vitima: " + this.getNomeVitima());
        System.out.println("Nome do Acusado: " + this.getNomeAcusado());
        System.out.println("Nome do Advogado: " + this.getNomeAdvogado());
        System.out.println("Descricao: " + this.getShortDescription());
        System.out.println("Prioridade: " + this.getPrioridade());
	}
	
	
}
