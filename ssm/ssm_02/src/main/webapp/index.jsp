<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>物流管理系统</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/cookie_util.js"></script>
    <script type="text/javascript">
        function clear(){
            delCookie(userId);
        }
    </script>
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
    <div class="logo margin-big-left fadein-top">
        <h1><img src="images/W.jpg" class="radius-circle rotate-hover" height="50" alt="" />物流管理系统</h1>
    </div>
    <div class="head-l"><a onclick="clear()" style="margin-left: 950px" class="button button-little bg-red" href="login.html"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
    <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
    <h2><span class="icon-user"></span>省份信息</h2>
    <ul style="display:block">
        <li><a href="provinceAdd.jsp" target="right"><span class="icon-caret-right"></span>添加省份</a></li>
        <li><a href="allProvince" target="right"><span class="icon-caret-right"></span>查看省份</a></li>
    </ul>
    <h2><span class="icon-user"></span>城市信息</h2>
    <ul style="display:block">
        <li><a href="findAllPro" target="right"><span class="icon-caret-right"></span>添加城市</a></li>
        <li><a href="allCity" target="right"><span class="icon-caret-right"></span>查看城市</a></li>
    </ul>

</div>
<script type="text/javascript">
    $(function(){
        $(".leftnav h2").click(function(){
            $(this).next().slideToggle(200);
            $(this).toggleClass("on");
        })
        $(".leftnav ul li a").click(function(){
            $("#a_leader_txt").text($(this).text());
            $(".leftnav ul li a").removeClass("on");
            $(this).addClass("on");
        })
    });
</script>
<ul class="bread">
    <li><a href="{:U('Index/info')}" target="right" class="icon-home"> 首页</a></li>
    <li><a href="##" id="a_leader_txt">网站信息</a></li>
    <li><b>当前语言：</b><span style="color:red;">中文</span></li>
</ul>
<div class="admin">
    <iframe scrolling="auto" rameborder="0" src="hello.jsp" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>