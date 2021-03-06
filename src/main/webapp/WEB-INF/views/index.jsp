
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>--%>
<html>
<head>
    <meta charset="UTF-8">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <!--JQuery-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>

    <script type="text/javascript">
        <%@include file="/WEB-INF/js/index.js"%>
    </script>
    <style>
        <%@include file="/WEB-INF/css/index.css"%>
    </style>

    <title>Car Price</title>
</head>
<body>

<div class="sidenav">
    <div id="btns" class="btn-group-vertical">
        <button type="button" id="addBtn" class="btn btn-info" onclick="send()">Add car</button>
        <button type="button" id="logoutBtn" class="btn btn-info" onclick="logout()">Logout</button>
        <button type="button" id="withImageBtn" class="btn btn-info" onclick="showWithImage()">Show cars with image</button>
        <button type="button" id="lastday" class="btn btn-info" onclick="showLastDay()">Show for las day</button>
        <button type="button" id="relevant" class="btn btn-info" onclick="getRelevant()">Show relevant cars</button>
        <button type="button" id="showAll" class="btn btn-info" onclick="getCars()">Show all cars</button>
    </div>
    <form id="selection_form">
        <div class="form-group text-center" id="body-group">
            <label for="body">Car body: </label>
            <select class="custom-select mr-sm-2" name="body" id="body">

            </select>
            <button type="button" id="byBody" class="btn btn-info" onclick="getByBody()">Show by body</button>
        </div>
        <div class="form-group text-center" id="engine-group">
            <label for="engine">Engine: </label>
            <select class="custom-select mr-sm-2" name="engine" id="engine">

            </select>
            <button type="button" id="byEngine" class="btn btn-info" onclick="getByEngine()">Show by engine</button>
        </div>
        <div class="form-group text-center" id="transmission-group">
            <label for="transmission">Transmission: </label>
            <select class="custom-select mr-sm-2" name="transmission" id="transmission">

            </select>
            <button type="button" id="byTr" class="btn btn-info" onclick="getByTr()">Show by transmission</button>
        </div>
    </form>
</div>

<div class="container-fluid">
    <br><br>
    <h3 class="text-center">Orders</h3>
    <br><br>
    <div class="col-md-2"></div>
    <div class="col-md-8">
        <div class="container" id="main-div">

        </div>
    </div>
</div>
</body>
</html>
