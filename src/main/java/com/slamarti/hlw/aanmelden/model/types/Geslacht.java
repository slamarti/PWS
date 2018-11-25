package com.slamarti.hlw.aanmelden.model.types;

public enum Geslacht {

    man("man"),
    vrouw("vrouw");

    private final String displayName;

    Geslacht(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
