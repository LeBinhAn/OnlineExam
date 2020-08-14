<%-- 
    Document   : index.jsp
    Created on : Aug 12, 2020, 2:29:35 PM
    Author     : lebinhan
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Everglow Fan club <3</h1>
        <button><a href="loginRequest">Login<a/></button>
        <h2>Up comming exams</h2>
        <table border="1">
            <tr>
                <th>Class</th>
                <th>Date</th>
                <th>Semester</th>
            </tr>
            <tr>
                <s:iterator var="exam" value="exams">
                    <td><s:property value="#exam.classroom"/> </td>
                    <td><s:property value="#exam.start_time"/> </td>
                    <td><s:property value="#exam.semester"/> </td>
                </s:iterator>
            </tr>
        </table>
    </body>
</html>
