package com.example.demoweek1.enums;

public enum RoleStatus {
    ACTIVE(1),
    dEACTIVE(0),
    DELETE(-1);
    private int valus;

    RoleStatus(int valus) {
        this.valus = valus;
    }

    public int getValus() {
        return valus;
    }
}
