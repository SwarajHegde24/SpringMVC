<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TShirts</title>
</head>
<body>
	<center>
		<h1>Welcome ${ ver.userName}</h1>
		<hr>
		<h2>Product Search Page</h2>
	</center>

	<center>
	<form action="add.obj" modelAttribute="shirtModel">
		Color: <input path="color" />
		<A:errors path="color" cssStyle="color:red" />
		<br> <br> Size: <input path="size" />
		<A:errors path="size" cssStyle="color:red" />
		<br> <br> Gender: <input path="gender" />
		<A:errors path="gender" cssStyle="color:red" />
		<br> <br> <input type="submit">
	</form>
	</center>
	


</body>
</html>


