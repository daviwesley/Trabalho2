package Hash;

public class Funcionario {
	private String nome;
	private String titulo;
	private Boolean privilegio;
	private int senha;

	public Funcionario(String nome, String titulo, Boolean privilegios, int senha) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.privilegio = privilegios;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Boolean getPrivilegios() {
		return privilegio;
	}

	public void setPrivilegios(Boolean privilegios) {
		this.privilegio = privilegios;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	

}
