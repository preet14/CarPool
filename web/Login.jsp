<%-- 
    Document   : Login
    Created on : Nov 15, 2018, 2:16:13 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Login Form</title>
		<link rel="stylesheet" href="style.css">
	</head>
	<body>
		<div class="loginBox">
			<img src="user.png" class="user">
			<h2>Log In Here</h2>
                        <form method="post" action="Users">
				<p>User Name</p>
				<input type="text" name="uname" placeholder="User Name" required>
				<p>Password</p>
                                <input type="password" name="pass" placeholder="••••••" required>
				<input type="submit" name="" value="Sign In">
			</form>
		</div>
	</body>
</html>
