<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		First Name : <form:input path="firstName"/>
		<br><br>
		Last Name : <form:input path="lastName"/>
		<br><br>
		Country :
		<form:select path="country">
			<form:options items="${ countryOptions }"/>
		</form:select>
		<br><br>

		Favourite Language <form:radiobuttons path="favouriteLanguage" items="${ languageOptions }" />
		
		<br><br>
		<input type="submit" value="submit"/>
		<br><br>	
	</form:form>

</body>
</html>