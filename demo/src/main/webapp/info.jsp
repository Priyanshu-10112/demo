<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.demo.entity.User1" %> 
<!DOCTYPE html>
<html>
<head>
    <title>User Info</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<nav>
    <a href="/">Home</a>
    <a href="/login">Login</a>
    <a href="/register">Register</a>
</nav>

<%
    User1 user = (User1) request.getAttribute("user");
    if (user != null) {
%>
    <div class="user-info">
        <h2 style="text-align:center;">User Information</h2>
        <table>
            <tr><td>ID:</td><td><%= user.getId() %></td></tr>
            <tr><td>Name:</td><td><%= user.getName() %></td></tr>
            <tr><td>Username:</td><td><%= user.getUserName() %></td></tr>
            <tr><td>Email:</td><td><%= user.getEmail() %></td></tr>
            <tr><td>Phone Number:</td><td><%= user.getPhNum() %></td></tr>
        </table>
    </div>
<%
    } else {
%>
    <p style="text-align:center;">No user data found.</p>
<%
    }
%>
</body>
</html>
