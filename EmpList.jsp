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
	</head>

<style>
.dropbtn {
	background-color: white;
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

table, td, th {
border : 1px solid black;
border-collapse : collapse;
padding : 10px }
</style>


</head>
<body>
	<h1>
		<center>IT SERVICE HELP DESK</center>
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

	</div><head>






<%@ page import = "java.util.*,beans.EmployeeBean" %>

<%!
ArrayList<EmployeeBean> empList ; 
%>

<%  empList = (ArrayList)request.getAttribute("empList"); %>

<center> <h1> Employee List </h1>
<br><br>
<table>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Address</th>
<th>Email</th>
<th>Department</th>
<th>Designation</th>
</tr>
<%
for (EmployeeBean eb : empList){
out.println("<tr>");
out.println("<td>" + eb.getEid() + "</td>");
out.println("<td>" + eb.getFname() + "</td>");
out.println("<td>" + eb.getLname() + "</td>");
out.println("<td>" + eb.getAddress() + "</td>");
out.println("<td>" + eb.getEmail() + "</td>");
out.println("<td>" + eb.getDepartment() + "</td>");
out.println("<td>" + eb.getDesignation() + "</td>");
out.println("<td><a href = '/ItHelpDesk/UpdateEmpServlet?eid=" + eb.getEid() + "'><span class = 'glyphicon glyphicon-pencil'></span>'</a> </td>");
out.println("</tr>");
}
%>
</table></center>
<br><br>
<center>
<button onClick='goBack()'>Back</button>

</center>


<script>
function goBack() {
    window.history.back();
}
</script>
</html>