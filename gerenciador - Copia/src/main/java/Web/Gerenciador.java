package Web;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Gerenciador.Resposta;

@WebServlet(urlPatterns = "/Gerenciador")
public class Gerenciador extends HttpServlet {

	public static final long TEMPO = 1000;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String tarefa = req.getParameter("tarefa");
		if (tarefa == null)
			throw new IllegalArgumentException("Faltou a tarefa");

		try {

			String nomeDaClasse = "Web." + tarefa;
			Class type = Class.forName(nomeDaClasse);
			Tarefa instancia = (Tarefa) type.newInstance();
			instancia.executa(req, resp);

			String linha = "";
			
			while (linha == null || linha =="") {
				try {
					Thread.sleep(TEMPO);
				} catch (Exception e) {
					e.printStackTrace();
				}
				InputStream is = new FileInputStream("C:/JavaDBase/resposta.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				System.out.println("Tentando ler arquivo");
				linha = br.readLine(); // primeira linha
				br.close();
			}

			int numeroResposta = Integer.parseInt(linha);
			linha = "";

			Resposta resposta = new Resposta(numeroResposta);
			resposta.RetornarMenssagemDeErro();

			req.setAttribute("resposta", resposta);

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/Paginas/Resultado.jsp");
			requestDispatcher.forward(req, resp);

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
