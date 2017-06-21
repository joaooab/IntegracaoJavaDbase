package Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Gerenciador.Funcao;
import Gerenciador.Funcionario;

public class FuncaoDao {

	public void AdicionarFuncaoArquivoTexto(Funcao funcao) throws IOException{
		FileWriter arquivo = new FileWriter("C:/JavaDBase/operacao.txt");
	    PrintWriter gravar = new PrintWriter(arquivo);
	    gravar.println("1");
	    gravar.println("2");
	    gravar.println(funcao.getCodigo());
	    gravar.println(funcao.getDescricao());
	    gravar.println(funcao.getCod_salario());
	    gravar.close();
	    arquivo.close();
	}

	public void AlterarFuncaoArquivoTexto(Funcao funcao) throws IOException{
		FileWriter arquivo = new FileWriter("C:/JavaDBase/operacao.txt");
	    PrintWriter gravar = new PrintWriter(arquivo);
	    gravar.println("2");
	    gravar.println("2");
	    gravar.println(funcao.getCodigo());
	    gravar.println(funcao.getDescricao());
	    gravar.println(funcao.getCod_salario());
	    gravar.close();
	    arquivo.close();
	}
}
