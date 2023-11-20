<%@ page import="com.example.demoweek1.entities.Account" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Gnoodd
  Date: 11/20/2023
  Time: 10:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accounts</title>
</head>
<body>
<h1>Accounts</h1>
<%
    List<Account> lst = (List<Account>) request.getAttribute("accounts");
%>
<table width="70%" align="center" border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Password</th>
        <th>Status</th>
        <th colspan="2"><a href="#">Insert</a> </th>
    </tr>
    <%for(Account acc: lst){
        String id = acc.getAccount_id();
        String active = "?action=update&id="+id;
        String deactive = "?action=delete&id="+id;
    %>
    <tr>
        <td><%=acc.getAccount_id()%></td>
        <td><%=acc.getFull_name()%></td>
        <td><%=acc.getEmail()%></td>
        <td><%=acc.getPassword()%></td>
        <td><%=acc.getStatus()%></td>

        <td><a href=<%=active%> >Active</a> </td>
        <td><a href=<%=deactive%> >Delete</a> </td>
    </tr>

    <%}%>
</table>

</body>
</html>
