package Web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.FuncionarioDAO;
import Gerenciador.Funcionario;

//@WebServlet(urlPatterns="/AlterarFuncionario")
public class AlterarFuncionario implements Tarefa{
	
	@Override
	public void executa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		String nome = req.getParameter("nome");
		String matricula = req.getParameter("matricula");
		String endereco = req.getParameter("endereco");
		String codigo = req.getParameter("codigo");

		Funcionario funcionario = new Funcionario(nome, matricula, endereco, codigo);
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.AlterarFuncionarioArquivoTexto(funcionario);

//		req.setAttribute("funcionario", funcionario);
//		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/Paginas/FuncionarioAlterado.jsp");
//		requestDispatcher.forward(req, resp);
	}
}
