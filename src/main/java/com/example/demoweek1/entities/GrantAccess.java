package com.example.demoweek1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "grant_access")
public class GrantAccess {
    @Column(name = "note", length = 50)
    private String note;
    @Column(name = "is_grant", columnDefinition = "bit(1)")
    private boolean is_grant;

    @Id
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public GrantAccess() {
    }

    public GrantAccess(String note, boolean is_grant, Account account, Role role) {
        this.note = note;
        this.is_grant = is_grant;
        this.account = account;
        this.role = role;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "GrantAccess{" +
                "note='" + note + '\'' +
                ", is_grant=" + is_grant +
                ", account=" + account +
                ", role=" + role +
                '}';
    }
}
