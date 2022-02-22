<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Client</title>
</head>
<body>
<h2>Edit Client Details</h2>
<form method="POST" action="/Poise/editclient">

	<table>
		
			<tr>
				<td>Client's ID :</td>
				<td><input type="text" path="id" placeholder="id" ></td>
			</tr>
			
			<tr>
				<td>Name :</td>
				<td><input type="text" path="name" placeholder="name"></td>
			</tr>
			
			<tr>
				<td>Telephone :</td>
				<td><input type="text" path="telephone" placeholder="telephone"></td>
			</tr>
			
			<tr>
				<td>Email :</td>
				<td><input type=?text? path="email" placeholder="email"></td>
			</tr>
			
			<tr>
				<td>Street Name :</td>
				<td><input type="text" path="address" placeholder="strt-Name"></td>
				
				<td>Suburb :</td>
				<td><input type="text" path="address" placeholder="suburb"></td>
				
				<td>City :</td>
				<td><input type="text" path="address" placeholder="city"></td>
					</tr>	
					
				<tr>
				<td><input type="submit" value="Save"/></td>
				</tr>
		
	</table>

</form>


</body>
</html>