package com.experiture.mobilesdk.utils;

public enum LibConstants {
    BASE_URL("https://mobileapi.experiture.com/");

    private String constant;

    LibConstants(String constant) {
        this.constant = constant;
    }

    public String value() {
        return constant;
    }
}
