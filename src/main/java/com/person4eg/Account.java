package com.person4eg;

import java.util.regex.Pattern;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name == null) return false;
        return Pattern.matches("(?=^.{3,19}$)(^\\S+\\s\\S+$)",name);
    }
}