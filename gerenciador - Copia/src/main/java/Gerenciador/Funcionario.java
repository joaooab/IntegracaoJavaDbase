package Gerenciador;


public class Funcionario {
	
	private String nome;
	private String matricula;
	private String endereco;
	private String codigo;
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nome, String matricula, String endereco, String codigo) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
