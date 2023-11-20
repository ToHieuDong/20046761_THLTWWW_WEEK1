<%@ page import="com.example.demoweek1.entities.Account" %>
<%@ page import="java.util.Optional" %><%--
  Created by IntelliJ IDEA.
  User: Gnoodd
  Date: 11/20/2023
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>

<%
    if (request.getAttribute("acc") == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account</title>
</head>
<body>
<div>
    <h2>Account Details</h2>

    <%-- Lấy giá trị từ session --%>
    <% Optional<Account> account = (Optional<Account>) request.getAttribute("acc"); %>

    <table width="70%" align="center" border="1">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Email</td>
            <td>Status</td>
            <td>Logout</td>
        </tr>
        <% if (account != null) { %>
        <tr>
            <td><%= account.get().getAccount_id() %></td>
            <td><%= account.get().getFull_name() %></td>
            <td><%= account.get().getEmail() %></td>
            <td><%= account.get().getStatus() %></td>
            <td><a href="?action=logout">Logout</a></td>
        </tr>
        <% } else { %>
        <!-- Xử lý khi account là null -->
        User not logged in.
        <% } %>
    </table>

</div>
</body>
</html>
