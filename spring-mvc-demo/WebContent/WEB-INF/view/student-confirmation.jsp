<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<title>
Student Confirmation
</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName} 

<br>
<br>

Subjects enrolled : ${student.subjects}
<br>

<br>

Postal Code : ${student.postalCode}
<br>

Course Code : ${student.courseCode}
<br>

Country :${student.country}
<br>

Favorite Language : ${student.favoriteLanguage }

<br>

Languages Worked on  :
<ul>
<c:forEach var="temp" items ="${student.languagesWorked }">
<li>  ${temp} </li>
</c:forEach>
</ul>
</body>

</html>