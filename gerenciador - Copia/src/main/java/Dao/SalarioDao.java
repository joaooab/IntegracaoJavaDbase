package Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Gerenciador.Funcao;
import Gerenciador.Salario;

public class SalarioDao {

	public void AdicionarSalarioArquivoTexto(Salario salario) throws IOException{
		FileWriter arquivo = new FileWriter("C:/JavaDBase/operacao.txt");
	    PrintWriter gravar = new PrintWriter(arquivo);
	    gravar.println("1");
	    gravar.println("3");
	    gravar.println(salario.getCodigo());
	    gravar.println(salario.getValor());
	    gravar.close();
	    arquivo.close();
	}

	public void AlterarSalarioArquivoTexto(Salario salario) throws IOException{
		FileWriter arquivo = new FileWriter("C:/JavaDBase/operacao.txt");
	    PrintWriter gravar = new PrintWriter(arquivo);
	    gravar.println("2");
	    gravar.println("3");
	    gravar.println(salario.getCodigo());
	    gravar.println(salario.getValor());
	    gravar.close();
	    arquivo.close();
	}
}
