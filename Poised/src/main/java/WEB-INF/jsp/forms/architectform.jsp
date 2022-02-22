<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Architect Data</title>
</head>
<body>
<h2>Add New Architect Data</h2>

<form action="savearchitect" method="POST" modelAttribute="architect">

	<table>
	
		<tr>
			<td>Registration Number :</td>
			<td><input type="text" path="registrationNumber" placeholder="reg-Number"/></td>
		</tr>
		
		<tr>
			<td>Name :</td>
			<td><input type="text" path="name" placeholder="project Name" /></td>
		</tr>
		
		<tr>
			<td>Telephone :</td>
			<td><input type="text" path="telephone" placeholder="telephone"/></td>
		</tr>
		
		<tr>
			<td>Email :</td>
			<td><input type=?email? path="email" placeholder="Email" /></td>
		</tr>
		
		<tr>
			<td>Street Name :</td>
			<td><input type="text" path="address" placeholder="Street Name"/></td>
			
			<td>Suburb :</td>
			<td><input type="text" path="address" placeholder="suburb" /></td>
			
			<td>City :</td>
			<td><input type="text" path="address" placeholder="city"/></td>
		</tr>
			<tr>
		<td><input type="submit" value="Save"/></td>
	</tr>
		
	</table>

</form>

</body>
</html>