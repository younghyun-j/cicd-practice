package com.cicdpractice;

public class Test {
    public String test(String input) {
        return switch (input) {
            case "hello" -> "world";
            case "jpa" -> "hibernate";
            case "spring" -> "boot";
            default -> "default";
        };
    }
}
