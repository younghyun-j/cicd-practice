package com.cicdpractice;

public class CiTest3 {
    public String test(String input) {
        return switch (input) {
            case "hello" -> "world";
            case "jpa" -> "hibernate";
            case "spring" -> "boot";
            default -> "default";
        };
    }
}
