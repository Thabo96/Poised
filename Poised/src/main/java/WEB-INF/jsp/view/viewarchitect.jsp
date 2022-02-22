<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Architect Data</title>
</head>
<body>
<h2>View Architect Data</h2>
<table id="arc-table" border="1%">
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
	
	<c:forEach var="arc" items=${list}>
		<tr>
			<td>${arc.projectName}</td>
			<td>${arc.name}</td>
			<td>${arc.telephone}</td>
			<td>${arc.email}</td>
			<td>${arc.address}</td>
			<td><a href="editarchitect{registrationNumber}">Edit</a></td>
			<td><a href="deletearchitect/{registrationNumber}">Delete</a></td>
		</tr>
		
	</c:forEach>
	</tbody>
</table>
<br/>
<div>
	<a href="index">Home</a>

</div>

</body>
</html>