<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>Match Found!</h1>
<h1>Available Shirts: </h1>
${shirtModel.id }
${ shirtModel.color}
${ shirtModel.size}
${ shirtModel.gender}
${shirtModel.price }
${shirtModel.availability }
</center>


</body>
</html>