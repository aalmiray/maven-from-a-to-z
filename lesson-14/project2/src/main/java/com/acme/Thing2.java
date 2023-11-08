package com.acme;

public class Thing2 {
    public String getValue() {
        return (new Thing1().getValue()) + "2";
    }
}