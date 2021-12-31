package com.person4eg;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null) return false;
        if (name.length() < 3 || name.length() > 19) return false;
        if (name.split(" ").length != 2) return false;
        if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') return false;
        return true;
    }
}