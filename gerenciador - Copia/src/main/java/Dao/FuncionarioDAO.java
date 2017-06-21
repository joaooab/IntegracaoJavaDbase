package Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Gerenciador.Funcionario;

public class FuncionarioDAO {
	
	public void AdicionarFuncionarioArquivoTexto(Funcionario funcionario) throws IOException{
		FileWriter arquivo = new FileWriter("C:/JavaDBase/operacao.txt");
	    PrintWriter gravar = new PrintWriter(arquivo);
	    gravar.println("1");
	    gravar.println("1");
	    gravar.println(funcionario.getMatricula());
	    gravar.println(funcionario.getNome());
	    gravar.println(funcionario.getEndereco());
	    gravar.println(funcionario.getCodigo());
	    gravar.close();
	    arquivo.close();
	}

	public void AlterarFuncionarioArquivoTexto(Funcionario funcionario) throws IOException{
		FileWriter arquivo = new FileWriter("C:/JavaDBase/operacao.txt");
	    PrintWriter gravar = new PrintWriter(arquivo);
	    gravar.println("2");
	    gravar.println("1");
	    gravar.println(funcionario.getMatricula());
	    gravar.println(funcionario.getNome());
	    gravar.println(funcionario.getEndereco());
	    gravar.println(funcionario.getCodigo());
	    gravar.close();
	    arquivo.close();
	}
	
	public void ExcluirFuncionarioArquivoTexto(Funcionario funcionario) throws IOException{
		FileWriter arquivo = new FileWriter("C:/JavaDBase/operacao.txt");
	    PrintWriter gravar = new PrintWriter(arquivo);
	    gravar.println("3");
	    gravar.println("1");
	    gravar.println(funcionario.getMatricula());
	    gravar.close();
	    arquivo.close();
	}
}
