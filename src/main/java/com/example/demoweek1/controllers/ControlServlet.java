package com.example.demoweek1.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "controlServlet", value = "/ctrl")
public class ControlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form action=\"\" method=\"get\">\n" +
                "    <input type=\"text\" name=\"user\" id=\"user\" placeholder=\"Tài khoản\"> <br>\n" +
                "    <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Mật khẩu\"> <br>\n" +
                "    <button type=\"submit\">Đăng nhập</button>\n" +
                "</form>");
        out.println("</body></html>");
    }
}
