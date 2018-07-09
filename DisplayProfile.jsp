<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet"
        href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script
        src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>EmpId</title>
</head>
<body>
<h1>
        <center>IT SERVICE HELP DESK</center>
    </h1>
    <br>
    <br>

    <nav class="navbar navbar-default">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li><a href="#">Change Password</a></li>
            <li><a href="/ItHelpDesk/Logout">Logout</a></li>
        </ul>
    </div>
    </nav>
   
<%@ page import = "java.util.*,beans.EmployeeBean" %>

<%!
EmployeeBean eb  ;
%>



<%
eb = (EmployeeBean)request.getAttribute("employee");
%>

<style>

body {
    background-image: url(https://images.designtrends.com/wp-content/uploads/2015/11/30162730/White-and-Grey-Plain-Background.jpg
    );
    background-repeat: no-repeat;
    background-size: 1280px 1024px;
}

p {
    font-size : 20px;
    font-family : verdana;
    text-align:justify;
   }
</style>
<center><h2>MY PROFILE </h2>
<% 
out.println( "<p>" + "ID          :" + eb.getEid()+ "<br>");
out.println("First Name  :" + eb.getFname() + "<br>");
out.println("Last Name   :" + eb.getLname() + "<br>");
out.println("Address     :" + eb.getAddress() + "<br>");
out.println("Email ID    :" + eb.getEmail() + "<br>");
out.println("Department  :" + eb.getDepartment() + "<br>");
out.println("Designation :" + eb.getDesignation() + "<br><br>" + "</p>");

%>

<br>

<button style="font-size:15px; padding:10px 25px;" onClick='goBack()'>Back</button>
 </center>  
 <script>
 function goBack() {
 window.history.back();
 }
 </script>

</body>
</html>