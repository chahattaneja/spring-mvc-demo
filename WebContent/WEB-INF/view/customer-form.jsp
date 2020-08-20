<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Customer Registration Form</title>

<style>
	.error{ color:red}
</style>

</head>
<body>

<i>All fields with * are mandatory</i>
<br><br>

<form:form action="processForm" modelAttribute="customer">
	First Name <form:input path="firstName" />
	<br><br>
	
	Last Name(*) <form:input path="lastName" />
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	
	Age &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<form:input path="age" />
	<form:errors path="age" cssClass="error"/>
	<br><br>
	
	<input type="submit" value="Submit">
	
</form:form>
</body>
</html>