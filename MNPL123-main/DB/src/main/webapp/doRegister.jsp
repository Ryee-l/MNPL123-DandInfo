<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="projectDB.UserDAO" %>
<%@ page import="projectDB.User" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Do Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css">
    <style>
        * {
            outline: none !important;
        }

        html,
        body {
            background: #1abe9c;
            height: 100%;
        }

        .container {
            height: 100%;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .card {
            width: 300px;
            background: #ebeff2;
            box-shadow: 0px 0px 50px rgba(0, 0, 0, .5);
            border-radius: 5px;
            padding: 20px;
        }

        .card-title {
            font-size: 24px;
            text-align: center;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .btn {
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="card">
            <h3 class="card-title">Register Result</h3>
            <%
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String number = request.getParameter("phoneNumber");

                boolean isAuthenticated = true; 
                User u = UserDAO.register(username, password,number);

                if (u == null) {
                    isAuthenticated = false;
                }

                if (isAuthenticated) {
            %>
                    <div class="alert alert-success" role="alert">
                        <strong>Register Successfully!</strong> Welcome, <%= username %>!
                    </div>
            <%
                } else {
            %>
                    <div class="alert alert-danger" role="alert">
                        <strong>Cannot register</strong> Please check whether the username has been registered.
                    </div>
            <%
                }
            %>
        </div>
    </div>
</body>
</html>
