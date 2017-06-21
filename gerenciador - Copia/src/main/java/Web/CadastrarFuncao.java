package Web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.FuncaoDao;
import Gerenciador.Funcao;

public class CadastrarFuncao implements Tarefa{

	@Override
	public void executa(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
		String codigo = req.getParameter("codigo");
		String descricao = req.getParameter("descricao");
		String cod_salario = req.getParameter("cod_salario");

		Funcao funcao = new Funcao(codigo, descricao, cod_salario);
		FuncaoDao funcaoDao = new FuncaoDao();
		funcaoDao.AdicionarFuncaoArquivoTexto(funcao);

	}
}
