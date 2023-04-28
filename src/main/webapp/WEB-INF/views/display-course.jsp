<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Course Details</title>
</head>
<body>
	<h2>Entered Details are:</h2>
	<hr>
	<br>
	<h3>
		Name: ${student.name}<br> ${errname }
	</h3>
	<h3>
		Password: ${student.pass} <br> ${passLen }${passSpe }${wrpass }
	</h3>
	<h3>Mail: ${student.mail} ${wrmail }</h3>
	<h3>Phone number: ${student.phNo}</h3>
	<h3>Aadhar ID: ${student.aadharId}</h3>
	<h3>DOB: ${student.date}</h3>
	<h3>Gender: ${student.gender}</h3>
	
<%-- 	<h3>State: ${student.state}</h3> --%>
<%-- 	<h3>Other Verification Options: ${student.otherOptions}</h3> --%>
	<h3>Address: ${student.address} ${wraddress }</h3>
	<hr>
</body>
</html>