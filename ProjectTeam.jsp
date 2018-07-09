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
<title>ProjectTeam Page</title>

<style>
ul1 {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 200px;
    background-color: #f1f1f1;
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

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}

nav1 {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
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
   
<nav1>
<ul1>
  <li1><a href="RaiseTicket.jsp">Request Ticket</a></li1>
  <li1><a href="/ItHelpDesk/getPTickets">My Ticket</a></li1>
</ul1>
</nav1>

<center>
<p><font size="5">Project Team</font></h3>
</center>


</div>
   
</body>
</html>