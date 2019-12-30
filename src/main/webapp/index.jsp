<%@page language="java" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>CRUD</title>
    <style>
        table{
            margin: auto;
            border:1px gray solid;
            width: 70%;
        }
        th,td{
            border:1px gray solid;
        }
    </style>
</head>
<c:if test="${empty sessionScope.USER_LIST}">
    <c:redirect url="user"/>
</c:if>
<body>
    <table>
        <tr>
            <th>序号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>住址</th>
        </tr>
        <c:forEach var="ui" items="${sessionScope.USER_LIST}" varStatus="j">
            <tr>
                <td>${j.count}</td>
                <td>${ui.userName}</td>
                <td>${ui.userSex}</td>
                <td>${ui.userAge}</td>
                <td>${ui.userAddress}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
