package Web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Tarefa {

	void executa(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
