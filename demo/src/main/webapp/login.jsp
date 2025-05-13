<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav>
    <a href="/">Home</a>
    <a href="/login">Login</a>
    <a href="/register">Register</a>
</nav>

<form method="post" action="/login">
    <h2 style="text-align:center;">Login</h2>
    <table>
        <tr><td>Username:</td><td><input type="text" name="userName" required></td></tr>
        <tr><td>Password:</td><td><input type="password" name="password" required></td></tr>
    </table>
    <button type="submit">Login</button>
    <p>Don't have an account? <a href="/register">Register</a></p>
</form>
</body>
</html>


