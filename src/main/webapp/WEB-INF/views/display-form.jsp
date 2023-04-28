<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Details</title>
</head>
<body>
	<h2>Entered details are: </h2>
	<hr>
	<br>
	<h3>Name: ${updatedName}</h3>
	<h3>Password: ${user.userPassword}</h3>
	<h3>Aadhar Id: ${user.aadharId}</h3>
	<h3>State: ${user.state}</h3>
	<h3>Gender: ${user.gender}</h3>
	<h3>Other Options: ${user.otherOptions}</h3>
	<h3>Address: ${user.address}</h3>
	
	<hr>
	<br>
	
</body>
</html>