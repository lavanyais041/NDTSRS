<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="studentAdmission.html" method="post">
<table>

<tr>
<td><form:label path="student.studentId">Enter Student Id</form:label></td>
<td><form:input path="student.studentId"/></td>
</tr> 

 <tr>
 <td><form:label path="course.courseId">Enter CourseId</form:label></td>
<td><form:input path="course.courseId"/>
</td>
</tr>

<tr>
<td><form:label path="dateOfJoining">Enter Date Of Joining</form:label></td>
<td><form:input path="dateOfJoining"/></td>
</tr>

<tr><td><input type="submit" value="submit"/></td></tr>

</table>
</form:form>
</body>
</html>