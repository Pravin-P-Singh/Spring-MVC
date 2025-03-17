<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<div class="container">
		<form action="login" method="post">
		<h2> Login Form </h2>
		<h3>${msg}</h3>
		<div class="form-group">
			<label for="username">Username</label> <input type="text" name = "username">
		</div>
		<div class="form-group">
			<label for="password">Password</label> <input type="password" name = "password">
		</div>
		<div class="form-group">
			<input type="submit" value="Login">
		</div>
		</form>
	
	</div>
</body>
</html>