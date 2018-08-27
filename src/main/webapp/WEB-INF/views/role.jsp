<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
    <center>
        <h2>Hello World</h2>
        <p>
            角色名称为：<c:out value="${role.roleName}"></c:out> 角色描述：<c:out value="${role.note}"></c:out>     </p>
    </center>
</body>
</html>