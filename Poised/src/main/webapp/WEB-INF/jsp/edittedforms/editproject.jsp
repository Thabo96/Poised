<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Project</title>
</head>
<body>
<h2 >Edit Project Details</h2>
<form metho="POST" action="/Poise/editproject" >

	<table>
		<tr>
			<td>Project Name :</td>
			<td><input type="text" path="projectName" placeholder="project Name"></td>
		</tr>
		
		<tr>
			<td>Building Type :</td>
			<td><input type="text" path="buildingType" placeholder="building type"></td>
		</tr>
		
		<tr>
			<td>ERF :</td>
			<td><input type="text" path="ERF" placeholder="ERF"> </td>
		</tr>
		
		<tr>
			<td>Status :</td>
			<td><input type="text" path="status" placeholder="status"></td>
		</tr>
		
		<tr>
			<td>Client Name :</td>
			<td><input type="text" path="clientName" placeholder="Client-Name">
		</tr>
		
		<tr>
			<td>Client ID :</td>
			<td><input type="text" path="clientID" placeholder="Client-ID"></td>
		</tr>
		
		<tr>
			<td>Contractor's Name :</td>
			<td><input type="text" path="contractorName" placeholder="Cont-Name"></td>
		</tr>
		
		<tr>
			<td>Contractor's Registration Number :</td>
			<td><input type="text" path="contractorRegistrationNumber" placeholder="Reg-Nr"></td>
		</tr>
		
		<tr>
			<td>Architect's Name :</td>
			<td><input type="text" path="architectName" placeholder="Arch-Name"></td>
		</tr>
		
		<tr>
			<td>Architect's Registration Number :</td>
			<td><input type="text" path="architectRegistrationNumber" Placeholder="Reg-Nr"></td>
		</tr>
		
		<tr>
			<td>Total Cost :</td>
			<td><input type="text" path="fees" placeholder="Total Cost"></td>
			
			<td>Deposit :</td>
			<td><input type="text" path="fees" placeholder="deposit"></td>
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