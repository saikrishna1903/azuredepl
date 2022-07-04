<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add">
<table>
<tr><th>Name of the Recipe</th><th><input type=text name="name" required></th></tr>
<tr><th>Type of Dish</th><th><select name="TypeOfDish" required>
    <option value="veg">Veg</option>
    <option value="non-veg">Non-Veg</option>
    
  </select></th></tr>
<tr><th>Serves For </th><th><input type=text name="SuitableFor" required></th></tr>
<tr><th>Ingredients</th> <th><input type=text name="Ingredients" required></th></tr>
<tr><th>CookingInstructions</th><th><input type=text name="CookingInstructions" required></th></tr>
<tr><th><input type=submit ></th></tr>
</table>
</form>
<h3><a href="/home">Home page</a></h3>
</body>
</html>