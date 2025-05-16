<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    
<nav>
    <a href="index.jsp">Home</a>
    <a href="regis.jsp">Register</a>
    <a href="login.jsp">Login</a>
    <a href="info.jsp">Menu</a>
</nav>

    <div class="container">
        <form action="regis" method="post">
            <table>
                <tr>
                    <td>Enter Name:</td>
                    <td><input type="text" name="name" required /></td>
                </tr>
                 <tr>
                    <td>Enter UserName:</td>
                    <td><input type="text" name="userName" required /></td>
                </tr>
                <tr>
                    <td>Enter ID:</td>
                    <td><input type="text" name="id" required /></td>
                </tr>
                <tr>
                    <td>Enter Password:</td>
                    <td><input type="password" name="password" required /></td>
                </tr>
                <tr>
                    <td>Enter Phone Number:</td>
                    <td><input type="text" name="phNum" required /></td>
                </tr>
                <tr>
                    <td>Enter Email:</td>
                    <td><input type="email" name="email" required /></td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">Register</button></td>
                </tr>
            </table>
            <p>Already have an account? <a href="login.jsp">Login here</a></p>
        </form>
    </div>
</body>
</html>
