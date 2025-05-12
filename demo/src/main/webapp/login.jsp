<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login</h2>
    <form action="log" method="post">
       <table>
      <tr>
      	<td><label>UserName:</label></td>
        <td><input type="text" name="userName" required></td>
        </tr>
        <tr>
        <td><label>Password:</label></td>
        <td><input type="password" name="password" required></td>
        </tr>
        <tr>
        <td colspan="2" align="center"><input type="submit" value="Login"></td>
        </tr>
    </table>
    </form>

</body>
</html>
