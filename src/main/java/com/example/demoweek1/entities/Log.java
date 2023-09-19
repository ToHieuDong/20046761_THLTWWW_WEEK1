package com.example.demoweek1.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "log")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "bigint(20)")
    private long id;
    @Column(name = "account_id", length = 50, nullable = false)
    private String account_id;
    @Column(name = "notes", length = 50, nullable = false)
    private String notes;
    @Column(name = "login_time", columnDefinition = "datetime", nullable = false)
    private Date login_time;
    @Column(name = "logout_time", columnDefinition = "datetime", nullable = false)
    private Date logout_time;

    public Log() {
    }

    public Log(long id, String account_id, String notes, Date login_time, Date logout_time) {
        this.id = id;
        this.account_id = account_id;
        this.notes = notes;
        this.login_time = login_time;
        this.logout_time = logout_time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public Date getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(Date logout_time) {
        this.logout_time = logout_time;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", account_id='" + account_id + '\'' +
                ", notes='" + notes + '\'' +
                ", login_time=" + login_time +
                ", logout_time=" + logout_time +
                '}';
    }
}
