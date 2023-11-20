package com.example.demoweek1.controllers;

import com.example.demoweek1.entities.Account;
import com.example.demoweek1.enums.AccountStatus;
import com.example.demoweek1.services.AccountServices;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/ControlServlet"})
public class ControlServlet extends HttpServlet {

    private AccountServices accountServices = new AccountServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null)
            action = "";
        switch (action) {
//            case "":
//                req.getRequestDispatcher("index.jsp").forward(req, resp);
//                break;
            case "login":
                req.getRequestDispatcher("login.jsp").forward(req, resp);
                break;
            case "logout":
                req.removeAttribute("acc");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
                break;
            case "list":
                req.setAttribute("accounts", accountServices.getAll());
                req.getRequestDispatcher("listAccount.jsp").forward(req, resp);
                break;
            case "update":
                System.out.println("ngungu");
                handleActive(req, resp);
                break;
            case "delete":
                handleDeactive(req, resp);
                break;

            default:
                req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "formLogin":
                handleLogin(req, resp);
                break;

        }
    }

    //    =============================================

    private void handleDeactive(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id =req.getParameter("id");
        System.out.println(id);
        accountServices.updateStatus(id, AccountStatus.DEACTIVE);
        req.setAttribute("accounts", accountServices.getAll());
        req.getRequestDispatcher("listAccount.jsp").forward(req, resp);
    }

    private void handleActive(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id =req.getParameter("id");
        accountServices.updateStatus(id, AccountStatus.ACTIVE);
        req.setAttribute("accounts", accountServices.getAll());
        req.getRequestDispatcher("listAccount.jsp").forward(req, resp);
    }

    private void handleLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Xử lý đăng nhập ở đây
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // Thực hiện các kiểm tra đăng nhập hoặc xác thực tài khoản
        Optional<Account> acc = accountServices.isLogin(email, password);
        boolean authenticationSuccessful = !acc.isEmpty();

        // Sau khi xử lý đăng nhập, bạn có thể chuyển hướng hoặc thực hiện các thao tác khác
        if (authenticationSuccessful) {
            // Chuyển hướng đến trang thành công hoặc thực hiện các thao tác khác
            req.setAttribute("acc", acc);
            req.getRequestDispatcher("detailAccount.jsp").forward(req, resp);
        } else {
            // Chuyển hướng đến trang lỗi hoặc thực hiện các thao tác khác
            req.setAttribute("errorMessage", "Tài khoản hoặc mật khẩu không chính xác. Vui lòng thử lại.");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }

}
