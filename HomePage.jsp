<!DOCTYPE html>
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

<title>Home.ItHelpDesk</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">


<style>
body,h1,h5 {font-family: "Raleway", sans-serif}
body, html {height: 100%}
.bgimg {
    background-image: url('images/4.jpg');
    min-height: 100%;
    background-position: center;
    background-size: cover;
}
.glyphicon {
	font-size: 23px;
}

</style>

</head>

<body>

<div class="bgimg w3-display-container w3-text-white">
  <div class="w3-display-topmiddle w3-jumbo">
    <p>It help desk</p>
  </div>
  <div class="w3-display-topleft w3-container w3-xlarge">
  <br>
    <p><button onclick="document.getElementById('login').style.display='block'" class="w3-button w3-black">Login</button></p>
    <p><button onclick="document.getElementById('aboutus').style.display='block'" class="w3-button w3-black">About Us</button></p>
    <p><button onclick="document.getElementById('faq').style.display='block'" class="w3-button w3-black">FAQ</button></p>
  </div>
  
</div>

<!-- login Modal -->
<div id="login" class="w3-modal">
  <div class="w3-modal-content w3-animate-zoom">
    <div class="w3-container w3-black w3-display-container">
      <span onclick="document.getElementById('login').style.display='none'" class="w3-button w3-display-topright w3-large">x</span>
      <center><h1>LOGIN</h1></center>
    </div>
<br>
<br>
    <div class="container">
				<form class="form-horizontal" method="post" action="/Login.java">
			<div class="form-group">
				<label class="control-label col-sm-3" for="email"><span
					class="glyphicon glyphicon-user"></span></label>
				<div class="col-sm-5">
					<input type="username" name="username" class="form-control"
						id="username" placeholder="Enter username" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-3" for="pwd"><span
					class="glyphicon glyphicon-lock"></span></label>
				<div class="col-sm-5">
					<input type="password" name="password" class="form-control"
						id="pwd" placeholder="Enter password" required>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-4 col-sm-10">
					<input type="submit"  value="Login">
				</div>
			</div>
		</form>

  </div>
</div>

<!-- Contact Modal -->
<div id="contact" class="w3-modal">
  <div class="w3-modal-content w3-animate-zoom">
    <div class="w3-container w3-black">
      <span onclick="document.getElementById('contact').style.display='none'" class="w3-button w3-display-topright w3-large">x</span>
      <h1>Contact</h1>
    </div>
    <div class="w3-container">
      <p>Reserve a table, ask for today's special or just send us a message:</p>
      <form action="/action_page.php" target="_blank">
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Name" required name="Name"></p>
        <p><input class="w3-input w3-padding-16 w3-border" type="number" placeholder="How many people" required name="People"></p>
        <p><input class="w3-input w3-padding-16 w3-border" type="datetime-local" placeholder="Date and time" required name="date" value="2017-11-16T20:00"></p>
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Message \ Special requirements" required name="Message"></p>
        <p><button class="w3-button" type="submit">SEND MESSAGE</button></p>
      </form>
    </div>
  </div>
</div>

</body>
</html>