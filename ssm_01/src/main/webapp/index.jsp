<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%-- <a href="addProvince?id=1&name=zhang">测试1</a><br>
   <a href="addProvince2?pid=1&pname=内蒙古">测试2</a><br>
   <a href="addCity?cid=1&cname=呼和浩特&cproid.pid=1&cproid.pname=内蒙古">测试3</a><br>--%>

  <a href="putongString?id=1&username=hwh">实现接收普通类型+String</a><br>
  <a href="putongClass?pid=1&pname=内蒙古">实现接收普通类</a><br>
  <a href="ClassForeignkey?cname=呼和浩特&cproid.pid=1&cproid.pname=内蒙古">实现接收有外键的类</a><br>
  <a href="putongRequest">使用request域传递普通值</a><br>
  <a href="putongClassRequest">使用request域对象传递普通类</a><br>
  <a href="ClassForeignkeyRequest">使用request域对象传递有外键</a><br>
  <a href="ListForeignkeyRequest">使用request域对象传递List有外键</a><br>

  <a href="putongModel">使用model域传递普通值</a><br>
  <a href="putongClassModel">使用model域对象传递普通类</a><br>
  <a href="ForeignkeyModel">使用model域对象传递有外键</a><br>
  <a href="ListForeignkeyModel">使用model域对象传递List有外键</a><br>
  <a href="ControllerModel">使用model域对象传递普通值到另一个controller并展示</a><br>
  <a href="SessionForeignkey">使用session 域对象传递一个有外键的类</a><br>
</body>
</html>
