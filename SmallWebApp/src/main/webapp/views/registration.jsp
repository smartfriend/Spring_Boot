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

	<form action="userDetail">
		User Name: <input type="text" name="userName" placeholder="enter username" /> <br> <br>
		Password: <input type="password" name="userPassword" placeholder="enter password" /> <br><br>
		Gender: <br>
			Female<input type="radio" name="gender" /> 
			Male<input type="radio" name="gender" /> <br><br>
		Hobbies: <br>
			Dancing<input type="checkbox" name="dancing" /> 
			Singing<input type="checkbox" name="singing" /> <br><br>
			<input type="submit" value="submit" />

	</form>
</body>
</html>