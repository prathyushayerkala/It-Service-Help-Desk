<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Welcome Admin</title>

<style>
ul1 {
	list-style-type: none;
	margin: 0;
	padding: 0;
	width: 200px;
	background-color: #f1f1f1;
	font-family:  "Raleway", sans-serif;
}

li1 a {
	display: block;
	color: #000;
	padding: 8px 16px;
	text-decoration: none;
}

/* Change the link color on hover */
li1 a:hover {
	background-color: #555;
	color: white;
}

nav1 {
	float: left;
	max-width: 200px;
	margin: 0;
	padding: 1em;
}

.dropbtn {
    background-color: transparent;
	color: #000;
	padding: 16px;
	font-size: 16px;
	border: none;
	cursor: pointer;
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: #708090
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: #555;
}

body {
    background-image: url(https://images.designtrends.com/wp-content/uploads/2015/11/30162730/White-and-Grey-Plain-Background.jpg
    );
    background-repeat: no-repeat;
    background-size: 1280px 1024px;
}

</style>


</head>
<body>
	<h1 style="font-family: "Raleway", sans-serif";>
		<center>IT Help Desk</center>
	</h1>
	<br>
	<br>

	<div class="container">
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
			    <li><a href="/ItHelpDesk/DisplayProfile">Profile</a></li>
				<li><a href="CurrPswd.jsp">Change Password</a></li>
				<li><a href="/ItHelpDesk/Logout">Logout</a></li>
			</ul>
		</div>
		</nav>

		<nav1> <ul1> <li1>
		<a href="AddEmployee.jsp">Add Employee</a></li1> <li1>
		<a href="/ItHelpDesk/ShowEmp">Delete Employee</a></li1> <li1>
		<a href="/ItHelpDesk/ShowUpEmpSevlet">Update Employee</a></li1><li1>
		<div class="dropdown">
			<button class="dropbtn">Ticket</button>
			<div class="dropdown-content">
			    <a href="/ItHelpDesk/ShowTickets">All Tickets</a>
				<a href="/ItHelpDesk/CloseTicketServlet">Closed Tickets</a> <a
					href="/ItHelpDesk/OpenTicketServlet">Open Tickets</a> <a
					href="/ItHelpDesk/AssignServlet">Assign Resolver</a>
					

			</div>
		</div>
		</li1>
		</ul1>
		</nav1>
		
		<center>
<p><font size="5">Welcome Admin</font></h3>
</center>

	</div>

</body>
</html>