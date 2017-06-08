package Funcionario;

public class Funcionario {
	private String nome;
	private String titulo;
	private Boolean privilegios;
	private String senha;

	public Funcionario(String nome, String titulo, Boolean privilegios, String senha) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.privilegios = privilegios;
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
		return privilegios;
	}

	public void setPrivilegios(Boolean privilegios) {
		this.privilegios = privilegios;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
