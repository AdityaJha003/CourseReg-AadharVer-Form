<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Registration Form</title>
<style>
	.error{
		color:red
	}
</style>
</head>
<body>
	<h2>Course Registration</h2>
	Asterisk (*) means Required.
	<hr>
	<br>
	<form:form action="coursedis" method="post" modelAttribute="student">

		<label for="name"> Name(*)</label>
		<form:input type="text" path="name" />
		<form:errors path = "name" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="password">Password(*)</label>
		<form:input type="password" path="pass" />
		<form:errors path = "pass" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="mail">E-Mail(*)</label>
		<form:input type="text" path="mail" />
		<form:errors path = "mail" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="phNo">Phone Number</label>
		<form:input type="text" path="phNo" />
		<form:errors path = "phNo" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="aadharId">aadharId(*)</label>
		<form:input type="text" path="aadharId" />
		<form:errors path = "aadharId" cssClass="error"></form:errors>
		<br>
		<br>
		<label>DOB(*)</label>
		<form:input type="date" path="date" />
		<form:errors path = "date" cssClass="error"></form:errors>
		<br>
		<br>
		<label>Gender: </label>
        Male<form:radiobutton path="Gender" value="Male" />
        Female<form:radiobutton path="Gender" value="Female" />
		<br>
		<br>
		<%-- <label>Select State:</label>
		<form:select path="state">
			<form:options items='${student.stateOptions }' />
		</form:select>
		<form:errors path = "state" cssClass="error"></form:errors> --%>
		<%-- <form:errors path = "state" cssClass="error"></form:errors> --%>
		<br>
		<br>
		<%-- <label>Other Verification Options: </label>
		<form:checkboxes items="${student.otherOptions}" path="otherOptions" />
		<form:errors path = "otherOptions" cssClass="error"></form:errors>
		<br>
		<br> --%>
		<label>Address Details</label>
		<form:textarea path="address" rows="5" cols="30" />
		<form:errors path = "address" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="course"> Course(*)</label>
		<form:input type="text" path="course" />
		<form:errors path = "course" cssClass="error"></form:errors>
		<br>
		
		
		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</form:form>
</body>

</html>