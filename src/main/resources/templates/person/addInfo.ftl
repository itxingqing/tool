<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>个人信息录入</title>
        <!--Bootstrap-->
        <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
        <!--bootstrap脚本-->
        <script src="../bootstrap/js/jquery.min.js" ></script>
        <script src="../bootstrap/js/bootstrap.min.js" ></script>
        <script src="../page/person/addPerson.js" ></script>
    </head>
<body>
    <h1 class="text-center">人员信息采集</h1>
    <form class="form-horizontal" action="#" id="person_info_form">
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="name" name="name" placeholder="姓名">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">电话</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="电话">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">身份证</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="idCard" name="idCard" placeholder="身份证">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">护照</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="passport" name="passport" placeholder="护照">
            </div>
        </div>
        <div class="form-group text-center">
            <div class="col-sm-offset-2 col-sm-8">
                <button type="button" onclick="person.submitInfo()" class="btn btn-default">提交</button>
            </div>
        </div>
    </form>

</body>
</html>