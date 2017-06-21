package Gerenciador;

public class Funcao {

	private String codigo;
	private String descricao;
	private String cod_salario;

	public Funcao() {
	}

	public Funcao(String codigo, String descricao, String cod_salario) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.cod_salario = cod_salario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCod_salario() {
		return cod_salario;
	}

	public void setCod_salario(String cod_salario) {
		this.cod_salario = cod_salario;
	}
}
