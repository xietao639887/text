<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap 101 Template</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
</head>
<style>
    .main {
        width: 80%;
        margin: auto;
    }
</style>
<body>
<div class="main">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <p class="navbar-brand" href="#">学生后台管理系统</p>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="toSave">添加学生</a></li>
                </ul>
                <form class="navbar-form navbar-left" action="search">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="学生姓名">
                    </div>
                    <button type="submit" class="btn btn-default">搜索</button>
                </form>
            </div>
        </div>
    </nav>
    <form action="save">
        <table class="table table-bordered" style="text-align: center">
            <tr>
                <td>姓名</td>
                <td>电话</td>
                <td>性别</td>
                <td>籍贯</td>
                <td>家庭住址</td>
                <td>监护人</td>
                <td>监护人电话</td>
                <td>入学时间</td>
                <td>操作</td>
            </tr>
            <tr>
                <td><input type="text" name="studenName"style="width: 56px"></td>
                <td><input type="text" name="stuTel"style="width: 132px"></td>
                <td>
                    <input type="radio" name="sex" value="男"/>男
                    <input type="radio" name="sex" value="女"/>女
                </td>
                <td><input type="text" name="nativePlace"style="width: 56px"></td>
                <td><input type="text" name="address"style="width: 366px"></td>
                <td><input type="text" name="guardian"style="width: 56px"></td>
                <td><input type="text" name="guardianTel"style="width: 132px"></td>
                <td><input type="date" name="admissionTime"/></td>
                <td>
                    <button class="btn btn-default" type="submit">确认新增</button>
                </td>
            </tr>
        </table>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>

</body>
</html>
