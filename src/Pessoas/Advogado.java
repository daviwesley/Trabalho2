package Pessoas;

public class Advogado extends Funcionario{
  
   

	public Advogado(String nome, String usuario, String titulo, Boolean privilegio, int senha) {
		super(nome, usuario, titulo, privilegio, senha);
		// TODO Auto-generated constructor stub
	}

	private String numOAB;
    
    public String getNumOAB() {
		return numOAB;
	}

	public void setNumOAB(String numOAB) {
		this.numOAB = numOAB;
	}

	public void verProcessos(){
    }
    
}    
