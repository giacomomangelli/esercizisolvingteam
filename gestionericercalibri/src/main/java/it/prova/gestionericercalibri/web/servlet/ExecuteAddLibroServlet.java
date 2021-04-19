package it.prova.gestionericercalibri.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.gestionericercalibri.model.Libro;

@WebServlet("/ExecuteAddLibroServlet")
public class ExecuteAddLibroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteAddLibroServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titleParameter = request.getParameter("titoloInputCrea");
		String genderParameter = request.getParameter("genereInputCrea");
		String pageParameter = request.getParameter("pagineInputCrea");
		
		RequestDispatcher rd = null;
		Libro libro = creaLibro(titleParameter, genderParameter, pageParameter);
		if(libro != null) {
			ExecuteRicercaLibroServlet.libri.add(libro);
			rd = request.getRequestDispatcher("operazioneok.jsp");
		}else {
			rd = request.getRequestDispatcher("libronontrovatocrea.jsp");
		}
		rd.forward(request, response);
	}
	
	public Libro creaLibro(String titolo, String genere, String pagine) {
		
		if(titolo == null || titolo.isEmpty() || genere == null || genere.isEmpty() || pagine == null || pagine.isEmpty()) {
			return null;
		}
		
		Libro libro = new Libro(titolo, genere, Integer.valueOf(pagine));
				
		return libro;
	}

}
