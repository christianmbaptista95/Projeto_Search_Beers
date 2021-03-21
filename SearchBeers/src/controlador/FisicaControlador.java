package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DaoFisica;
import modelo.Fisica;

@WebServlet("/FisicaControlador")
public class FisicaControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DaoFisica dao;

	public FisicaControlador() {
		super();
		dao = new DaoFisica();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String operacao = request.getParameter("operacao");

		switch (operacao) {

		case "insert":
			// Gravar registro no banco de dados
			incluiRegistro(request, response);
			break;

		case "delete":
			// Exluir registro no banco de dados

			break;

		case "update":
			// Atualizar registro no banco de dados
			break;

		case "select":
			// Exibir todos os registros no banco de dados

			break;

		case "selectNome":
			// Pesquisa pelo nome do os registro

			break;
		case "login":
			// Exibir todos os registros no banco de dados

			break;

		default:
			break;
			
		}
	}

	private void incluiRegistro(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
}
