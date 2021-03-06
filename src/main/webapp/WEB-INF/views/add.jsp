
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
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <script type="text/javascript">
        <%@include file="/WEB-INF/js/add.js"%>
    </script>
    <title>Add car</title>
</head>
<body>
<div class="container-fluid">
    <br>
    <div class="col-md-4"></div>
    <div class="col-md-4">
        <h3 class="text-center" id = "warn"></h3>
        <form id="myForm" method="post" action="/cars" enctype="multipart/form-data">
            <div class="form-group" id="model-group">
                <label for="name">Model:</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Model">
            </div>
            <div class="form-group" id="price-group">
                <label for="price">Price:</label>
                <input type="text" class="form-control" id="price" name="price" placeholder="00.00">
            </div>
            <div class="form-group" id="color-group">
                <label for="color">Color:</label>
                <input type="text" class="form-control" id="color" name="color" placeholder="Color">
            </div>
            <div class="form-group" id="mileage-group">
                <label for="mileage">Mileage:</label>
                <input type="text" class="form-control" id="mileage" name="mileage" placeholder="00">
            </div>
            <div class="form-group" id="body-group">
                <label for="body">Car body: </label>
                <select class="custom-select mr-sm-2" name="body" id="body">

                </select>
            </div>
            <div class="form-group" id="engine-group">
                <label for="engine">Engine: </label>
                <select class="custom-select mr-sm-2" name="engine" id="engine">

                </select>
            </div>
            <div class="form-group" id="transmission-group">
                <label for="transmission">Transmission: </label>
                <select class="custom-select mr-sm-2" name="transmission" id="transmission">

                </select>
            </div>
            <div class="form-group" id="desc-group">
                <label for="desc">Description:</label>
                <textarea class="form-control" rows="5" name ="desc" id="desc"></textarea>
            </div>
            <div class="form-group" id="image-group">
                <label for="image">Choose images of your car:</label>
                <input type="file" accept="image/*" class="form-control-file" name="image" id="image">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-info" value="Add" onclick="return validate()">Add</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
