<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Form</title>
</head>
<body>
	<h1> Welcome to the registration page</h1>
	<form action = "process" method="POST">
		<input type="text" name="studentName"/><br><br>
		<input type="password" name="studentPass"/><br><br>
		<input type="submit"/>
	</form>
	<hr>
</body>
</html>