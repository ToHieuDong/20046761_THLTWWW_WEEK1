package com.example.demoweek1.enums;

public enum AccountStatus {
    ACTIVE(0),
    DEACTIVE(1),
    DELETE(2);

    private int value;

    AccountStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
