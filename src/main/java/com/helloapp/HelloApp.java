package com.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        String names = args.length > 0 ? String.join(", ", args) : "World";
        System.out.println("Hello, " + names + "!");
    }
}
