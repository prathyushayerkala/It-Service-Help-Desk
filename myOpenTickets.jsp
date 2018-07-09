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
padding : 10px; }
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

	</div></head>


<%@ page import = "java.util.*,beans.TicketBean" %>
<%!
ArrayList<TicketBean> myOTickets;
%>

<%
myOTickets = (ArrayList)request.getAttribute("myTickets");
%>
<center><h1>Open Tickets</h1></center>
<br>
<br>
<center>
<table>
<tr>
<th>Ticket No.</th>
<th>Owner Id</th>
<th>Priority</th>
<th>Type</th>
<th>Description</th>
<th>Start Date</th>
<th>Equipment Id</th>
<th>Status</th>
</tr>

<% 
for(TicketBean tb : myOTickets){
out.println("<tr>");
out.println("<td>" + tb.getTicketNum() + "</td>");
out.println("<td>" + tb.getOwnerId() + "</td>");
out.println("<td>" + tb.getPriority() + "</td>");
out.println("<td>" + tb.getType() + "</td>");
out.println("<td>" + tb.getDescription() + "</td>");
out.println("<td>" + tb.getStartdate() + "</td>");
out.println("<td>" + tb.getEquipId() + "</td>");
out.println("<td>" + tb.getStatus() + "</td>");
out.println("<td><a href ='/ItHelpDesk/UpdateStatus?ticketId="+tb.getTicketNum()+"'>Close</a></td>");
out.println("</tr>");

}
%>

</table>
<br><br>
 <button style="font-size:15px; padding:10px 25px;" onClick='goBack()'>Back</button>  
</center>
<script>
function goBack() {
	window.history.back();
}
</script>
</body>
</html>