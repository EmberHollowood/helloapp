package com.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        String names = "World";

        if (args.length > 0) {
            StringBuilder namesBuilder = new StringBuilder();

            for (String name : args) {
                namesBuilder.append(name).append(", ");
            }

            if (namesBuilder.length() > 0) {
                names = namesBuilder.substring(0, namesBuilder.length() - 2);
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}
