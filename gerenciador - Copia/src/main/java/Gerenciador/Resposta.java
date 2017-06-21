package Gerenciador;

public class Resposta {

	private int codDeErro;
	String menssagem;

	public Resposta(int codDeErro) {
		super();
		this.codDeErro = codDeErro;
	}

	public int getCodDeErro() {
		return codDeErro;
	}

	public void setCodDeErro(int codDeErro) {
		this.codDeErro = codDeErro;
	}

	public String getMenssagem() {
		return menssagem;
	}

	public void setMenssagem(String menssagem) {
		this.menssagem = menssagem;
	}

	public void RetornarMenssagemDeErro(){
		switch (codDeErro) {
		case 1:
			menssagem = "concluído";
			break;
		case 2:
			menssagem = "código de função inexistente para funcionario!";
			break;
		case 3: 
			menssagem = "matricula de funcionario já existente!";
			break;
		case 4:
			menssagem = "código de salário inexistente para funcao!";
			break;
		case 5:
			menssagem = "código de função já existente!";
			break;
		case 6:
			menssagem = "código de salário já existente!";
			break;
		case 7:
			menssagem = "matricula de funcionario inexistente!";
			break;
		case 8:
			menssagem = "código de função inexistente!";
			break;
		case 9:
			menssagem = "código de salário inexistente!";
			break;
		default:
			menssagem = "Erro";
		}
	}
}
