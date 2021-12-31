package com.person4eg;

public class Praktikum {

    public static void main(String[] args) {
        String name = "Alexei Pershakov";
        Account account = new Account(name);
        System.out.println(account.checkNameToEmboss());
    }
}