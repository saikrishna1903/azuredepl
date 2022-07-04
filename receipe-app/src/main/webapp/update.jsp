<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/update">

<table>
<tr><th>Enter the Recipe Id:</th><th><input type=text name=id value="${r.getId()}" required></th></tr>

<tr><th>Name of the Recipe</th><th><input type=text name="name" value="${r.getName()}" required></th></tr>
<tr><th>Date and time of its Creation</th><th><input type=text name="DateTime" value="${r.getDateTime()}" required></th></tr>
<tr><th>Type of Dish</th><th><input type=text name="TypeOfDish" value="${r.getTypeOfDish()}" required></th></tr>
<tr><th>Serves For </th><th><input type=text name="SuitableFor" value="${r.getSuitableFor()}" required></th></tr>
<tr><th>Ingredients</th><th><input type=text name="Ingredients" value="${r.getIngredients()}" required></th></tr>
<tr><th>CookingInstructions</th><th><input type=text name="CookingInstructions" value="${r.getCookingInstructions()}" required></th></tr>
<tr><th></th><th><button onclick="myFunction()">Update</button></th>

</table>
</form>
<h3><a href="/home">Home page</a></h3>

</body>
</html>