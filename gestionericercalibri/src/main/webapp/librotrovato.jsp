<%@page import="it.prova.gestionericercalibri.model.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Libro trovato</title>
	</head>
	<body>
		<% Libro ilMioLibro = (Libro) request.getAttribute("libro_attribute"); %>
		Il libro che cerchi è: <br><br>
		Titolo: <%= ilMioLibro.getTitolo()%> <br>
		Genere: <%= ilMioLibro.getGenere()%> <br>
		Pagine: <%= ilMioLibro.getPagine()%> <br><br>
		<a href="cercalibro.jsp">home</a>
	</body>
</html>