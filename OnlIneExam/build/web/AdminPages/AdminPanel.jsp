<%-- 
    Document   : AdminPannel
    Created on : Aug 13, 2020, 11:32:34 AM
    Author     : lebinhan
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Pannel</title>
    </head>
    <body>
        <h1>Admin Panel</h1>
        <h2>Question Management</h2>
        <button ><a href="">Create new question</a></button>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Question</th>
                <th>Type</th>
                <th>Subject</th>
                <th colspan="3">Action</th>
            </tr>
            <s:iterator var="question" value="questions">
                <tr>
                    <td><s:property value="#question.id"/></td>
                    <td><s:property value="#question.question"/></td>
                    <td><s:property value="#question.type"/></td>
                    <td><s:property value="#question.subject"/></td>
                    <td><a href="<s:property value="#exam.id"/>">View detail</a></td>
                    <td><a href="<s:property value="#exam.id"/>">Update</a></td>
                    <td><a href="<s:property value="#exam.id"/>">Cancel</a></td>
                </tr>
            </s:iterator>
        </table>
        <h2>Exam management</h2>
        <button ><a href="">Create new exam</a></button>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Semester</th>
                <th>Class</th>
                <th>Start At</th>
                <th>Duration</th>
                <th>Status</th>
                <th colspan="3">Action</th>
            </tr>
            <s:iterator var="exam" value="exams">
                <tr>
                    <td><s:property value="#exam.id"/></td>
                    <td><s:property value="#exam.semester"/></td>
                    <td><s:property value="#exam.class_"/></td>
                    <td><s:property value="#exam.start_at"/></td>
                    <td><s:property value="#exam.duration"/></td>
                    <td><s:property value="#exam.status"/></td>
                    <td><a href="<s:property value="#exam.id"/>">View detail</a></td>
                    <td><a href="<s:property value="#exam.id"/>">Update</a></td>
                    <td><a href="<s:property value="#exam.id"/>">Cancel</a></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
