package com.example.demoweek1.entities;

public class grant_access {
    private String role_id;
    private String account_id;
    private String note;
    private boolean is_grant;

    public grant_access() {
    }

    public grant_access(String role_id, String account_id, String note, boolean is_grant) {
        this.role_id = role_id;
        this.account_id = account_id;
        this.note = note;
        this.is_grant = is_grant;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isIs_grant() {
        return is_grant;
    }

    public void setIs_grant(boolean is_grant) {
        this.is_grant = is_grant;
    }

    @Override
    public String toString() {
        return "grant_access{" +
                "role_id='" + role_id + '\'' +
                ", account_id='" + account_id + '\'' +
                ", note='" + note + '\'' +
                ", is_grant=" + is_grant +
                '}';
    }
}
