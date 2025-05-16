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
    <a href="index.jsp">Home</a>
    <a href="">Insert</a>
    <a href="">Update</a>
    <a href="">About</a>
    <a href="login.jsp">LogOut</a>
</nav>
<%
    User1 user = (User1) request.getAttribute("user");
    if (user != null) {
%>
    <div class="user-info">
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>UserName</th>
                    <th>Phone Number</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= user.getId() %></td>
                    <td><%= user.getName() %></td>
                    <td><%= user.getUserName() %></td>
                    <td><%= user.getPhNum() %></td>
                    <td><%= user.getEmail() %></td>
                </tr>
            </tbody>
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
