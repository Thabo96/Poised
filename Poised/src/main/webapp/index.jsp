<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Poise Project Manager</title>
</head>
<body>

<h2 >Poise Project Manager</h2>

<h4>Data Storage</h4>

<!-- Add new data into the databases -->

<ul>
		<li><a href="projectform">Add New Project</a></li>
		<li><a href="clientform">Add New Client</a></li>
		<li><a href="contractorform">Add New Contractor</a></li>
		<li><a href="architectform">Add New Architect</a></li>

</ul>


<!--View data  -->
<h4>View Stored Data</h4>

<ul>

		<li><a href="viewproject">View Projects' Data</a></li>
		<li><a href="viewclient">View Clients' Data</a></li>
		<li><a href="viewcontractor">View Contractors' Data</a></li>
		<li><a href="viewarchitect">View Architects' Data</a></li>

</ul>

<!-- edit data -->
<h4>Edit/Update Stored Data</h4>
<ul>

		<li><a href="editproject{projectName}">Edit Project</a><input type="text" path="projectName"></li>

</ul>

</body>
</html>