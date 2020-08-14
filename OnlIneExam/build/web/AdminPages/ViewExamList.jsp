<%-- 
    Document   : ViewExamList
    Created on : Aug 14, 2020, 3:42:12 PM
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
        <h1>Exam list</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th colspan="3">Action</th>
            </tr>
            <s:iterator var="exam" value="exams">
                <tr>
                    <td><s:property value="#exam.id"/></td>
                    <td><s:property value="#exam._class"/></td>
                    <td><a href="<s:property value="#exam.id"/>">View detail</a></td>
                    <td><a href="<s:property value="#exam.id"/>">Update</a></td>
                    <td><a href="<s:property value="#exam.id"/>">Delete</a></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
