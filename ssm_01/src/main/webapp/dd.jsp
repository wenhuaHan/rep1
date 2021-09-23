<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2021/9/9
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
         使用request域对象传递List有外键：<br>
        <table border="1" cellpadding="5">
            <tr>
                <td>城市名</td>
                <td>省份名</td>
            </tr>
           <c:forEach items="${citylist}" var="city">
               <tr>
                   <td>${city.cname}</td>
                   <td>${city.cproid.pname}</td>
               </tr>
           </c:forEach>
        </table>
</body>
</html>
