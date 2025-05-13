<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav>
    <a href="/">Home</a>
    <a href="/login">Login</a>
    <a href="/register">Register</a>
</nav>

<form method="post" action="/register">
    <h2 style="text-align:center;">Register</h2>
    <table>
        <tr><td>ID:</td><td><input type="text" name="id" required></td></tr>
        <tr><td>Name:</td><td><input type="text" name="name" required></td></tr>
        <tr><td>Username:</td><td><input type="text" name="userName" required></td></tr>
        <tr><td>Password:</td><td><input type="password" name="password" required></td></tr>
        <tr><td>Phone Number:</td><td><input type="text" name="phNum" required></td></tr>
        <tr><td>Email:</td><td><input type="email" name="email" required></td></tr>
    </table>
    <button type="submit">Register</button>
    <p>Already have an account? <a href="/login">Login</a></p>
</form>
</body>
</html>
