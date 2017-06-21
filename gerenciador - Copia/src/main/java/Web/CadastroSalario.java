package Web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.FuncaoDao;
import Dao.SalarioDao;
import Gerenciador.Funcao;
import Gerenciador.Salario;

public class CadastroSalario implements Tarefa {

	@Override
	public void executa(HttpServletRequest req, HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		String codigo = req.getParameter("codigo");
		String valor = req.getParameter("valor");

		Salario salario = new Salario(codigo, valor);
		SalarioDao salarioDao = new SalarioDao();
		salarioDao.AdicionarSalarioArquivoTexto(salario);

	}

}
