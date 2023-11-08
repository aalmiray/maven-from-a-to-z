package com.acme;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().getValue());
    }

    public String getValue() {
        return (new Thing2().getValue()) + "3";
    }
}