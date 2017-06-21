package Web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.FuncionarioDAO;
import Gerenciador.Funcionario;

//@WebServlet(urlPatterns="/ExcluirFuncionario")
public class ExcluirFuncionario implements Tarefa{

	@Override
	public void executa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		String matricula = req.getParameter("matricula");

		Funcionario funcionario = new Funcionario();
		funcionario.setMatricula(matricula);
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.ExcluirFuncionarioArquivoTexto(funcionario);

//		req.setAttribute("funcionario", funcionario);
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/Paginas/FuncionarioExcluido.jsp");
//		requestDispatcher.forward(req, resp);
	}
}
