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

            <div class="navbar-header">
                <p class="navbar-brand" href="#">学生后台管理系统</p>
            </div>


            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="toSave">添加学生</a></li>
                </ul>
                <form class="navbar-form navbar-left" action="search">
                    <div class="form-group">
                        <input type="text" name="studenName" class="form-control" placeholder="学生姓名">
                    </div>
                    <button type="submit" class="btn btn-default">搜索</button>
                </form>
            </div>
        </div>
    </nav>
    <table class="table table-bordered" style="text-align: center">
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>电话</td>
            <td>性别</td>
            <td>籍贯</td>
            <td>家庭住址</td>
            <td>监护人</td>
            <td>监护人电话</td>
            <td>入学时间</td>
            <td>在校状态</td>
            <td>操作</td>
        </tr>
            <tr>
                <td>${i.studentID}</td>
                <td>${i.studenName}</td>
                <td>${i.stuTel}</td>
                <td>${i.sex}</td>
                <td>${i.nativePlace}</td>
                <td>${i.address}</td>
                <td>${i.guardian}</td>
                <td>${i.guardianTel}</td>
                <td>${i.admissionTime}</td>
                <td>${i.state==0?"在校":(i.state==1?"毕业":(i.state==2?"休学":"劝退"))}</td>
                <td>
                    <button class="btn btn-default" type="button" onclick="location.href='toUpdata?studentID=${i.studentID}'">编辑</button>
                    <button class="btn btn-default" type="button" onclick="fun(${i.state},${i.studentID})">毕业</button>
                    <button class="btn btn-default" type="button" onclick="fun1(${i.state},${i.studentID})">休学</button>
                    <button class="btn btn-default" type="button" onclick="fun2(${i.state},${i.studentID})">复学</button>
                    <button class="btn btn-default" type="button" onclick="fun3(${i.state},${i.studentID})">劝退</button>
                </td>
            </tr>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<script>
    function fun(j,k){
        if(j==3){
            alert("该学生已经被劝退")
        }
        if(j==2){
            alert("该学生已经休学")
        }
        if(j==1){
            alert("该学生已经毕业")
        }
        if(j==0){
            location.href="biye?studentID="+k+"&state=1"
        }
    }

    function fun1(j,k){
        if(j==3){
            alert("该学生已经被劝退")
        }
        if(j==2){
            alert("该学生已经休学")
        }
        if(j==1){
            alert("该学生已经毕业")
        }
        if(j==0){
            location.href="biye?studentID="+k+"&state=2"
        }
    }

    function fun2(j,k){
        if(j==3){
            alert("该学生已经被劝退")
        }
        if(j==2){
            location.href="biye?studentID="+k+"&state=0"
        }
        if(j==1){
            alert("该学生已经毕业")
        }
        if(j==0){
            alert("该学生没有休学")
        }
    }

    function fun3(j,k){
        if(j==3){
            alert("该学生已经被劝退")
        }
        if(j==2){
            location.href="biye?studentID="+k+"&state=3"
        }
        if(j==1){
            alert("该学生已经毕业")
        }
        if(j==0){
            location.href="biye?studentID="+k+"&state=3"
        }
    }
</script>
</body>
</html>
