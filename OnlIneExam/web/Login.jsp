<%-- 
    Document   : Login
    Created on : Aug 13, 2020, 10:08:01 AM
    Author     : lebinhan
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Gai Xinh Chon Loc</h1>
        <s:form action="login.authentication" method="POST">
            <s:label value="Login ID"/>
            <s:textfield name="id"/>
            <s:label value="Password"/>
            <s:textfield name="password"/>
            <s:submit value="Login"/>
        </s:form>
    </body>
</html>
