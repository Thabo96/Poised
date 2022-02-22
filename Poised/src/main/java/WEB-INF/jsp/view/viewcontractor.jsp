<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Contractor Data</title>
</head>
<body>
<h2>View Contractor Data</h2>
<table id="con-table" border="1%">
	<thead>
		<tr>
			<th>Reg-Number</th>
			<th>Name</th>
			<th>Telephone</th>
			<th>Email</th>
			<th>Address</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach var="con" items=${list}>
		<tr>
			<td>${con.registrationNumber}</td>
			<td>${con.name}]</td>
			<td>${con.telephone}</td>
			<td>${con.email}]</td>
			<td>Address</td>
			<td><a href="editcontractor{registrationnumber}">Edit</a></td>
			<td><a href="deletecontractor/{registrationNumber}">Delete</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>


<div>
	<a href="index">Home</a>
</div>
</body>
</html>