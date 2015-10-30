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
<form:form action="createStudent.html" method="post">
<table>

<tr>
 <td><form:label path="firstName">Enter first name</form:label></td>
<td><form:input path="firstName"/>
</td>
</tr>

<tr>
<td><form:label path="lastName">Enter last name</form:label></td>
<td><form:input path="lastName"/></td>
</tr>

<tr>
<td><form:label path="fatherName">Enter father name</form:label></td>
<td><form:input path="fatherName"/></td>
</tr>

<tr>
<td><form:label path="motherName">Enter mother name</form:label></td>
<td><form:input path="motherName"/></td>
</tr>

<tr>
<td><form:label path="gender">Enter gender</form:label></td>
<td><form:input path="gender"/></td>
</tr>

<tr>
<td><form:label path="dateOfBirth">Enter your date of birth</form:label></td>
<td><form:input path="dateOfBirth"/></td>
</tr>

<tr>
<td><form:label path="qualification">Enter your qualification</form:label></td>
<td><form:input path="qualification"/></td>
</tr>

<tr>
<td><form:label path="mailId">Enter your mailId</form:label></td>
<td><form:input path="mailId"/></td>
</tr>

<tr>
<td><form:label path="mobileNum">Enter your mobile number</form:label></td>
<td><form:input path="mobileNum"/></td>
</tr>

<tr>
<td><form:label path="address.line1">Enter line1</form:label></td>
<td><form:input path="address.line1"/></td>
</tr>

<tr>
<td><form:label path="address.city">Enter your city</form:label></td>
<td><form:input path="address.city"/></td>
</tr>

<tr>
<td><form:label path="address.state">Enter your state</form:label></td>
<td><form:input path="address.state"/></td>
</tr>

<tr>
<td><form:label path="address.zipcode">Enter your zipcode</form:label></td>
<td><form:input path="address.zipcode"/></td>
</tr>

<tr><td><input type="submit" value="submit"/></td></tr>

</table>

</form:form>
</body>
</html>