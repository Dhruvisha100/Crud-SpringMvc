<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Student Form</title>
<style type="text/css">
body {
	margin: 0;
	height: 100vh;
	display: flex;
	justify-content: center;
	background: antiquewhite;
	color: #4204b1;
}

input {
	background: antiquewhite;
	color: #4204b1;
}
</style>
</head>
<body>
	<div>
		<h2>Student Form</h2>
		<form action="/student-crud/students/save" method="post">
			<input type="hidden" name="id" value="${student.id}" /> Name: <input
				type="text" name="name" value="${student.name}" /><br /> Email: <input
				type="text" name="email" value="${student.email}" /><br /> Course:
			<input type="text" name="cource" value="${student.cource}" /><br />
			<input type="submit" value="Save" style="background: #4204b1; color:antiquewhite" />
		</form>
	</div>
</body>
</html>