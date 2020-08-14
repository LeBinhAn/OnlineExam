<%-- 
    Document   : ViewStudentList
    Created on : Aug 14, 2020, 11:19:31 AM
    Author     : lebinhan
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student list</title>
    </head>
    <body>
        <h1>Student list</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th colspan="3">Action</th>
            </tr>
            <s:iterator var="user" value="students">
                <tr>
                    <td><s:property value="#user.id"/></td>
                    <td><s:property value="#user.name"/></td>
                    <td><a href="<s:property value="#user.id"/>">View detail</a></td>
                    <td><a href="<s:property value="#user.id"/>">Update</a></td>
                    <td><a href="<s:property value="#user.id"/>">Delete</a></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
