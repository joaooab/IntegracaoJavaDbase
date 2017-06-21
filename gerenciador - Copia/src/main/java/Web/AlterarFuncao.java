package Web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.FuncaoDao;
import Dao.FuncionarioDAO;
import Gerenciador.Funcao;
import Gerenciador.Funcionario;

//@WebServlet(urlPatterns = "/alterarFuncao")
public class AlterarFuncao implements Tarefa {
	 
	@Override
	public void executa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
		String codigo = req.getParameter("codigo");
		String descricao = req.getParameter("descricao");
		String cod_salario = req.getParameter("cod_salario");

		Funcao funcao = new Funcao(codigo, descricao, cod_salario);
		FuncaoDao funcaoDao = new FuncaoDao();
		funcaoDao.AlterarFuncaoArquivoTexto(funcao);

//		req.setAttribute("funcao", funcao);
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/Paginas/FuncionarioAlterado.jsp");
//		requestDispatcher.forward(req, resp);
	}
}
