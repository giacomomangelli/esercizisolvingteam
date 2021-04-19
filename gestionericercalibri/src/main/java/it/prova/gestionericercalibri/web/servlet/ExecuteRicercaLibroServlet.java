package it.prova.gestionericercalibri.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.gestionericercalibri.model.Libro;

@WebServlet("/ExecuteRicercaLibroServlet")
public class ExecuteRicercaLibroServlet extends HttpServlet {

	{
		Libro libro1 = new Libro("harry potter", "fantasy", 400);
		libri.add(libro1);
		Libro libro2 = new Libro("il signore degli anelli", "fantasy", 800);
		libri.add(libro2);
		Libro libro3 = new Libro("out out", "saggio", 200);
		libri.add(libro3);
	}
	
	private static final long serialVersionUID = 1L;
	
	public static List<Libro> libri = new ArrayList<>();
       
    public ExecuteRicercaLibroServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titleParameter = request.getParameter("titoloInput");
		String genderParameter = request.getParameter("genereInput");
		String pageParameter = request.getParameter("pagineInput");
		
		RequestDispatcher rd = null;
		Libro libro = confrontaLibri(titleParameter, genderParameter, pageParameter);
		
		if(libro!=null) {
			request.setAttribute("libro_attribute", libro);
			rd = request.getRequestDispatcher("librotrovato.jsp");
		}else {
			rd = request.getRequestDispatcher("libronontrovatocrea.jsp");
		}
		rd.forward(request, response);
	}
	
	public Libro confrontaLibri(String title, String gender, String page) {
		
		if(title == null || title.isEmpty() || gender == null || gender.isEmpty() || page == null || page.isEmpty()) {
			return null;
		}
		
		Libro libroTemp = new Libro(title,gender,Integer.valueOf(page));
		for(Libro libro : libri) {
			if(libro.equals(libroTemp)) {
				return libroTemp;
			}
		}
		
		return null;
	}

}
