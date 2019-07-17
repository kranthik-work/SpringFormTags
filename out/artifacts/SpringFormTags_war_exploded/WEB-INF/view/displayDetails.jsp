<%--
  Created by IntelliJ IDEA.
  User: krant
  Date: 7/30/2017
  Time: 6:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Details</title>
</head>
<body>

Welcome ${student.firstName} ${student.lastName}
<br><br>
Country ${student.country}
<br><br>
Favourite Language ${student.favouriteLanguage}
<br><br>
Operating System
<ul>

    <c:forEach var="os" items="${student.operatingSystem}">
        <li> ${os}</li>
    </c:forEach>
</ul>
</body>
</html>
