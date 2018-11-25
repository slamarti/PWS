package com.slamarti.hlw.aanmelden.model.types;

public enum VerzorgerType {

    vader("vader"),
    moeder("moeder"),
    pleegouder("pleegouder"),
    voogd("voogd(es)");

    private final String displayName;

    VerzorgerType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
