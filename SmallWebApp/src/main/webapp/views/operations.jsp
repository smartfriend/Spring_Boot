<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration page</h1>

	<form action="/details">
		User by ID: <input type="text" id="uid" name="uId"/><br><br>
		<select name="ddlFlag">
			<option value="select">Select Records</option>
			<option value="update">Update Records</option>
			<option value="delete">Delete Records</option>
		</select><br><br>

	<input type="submit" value="Click now"/>
	</form>
</body>
</html>