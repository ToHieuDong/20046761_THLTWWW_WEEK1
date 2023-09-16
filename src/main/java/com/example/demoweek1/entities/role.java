package com.example.demoweek1.entities;

public class role {
    private String role_id;
    private String rale_name;
    private String description;
    private byte status;

    public role() {
    }

    public role(String role_id, String rale_name, String description, byte status) {
        this.role_id = role_id;
        this.rale_name = rale_name;
        this.description = description;
        this.status = status;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRale_name() {
        return rale_name;
    }

    public void setRale_name(String rale_name) {
        this.rale_name = rale_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "role{" +
                "role_id='" + role_id + '\'' +
                ", rale_name='" + rale_name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
