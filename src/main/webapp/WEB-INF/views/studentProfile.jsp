<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="studentProfile.html" method="post">

<table border="1" align="center">

 <tr>
			<td>Student Id</td>
			<td>First Name</td>
			<td>last Name</td>
			<td>Father name</td>
			<td>Mother name</td>
			<td>Gender</td>
			<td>Date Of Birth</td>
			<td>Qualification</td>
			<td>Mail Id</td>
			<td>Mobile Number</td>
			<td> Adress_Line1</td>
			<td>City</td>
			<td>State</td>
			<td>ZipCode</td>
			<td>Admission Id</td>
			<td>Course Name</td>
			<td>Date Of Joining</td>
 </tr>
 
 <c:forEach items="${STUDET_DETAILS}" var="dept">
			<tr>
				<td><c:out value="${dept.deptId}"></c:out></td>
				<td><c:out value="${dept.deptName}"></c:out></td>
			</tr>
 </c:forEach>

</table>
</form:form>
</body>
</html>