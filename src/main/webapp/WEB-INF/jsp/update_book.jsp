<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update_book" method="post" modelAttribute="book">
		<p>Name: <input type="text" name="name" id="name" /></p>
		<p>Price: <input type="number" name="price"/></p>
		<p>Author: <input type="text" name="author"/></p>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>