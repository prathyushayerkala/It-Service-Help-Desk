

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

<title>RaiseTck Page</title>

<style>
body {
    background-image: url(https://images.designtrends.com/wp-content/uploads/2015/11/30162730/White-and-Grey-Plain-Background.jpg
    );
    background-repeat: no-repeat;
    background-size: 1280px 1024px;
}
</style>

</head>
<body>
    <h2>
        <center>IT SERVICE HELP DESK</center>
    </h2>


<nav class="navbar navbar-default">
<div class="container-fluid">
    <ul class="nav navbar-nav">
        <li><a href="/ItHelpDesk/DisplayProfile">Profile</a></li>
        <li><a href="CurrPswd.jsp">Change Password</a></li>
        <li><a href="/ItHelpDesk/Logout">Logout</a></li>
    </ul>
</div>
</nav>

<h2>RAISE TICKET:</h2>
<form class="form-horizontal" method = "post" action = "RaiseTicket">
   
    <div class="form-group">
        <label class="control-label col-sm-2" for="priority">Priority:</label>
        <div class="col-sm-2">
            <select    name="priority" width="190" style="width:190px">
                <option value="low">LOW</option>
                <option value="high">HIGH</option>
            </select>
        </div>
    </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="type">Type:</label>
            <div class="col-sm-2">
            <select name="type" width="190" style="width:190px">
                    <option value="hardware">HARDWARE</option>
                    <option value="software">SOFTWARE</option>
                </select>
            </div>
        </div>
        <div class="form-group">
        <label class="control-label col-sm-2" for="description">Description:</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name ="description" required>
        </div>
    </div>
       
        <div class="form-group">
        <label class="control-label col-sm-2" for="equipmentid">EquipmentId:</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" name="equipId" required>
        </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-12">
        <input type="submit" value="Raise Ticket">
      </div>
    </div>
   
    </form> 
    
    <button style="font-size:15px; padding:10px 25px;" onClick='goBack()'>Back</button> 
 <script>      
   function goBack() {
      window.history.back();
   }
  </script>
       
</body>
</html>