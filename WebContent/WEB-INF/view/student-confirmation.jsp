<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<body>
	
	Student Confirmed : ${ student.firstName } ${ student.lastName } 
	<br><br>
	Country : ${ student.country }
	<br><br>
	Favourite Language : ${ student.favouriteLanguage }
	<br><br>
	Operating Systems
	<ul>
		<c:forEach var="temp" items="${ student.operatingSystems }" >
			<li>${ temp }</li>
		</c:forEach>
	</ul>
	
</body>
</html>