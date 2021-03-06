
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <%@include file="/WEB-INF/js/registration.js"%>
  </script>
  <title>User registration</title>
</head>
<body>
<div class="container">
  <br><br>
  <div class="col-md-3"></div>
  <div class="col-md-6">
    <h3 class="text-center" id="warn"></h3>
    <form method='post' id="regForm" action="/api/reg">
      <div class="form-group" id="login-group">
        <label for="login">Login:</label>
        <input type='text' class="form-control" name='login' id="login" value=''><br>
      </div>
      <div class="form-group" id="pass-group">
        <label for="pass">Password:</label>
        <input type='text' class="form-control" name='password' id="pass" value=''><br>
      </div>
      <div class="form-group" id="confirm-group">
        <label for="confirm">Confirm password:</label>
        <input type='text' class="form-control" name='confirm' id="confirm" value=''><br>
      </div>
      <div class="form-group">
        <button class="btn btn-info" id="submit" style="width: 100px" type="submit" onclick="return validate()">
          Registration
        </button>

      </div>
    </form>
</div>
</body>
</html>
