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
<title>FAQs Page</title>

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
            <li><a href="HomePage.jsp">Home</a></li>
            <li><a href="AboutUs.jsp">About Us</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="FAQs.jsp">FAQS</a></li>
        </ul>
    </div>
    </nav>
   
<p><b>1.How do I host ServiceDesk Plus on the internet?</b><br><br>
In order to make ServiceDesk Plus available for users in Internet, let us assume the following scenarios.

Scenario 1: ServiceDesk Plus is installed in LAN and should be available in LAN and WAN:
Assume ServiceDesk Plus is installed on a server in the LAN with IP address 192.168.200.254 on port 80, and the hostname of the server is "servicedesk-lan".
For users within the LAN, the url will be http://servicedesk-lan/ or (http://192.168.200.254)
If ServiceDesk Plus has to be accessed in WAN, you should do the following: <br>
Step 1: Register an IP address (say, 64.12.13.11) and a public hostname (like servicedesk.yourdomain.com) with your Service Provider.
<br>
Step 2: The IP address for "servicedesk.yourdomain.com"?should resolve to "64.12.13.11". (This will be predominantly handled by the Service Provider).
<br>
Step 3: Configure Firewall rules (or access-list in router) redirecting "http" requests on IP address "64.12.13.11" to the LAN ipaddress "192.168.200.254".
<br>
Step 4: Configure the alias URL settings in ServiceDesk Plus. [One point to note is that all notifications will now be sent with the Public URL. It is understood that the Public URL will also be reachable within the LAN].

</p>
<p>
<b>
2.How do I modify the ServiceDesk Plus Logo? <br><br>

</b>
You can customize the application by choosing to display your custom logo. You need to add the logo in two dimensions, one for the login page and the other for the header image that you see on the top left corner of the pages once you login. The login page image should be of the dimensions 252 px x 61 px (W x H), while the header image needs to be 166 px x 46 px.

    Click Admin -> Self Service Portal settings.
    Click Import image ... button.
    Click Browse button.
    In the file chooser window, select the file that you wish to import and click Open.
    Click Import. The image that you just imported will be replaced instead of the login page image. Follow the same process for header image also.
    Click Save, to save the changes made in the settings.
</p>

<p><b>
3.How do I change the URL on which ServiceDesk Plus is running? <br><br>
</b>

Click Admin --> Self Service Portal Settings and provide the URL in the Alias URL section. Please make the corresponding configuration in the Firewall/Router also.

</p>
<p>
<b>
4.What is a version of Tomcat used in ServiceDesk Plus? <br><br>
</b>
Tomcat Version currently used in the application is 7.0.26
</p>
</body>
</html>