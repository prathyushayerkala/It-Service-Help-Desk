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
<title>CurrPswd</title>

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
    <h1>
        <center>IT SERVICE HELP DESK</center>
    </h1>
    <br>
    <br>

    <nav class="navbar navbar-default">
    <div class="container-fluid">
        <ul class="nav navbar-nav">
            <li><a href="Profile.jsp">Profile</a></li>
            <li><a href="/ItHelpDesk/Logout">Logout</a></li>
        </ul>
    </div>
    </nav>
    <link rel="stylesheet" href="bglog.html">

    <div class="container">
        <h2>
            <center>Password</center>
        </h2>
        <br /> <br />
        <form class="form-horizontal" method = "post" action = "/ItHelpDesk/ChangePassword">
            <div class="form-group">
                <label class="control-label col-sm-4" for="pwd">Old
                    Password:</label>
                <div class="col-sm-5">
                    <input type = "password" class="form-control" name="pwd"
                        placeholder="Enter Current password">
                </div>
            </div>



            <div class="form-group">
                <div class="col-sm-offset-5 col-sm-10">
                    <input type="submit" value = "Change Password">
                    <button onClick="goBack()" >Back</button>
                </div>
            </div>
        </form>
        <script>
function goBack() {
	window.history.back();
}
</script>
</body>
</html>