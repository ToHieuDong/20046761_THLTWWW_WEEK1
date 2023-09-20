package com.example.demoweek1.entities;

import com.example.demoweek1.enums.RoleStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_id", length = 50, nullable = false)
    private String role_id;
    @Column(name = "role_name", length = 50, nullable = false)
    private String role_name;
    @Column(name = "description", length = 50)
    private String description;
    @Column(name = "status",columnDefinition = "tinyint(4)", nullable = false)
    private RoleStatus status;

    public Role() {
    }

    public Role(String role_id, String role_name, String description, RoleStatus status) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.description = description;
        this.status = status;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String rale_name) {
        this.role_name = rale_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoleStatus getStatus() {
        return status;
    }

    public void setStatus(RoleStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id='" + role_id + '\'' +
                ", rale_name='" + role_name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
