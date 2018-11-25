package com.slamarti.hlw.aanmelden.model.types;

public enum TelephoneType {
    prive("prive"),
    werk("werk"),
    geheim("geheim");

    private final String displayName;

    TelephoneType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
