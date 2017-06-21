package Gerenciador;

public class Salario {

	private String codigo;
	private String valor;

	public Salario(String codigo, String valor) {
		this.codigo = codigo;
		this.valor = valor;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
