<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>DBProject</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css">
    <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.5.1.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <style>
        * {
            outline: none !important;
        }

        html,
        body {
            background: #1abe9c;
        }

        form {
            width: 300px;
            background: #ebeff2;
            box-shadow: 0px 0px 50px rgba(0, 0, 0, .5);
            border-radius: 5px;
            padding: 20px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }

        .btn-group {
            width: 100%;
        }

        .btn-group button {
            width: 50%;
        }
    </style>
</head>
<body>
    <form action="doLogin.jsp" method="post" id="myForm">
        <h3 class="text-center">Welcome to the venue booking system</h3>
        <div class="form-group">
            <input name="username" type="text" id="id_username" class="form-control" placeholder="enter the account">
        </div>
        <div class="form-group">
            <input name="password" type="password" id="id_password" class="form-control" placeholder="enter the passward">
        </div>
        <div class="btn-group">
            <button type="submit" class="btn btn-primary">log in</button>
            <button type="button" class="btn btn-danger" onclick="location.href='register.jsp'">Register a new account</button>
        </div>
    </form>
<script>

    $("#myForm").submit(()=>{
    	if($("#id_username").val().length==0){
    		alert("account cannot be empty")
    		return false
    	}
    	if($("#id_password").val().length==0){
    		alert("passward cannot be empty")
    		return false
    	}
    	return true
    })
</script>
</body>
</html>


