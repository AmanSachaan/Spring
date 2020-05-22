<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<title>
Student Registration form
</title>


<style>
.error{color:red}</style>
</head>
<body>

<form:form action="processForm" modelAttribute="student">

First Name : <form:input path="firstName"/>
Last Name (*) : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>

<br>
No of Subjects enrolled :<form:input path="subjects" />
<form:errors path="subjects" cssClass="error"/>
<br>

Postal Code :<form:input path="postalCode" />
<form:errors path="postalCode" cssClass="error"/>
<br>

Course Code :<form:input path="courseCode" />
<form:errors path="courseCode" cssClass="error"/>
<br>


Country :
<form:select path="country">
<form:options items="${student.countryOptions }"/>



</form:select>

<br>
Favorite Language:
Java :<form:radiobutton path="favoriteLanguage" value="Java"/>
C<form:radiobutton path="favoriteLanguage" value="C"/>
Python<form:radiobutton path="favoriteLanguage" value="Python"/>
Cpp<form:radiobutton path="favoriteLanguage" value="Cpp"/>


<br>
Languages Worked on:
Java :<form:checkbox path="languagesWorked" value="Java"/>
C<form:checkbox path="languagesWorked" value="C"/>
Python<form:checkbox path="languagesWorked" value="Python"/>
Cpp<form:checkbox path="languagesWorked" value="Cpp"/>


<br>
<input type="submit" value="Submit">

</form:form>
</body>

</html>