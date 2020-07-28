<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Details</h1>
 
User Name: ${modelObj.userName}<br>
User Email: ${modelObj.userEmail}<br>
User Gender: ${modelObj.gender}<br>
User Hobbies: ${modelObj.hobbies[0]}, ${modelObj.hobbies[1]}
</body>
</html>