<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Client Data</title>
</head>
<body>
<h2>Add New Client Data</h2>

<form action="saveclient" method="POST" modelAttribute="client">

	<table>
		<tr>
			<td>ID :</td>
			<td><input type="text" path="id" placeholder="ID"/></td>
		</tr>
		
		<tr>
			<td>Name :</td>
			<td><input type="text" path="name" placeholder="Name"/></td>
		</tr>
		
		<tr>
			<td>Telephone :</td>
			<td><input type="text" path="telephone" placeholder="Telephone"/></td>
		</tr>
		
		<tr>
			<td>Email :</td>
			<td><input type=?email? path="email" placeholder="Email"/></td>
		</tr>
		
		<tr>
			<td>Street Name :</td>
			<td><input type="text" path="address" placeholder="StrtName"/></td>
			
			<td>Suburb :</td>
			<td><input type="text" path="address" placeholder="Suburb" /></td>
			
			<td>City :</td>
			<td><input type="text" path="address" placeholder="City"/></td>
		</tr>
		
		<tr>
		<td><input type="submit" value="Save"/></td>
		</tr>
	</table>

</form>


</body>
</html>