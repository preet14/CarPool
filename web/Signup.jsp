<%-- 
    Document   : Signup
    Created on : Nov 15, 2018, 2:19:41 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Sign Up Form</title>
		<link rel="stylesheet" href="style1.css">
		<script src = "SignUp.js"></script>
	</head>
	<body>
		<div class="loginBox">
			<img src="user.png" class="user">
			<h2>Sign Up Here</h2>
                        <form action="AddUser" method="post" name="myforms">
				<p>First Name</p>
				<input type="text" name="fname" placeholder="First Name" required> 
				<p>Last Name</p>
                                <input type="text" name="lname" placeholder="Last Name" required>
				<p>Username</p>
		                <input type="text" name="uname" placeholder="UserName" required>
				<p>Contact No. </p>
				<input type="text" name="mobileno" placeholder="+91-" required>
				<p>Email</p>
				<input type="text" name="email" placeholder="Email" required>
				<p>Password</p>
				<input type="password" name="pwd" id="pwdt" placeholder="••••••" required>
				<p>Re-Enter Password</p>
				<input type="password" name="pswd" id="cpwdt" placeholder="••••••" required>
				<input type="submit" onclick="validatePass()" name="bt" value="Sign Up">
			</form>
		</div>
	</body>
</html>
