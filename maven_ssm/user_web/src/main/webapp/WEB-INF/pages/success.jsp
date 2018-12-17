<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询成功</title>
</head>
<body>
    <c:forEach items="${list}" var="user">
        ${user.id} ${user.name} ${user.money}<br>

    </c:forEach>
</body>
</html>
