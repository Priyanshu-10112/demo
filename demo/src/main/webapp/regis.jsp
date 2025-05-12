<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
    <h2>Registration</h2>
    <form action="/register" method="post">
    <table>
    <tr>
        <td><label>Id:</label></td>
        <td><input type="text" name="id" required></td>
    </tr>
     <tr>   
     	<td><label>Name:</label></td>
        <td><input type="text" name="name" required></td>
      </tr>
      <tr>
      	<td><label>UserName:</label></td>
        <td><input type="text" name="userName" required></td>
        </tr>
        <tr>
        <td><label>Password:</label></td>
        <td><input type="password" name="password" required></td>
        </tr>
        <tr>
        <td colspan="2" align="center"><input type="submit" value="Register"></td>
        </tr>
    </table>
    </form>
</body>
</html>
