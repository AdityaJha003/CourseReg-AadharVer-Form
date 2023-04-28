
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aadhar Registration Form</title>
</head>
<body>
	<h2>Aadhar Verification Registration Form</h2>

	<hr>
	<br>
	<form:form action="display" method="post" modelAttribute="user">

		<label for="name">User Name</label>
		<form:input type="text" path="userName" />
		<br>
		<br>
		<label for="password">Password</label>
		<form:input type="password" path="userPassword" />
		<br>
		<br>
		<label for="id">Aadhar ID</label>
		<form:input type="text" path="aadharId" />
		<br>
		<br>
		<label>Enter State:</label>
		<form:select path="state">
			<%-- <form:option value="Delhi" label="Delhi" />
			<form:option value="UP" label="Uttar Pradesh" />
			<form:option value="HR" label="Haryana" />
			<form:option value="MH" label="Maharashtra" />
			<form:option value="PB" label="Punjab" /> --%>
			
			<form:options items = '${user.stateOptions}' />
		</form:select>
		<br>
		<br>
		<br>
		<label>Gender: </label>
		Male<form:radiobutton path="Gender" value="Male" />  
        Female<form:radiobutton path="Gender" value="Female" />
		<br>
		<br>
		<label>Other Verification Options: </label>
		
		<%-- PAN<form:checkbox path="otherOptions" value="PAN" />  
        Driving License<form:checkbox path="otherOptions"
			value="Driving License" />  
        Voter Id<form:checkbox path="otherOptions" value="Voter Id" /> --%>
        
        <form:checkboxes path='otherOptions' items='${user.otherOptions}' />
		<br>
		<br>

		<label>Address Details</label>
		<br>
		<form:textarea path="address" rows="5" cols="30" />
		<br>
		<br>

		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</form:form>
</body>

</html>

