<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Libro Non Trovato</title>
	</head>
	<body>
		Libro richiesto non trovato. Crearne uno? <br><br>
		<form action="ExecuteAddLibroServlet" method="post">
			<label>Titolo: </label><br>
			<input type = "text" name = "titoloInputCrea" /><br>
			<label>Genere: </label><br>
			<input type = "text" name = "genereInputCrea" /><br>
			<label>Pagine: </label><br>
			<input type = "text" name = "pagineInputCrea" /><br>
			<input type = "submit" value = "Add" /><br><br>
		</form>
	</body>
</html>