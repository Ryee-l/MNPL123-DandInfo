<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">

<head>
    <meta charset="UTF-8">
    <title>Overview</title>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <%--底下三行是导入的外部样式 --%>
    <link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery-3.5.1.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <%--自定义的样式 --%>
    <style>
        * {
            outline: none !important;
        }

        body,
        html {
            background: #7f8d90;
        }

        nav,
        .breadcrumb {
            border-radius: 0px !important;
            margin-bottom: 0px !important;
        }

        .breadcrumb {
            margin-bottom: 20px !important;
            background: #36485c;
            color: white;
        }

        li h4 {
            width: 300px;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
        }

        .breadcrumb .active {
            color: red;
        }
    </style>
</head>

<body>
<nav class="navbar navbar-default hidden-sm hidden-xs">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="index.jsp?userId=<%=request.getParameter("userId") %>" style="font-size: 25px;">Welcome + student id</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown"> Venue management
                    <span class="caret"></span>
                </a>

            </li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a><%=request.getParameter("userId") %></a></li>
            <li><a href="#">sigh out<span class="glyphicon glyphicon-off"></span></a></li>
        </ul>
    </div>
</nav>

<ol class="breadcrumb">
    <li>Welcome</li>
    <li>venue booking system</li>
    <li class="active">overview</li>
</ol>

<form class="form-inline" style="margin: 0px auto 20px;">
    <div class="form-group" style="display: block;text-align: center;">
        <div class="input-group">
            <div class="input-group-addon">name of venues</div>
            <input class="form-control" placeholder="Search for available facilities" type="text">
            <span class="input-group-btn">
                    <button class="btn btn-primary" type="submit">🔍</button>
                </span>
        </div>
    </div>
</form>

<div class="container">
    <ul class="list-group">
        <li class="list-group-item">
            <h4 class="list-group-item-heading">
                <a data-placement="bottom" data-toggle="tooltip" href="" title="venue1">
                    venue1
                </a>
            </h4>
        </li>
        <li class="list-group-item">
            <h4 class="list-group-item-heading">
                <a data-placement="bottom" data-toggle="tooltip" href="" title="venue2">
                    venue2
                </a>
            </h4>

        </li>
        <li class="list-group-item">
            <h4 class="list-group-item-heading">
                <a data-placement="bottom" data-toggle="tooltip" href="" title="venue3">
                    venue3
                </a>
            </h4>
        </li>
        <li class="list-group-item">
            <h4 class="list-group-item-heading">
                <a data-placement="bottom" data-toggle="tooltip" href="" title="venue4">
                    venue4
                </a>
            </h4>

        </li>
        
    </ul>

<script>
    $(function () {
        $('[data-toggle="tooltip"]').tooltip({
            trigger: "hover"
        })
    })
</script>
</body>
</html>
