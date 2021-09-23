<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
    <script src="js/cookie_util.js"></script>
</head>
<body>
<form method="post" action="" id="listform">
    <div class="panel admin-panel">
        <div class="panel-head"><strong class="icon-reorder">城市信息</strong> <a href="" style="float:right; display:none;">添加字段</a></div>

        <table class="table table-hover text-center">
            <tr>
                <th width="150" style="text-align:left; padding-left:20px;">id</th>
                <th width="200">城市名</th>
                <th width="200">省份名</th>
                <th width="250" colspan="2">操作</th>
            </tr>
            <c:forEach items="${cityList}" var="city">
                <tr>
                    <td>${city.cid}</td>
                    <td>${city.cname}</td>
                    <td>${city.cproid.pname}</td>
                    <td><a href="byIdCity?id=${city.cid}">修改</a></td>
                    <td><a href="delCity?id=${city.cid}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</form>

</body>
</html>