<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Student List</title>
<style type="text/css">
body {
	margin: 0;
	height: 100vh;
	display: flex;
	justify-content: center;
	background: antiquewhite;
	color: #4204b1;
}

th {
	background: #f98599;
}
</style>
</head>
<body>
	<div>
		<h2>Student List</h2>
		<a href="/student-crud/students/add">Add New</a>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>cource</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="student" items="${students}">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.cource}</td>
					<td><a href="/student-crud/students/edit?id=${student.id}">Edit</a>
						<a href="/student-crud/students/delete?id=${student.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>