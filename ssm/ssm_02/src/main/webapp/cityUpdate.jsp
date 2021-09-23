<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>修改城市信息</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
    <script src="js/cookie_util.js"></script>

</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 城市信息</strong></div>
    <div class="body-content">
        <form method="post" class="form-x" action="updateCity">
            <div class="form-group">
                <div class="label">
                    <label>城市名：</label>
                </div>
                <div class="field">
                    <input type="hidden" name="cid" value="${city.cid}" />
                    <input type="text" class="input w50" id="name" name="cname" value="${city.cname}" />
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>所属省份：</label>
                </div>
                <div class="field">

                    <select name="cproid.pid">
                        <option>----请选择----</option>
                        <c:forEach items="${provinceList}" var="pro">
                            <option value="${pro.pid}">${pro.pname}</option>
                        </c:forEach>
                    </select>

                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button onclick="add()" class="button bg-main icon-check-square-o" type="submit"> 修改</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body></html>