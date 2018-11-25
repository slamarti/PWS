package com.slamarti.hlw.aanmelden.model;

public enum BurgerlijkeStaat {

    gehuwd("gehuwd"),
    ongehuwd("ongehuwd"),
    samenwonend("samenwonend"),
    weduwe("weduwe"),
    weduwenaar("weduwenaar"),
    gescheiden("gescheiden");

    private final String displayName;

    BurgerlijkeStaat(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
