<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Client Data</title>
</head>
<body>
<h2>View Client Data</h2>

<table id="table-1" id="cli-table" border="1%" >

	<thead >
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Telephone</th>
			<th>Email</th>
			<th>Address</th>
			<th>Edit</th>
			<th>delete</th>
		</tr>
	</thead>
	<tbody>
	
		<c:forEach var="cli" items="${list}">
		<tr>
			<td>${cli.id}</td>
			<td>${cli.name}</td>
			<td>${cli.telephone}</td>
			<td>${cli.email}</td>
			<td>${cli.address}</td>
			<td><a href="editclient{id}">Edit</a></td>
			<td ><a href="deleteclient/{id}">Delete </a></td>
		
		</tr>
		</c:forEach>
	</tbody>
</table>

<br>

<div>
	<a href="index">Home</a>
</div>

</body>
</html>