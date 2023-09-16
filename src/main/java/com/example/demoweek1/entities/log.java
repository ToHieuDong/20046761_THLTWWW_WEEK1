package com.example.demoweek1.entities;

import java.util.Date;

public class log {
    private long id;
    private String account_id;
    private String notes;
    private Date login_time;
    private Date logout_time;

    public log() {
    }

    public log(long id, String account_id, String notes, Date login_time, Date logout_time) {
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
        return "log{" +
                "id=" + id +
                ", account_id='" + account_id + '\'' +
                ", notes='" + notes + '\'' +
                ", login_time=" + login_time +
                ", logout_time=" + logout_time +
                '}';
    }
}
