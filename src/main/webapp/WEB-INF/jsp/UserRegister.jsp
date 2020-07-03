<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.err{
color: red;
}
</style>
</head>
<body>
<h2 style="text-align: center;">Welcome to UserRegistrationPage</h2>
<pre>
<form:form method="post" action="save" modelAttribute="user">
	<form:errors path="userName" cssClass="err"></form:errors>
Name:<form:input path="userName"/>

		<form:errors path="userPwd" cssClass="err"></form:errors>
Password:<form:input path="userPwd"/>
Gender: 
		<form:errors path="userGen" cssClass="err"></form:errors>
		<form:radiobutton path="userGen" value="male"/>male
		<form:radiobutton path="userGen" value="female"/>female
Courses:
		<form:errors path="userCours" cssClass="err"></form:errors>
		<form:select path="userCours">
		<form:option value="">select</form:option>
		<form:option value="Angular">Angular</form:option>
		<form:option value="Spring">Spring</form:option>
		<form:option value="Devops">Devops</form:option>
		</form:select>
Address:
		<form:errors path="userAddr" cssClass="err"></form:errors>
		<form:textarea path="userAddr" rows="3" cols="4"/>	
		
Languages:
		<form:errors path="userLang" cssClass="err"></form:errors>
		<form:checkbox path="userLang" value="Eng"/>Eng
		<form:checkbox path="userLang" value="Tel"/>Tel
		<form:checkbox path="userLang" value="Hin"/>Hin	
		
		<input type="submit" value="User">
</form:form>
</pre>
${info}
</body>
</html>