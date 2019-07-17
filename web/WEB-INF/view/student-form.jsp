<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Data Input Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
    
    First Name<form:input path="firstName" placeholder="${student.firstName}"/>
    <br><br>
    Last Name<form:input path="lastName"/>
    <br><br>
    Country <form:select path="country">
                <%--<form:option value="Brazil" label="Brazil"/>
                <form:option value="France" label="France"/>
                <form:option value="Germany" label="Germany"/>
                <form:option value="India" label="India"/>--%>
                <form:options items="${student.countries}"/>
            </form:select>
    <br><br>
    <%--Java <form:radiobutton path="favouriteLanguage" value="Java"/>
    C++ <form:radiobutton path="favouriteLanguage" value="C++"/>
    JS <form:radiobutton path="favouriteLanguage" value="JS"/>
    PL/SQL <form:radiobutton path="favouriteLanguage" value="PL/SQL"/>--%>
    Favourite Language <form:radiobuttons path="favouriteLanguage" items="${student.languages}"/>
    <br><br>
    Operating System <%--<form:checkbox path="operatingSystem" value="Windows" label="Windows"/>
                     <form:checkbox path="operatingSystem" value="Mac" label="Mac"/>
                     <form:checkbox path="operatingSystem" value="Linux" label="Linux"/>--%>
                     <form:checkboxes path="operatingSystem" items="${student.operatingSystems}"/>
    <br><br>
    <input type="submit" value="Submit"/>
    
</form:form>


</body>
</html>
