package com.example.demoweek1.entities;

import com.example.demoweek1.enums.AccountStatus;
import jakarta.persistence.*;
import jakarta.persistence.Query;


@Entity
@Table(name = "account")
@NamedQueries(
        @NamedQuery(name = "Account.findAll", query = "select Account from Account where Account.status=1")
)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", length = 50, nullable = false)
    private String account_id;
    @Column(name = "full_name", length = 50, nullable = false)
    private String full_name;
    @Column(name = "password", length = 50, nullable = false)
    private String password;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "phone", length = 50)
    private String phone;
    @Column(name = "status", columnDefinition = "tiny(4)")
    private AccountStatus status;


    public Account() {

    }

    public Account(String accountId, String fullName, String password, String email, String phone, AccountStatus status) {
        account_id = accountId;
        full_name = fullName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    public String getAccount_id() {
        return account_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_id='" + account_id + '\'' +
                ", full_name='" + full_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}
