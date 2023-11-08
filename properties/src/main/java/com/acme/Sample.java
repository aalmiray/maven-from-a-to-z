package com.acme;

import static org.apache.commons.lang3.StringUtils.capitalize;

public class Sample {
    public String greeting() {
        return capitalize("hello world");
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s.greeting());
    }
}
