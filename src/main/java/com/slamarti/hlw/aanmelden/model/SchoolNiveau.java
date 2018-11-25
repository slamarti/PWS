package com.slamarti.hlw.aanmelden.model;

public enum SchoolNiveau {

    mavo("mavo"),
    mavo_havo("mavo/havo"),
    havo("havo"),
    havo_vwo("havo/vwo"),
    vwo("vwo");

    private final String displayName;

    SchoolNiveau(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
