package Hash;

public class Advogado extends Funcionario{
  
    public Advogado(String nome, String titulo, Boolean privilegios, int senha) {
		super(nome, titulo, privilegios, senha);
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
