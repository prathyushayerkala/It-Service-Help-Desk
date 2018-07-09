<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Update Page</title>

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
<h2><center>IT SERVICE HELP DESK</center></h2>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li><a href="#">Profile</a></li>
      <li><a href="CurrPswd.jsp">Change Password</a></li>
      <li><a href="/ItHelpDesk/Logout">Logout</a></li>
     
      </ul>
  </div>
</nav>

<h2>Update Employee:</h2>
	<br>

<form class="form-horizontal">
		<div class="form-group">
			<label class="control-label col-sm-2" for="first name">First
				Name:</label>
			<div class="col-sm-2">
				<input type="first name" class="form-control" name="fname" required>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="last name">Last
				Name:</label>
			<div class="col-sm-2">
				<input type="last name" class="form-control" name="lname" required>

			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="email">Email:</label>
			<div class="col-sm-2">
				<input type="text" class="form-control" name="email" required>

			</div>
		</div>

		<div class="form-group">

			<label class="control-label col-sm-2" for="address">Address:</label>
			<div class="col-sm-2">
				<div class="row-sm-10">
					<input type="address" class="form-control" name="address"
						height="60" style="height: 60px" required>
				</div>
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="designation">Designation:</label>
			<div class="col-sm-4">
				<select name="designation" width="190" style="width: 190px">
					<option value="Regular">Regular</option>
					<option value="Intern">Intern</option>
					<option value="Manager">Manager</option>
				</select>

			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-sm-2" for="department">Department:</label>
			<div class="col-sm-2">
				<select name="department" width="190" height="100"
					style="width: 190px" style="height:100px">
					<option value="Project Team">Project Team</option>
					<option value="IT Team">IT Team</option>

				</select><br>
				<br>

			</div>
		</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-12">
				<input type="submit" value="Update">
			</div>
		</div>
	</form>
</body>
</html>
