package Hash;

public class Funcionario {
	private String nome;
	private String usuario;
	private String titulo;
	private Boolean privilegio;
	private int senha;

	

	public Funcionario(String nome, String usuario, String titulo, Boolean privilegio, int senha) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.titulo = titulo;
		this.privilegio = privilegio;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Boolean getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(Boolean privilegio) {
		this.privilegio = privilegio;
	}

}
