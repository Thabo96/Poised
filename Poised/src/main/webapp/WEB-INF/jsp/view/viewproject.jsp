<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Project Data</title>
</head>
<body>
<h2>View Project Data</h2>
	<table id="pro-table" border="1%" items="${ list}" >
	 	<thead>    
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>ERF</th>
				<th>Start-Date</th>
				<th>Due-Date</th>
				<th>Status</th>
				<th>ClientName</th>
				<th>ClientId</th>
				<th>Arch-Name</th>
				<th>Arch-Reg</th>
				<th>Cont-Name</th>
				<th>Cont-Reg</th>
				<th>Total-Cost</th>
				<th>Deposit</th>
				<th>Address</th>
				<th>Edit</th>
				<th>Delete</th>
				
			</tr>
		
		</thead>
		<tbody>
		
		
		<c:forEach var="pro" items=${list} >
			<tr>
				<td>${pro.projectName} </td>
				<td>${pro.buildingType} </td>
				<td>${pro.ERF}</td>
				<td>${pro.startDate}</td>
				<td>${pro.dueDate}</td>
				<td>${pro.status}</td>
				<td>${pro.clientName}</td>
				<td>${pro.clientId}</td>
				<td>${pro.contractorName}</td>
				<td>${pro.contractorRegistrationNumber}</td>
				<td>${pro.architectName}</td>
				<td>${pro.archRegistrationNumber}</td>
				<td>${pro.fees}</td>
				<td>${pro.fees}</td>
				<td>${pro.address}</td>
				<td><a href="editproject{projectName}">Edit</a></td>
				<td><a href="deleteproject/{projectName}">Delete</a></td>
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