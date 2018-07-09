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

<title>Login Page</title>
<style>
.glyphicon {
	font-size: 23px;
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

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="Homepage.jsp">Home</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="AboutUs.jsp">About Us</a></li>
			<li><a href="Login">Login</a></li>
			<li><a href="#">FAQS</a></li>
		</ul>
	</div>
	</nav>

	<div class="container">
		<h2>
			<u><center>LOGIN</u>
		</h2>
		<br />
		<br />
		<form class="form-horizontal" method="post" action="Login">
			<div class="form-group">
				<label class="control-label col-sm-4" for="email"><span
					class="glyphicon glyphicon-user"></span></label>
				<div class="col-sm-5">
					<input type="username" name="username" class="form-control"
						id="username" placeholder="Enter username" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-4" for="pwd"><span
					class="glyphicon glyphicon-lock"></span></label>
				<div class="col-sm-5">
					<input type="password" name="password" class="form-control"
						id="pwd" placeholder="Enter password" required>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-4 col-sm-10">
					<div class="checkbox">
						<label><input type="checkbox"> Remember me</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-4 col-sm-10">
					<input type="submit" value="Login">
				</div>
			</div>
		</form>
	</div>
</body>

</html>

