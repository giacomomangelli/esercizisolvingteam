<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ricerca Libro</title>
	</head>
	<body>
	<form action="ExecuteRicercaLibroServlet" method="post">
		<label>Titolo: </label><br>
		<input type = "text" name = "titoloInput" /><br>
		<label>Genere: </label><br>
		<input type = "text" name = "genereInput" /><br>
		<label>Pagine: </label><br>
		<input type = "text" name = "pagineInput" /><br>
		<input type = "submit" value = "cerca" />
	</form>
	</body>
</html>