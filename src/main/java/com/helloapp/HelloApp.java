package com.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder namesBuilder = new StringBuilder();
            boolean isFirst = true;

            for (String name : args) {
                if (!isFirst) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
                isFirst = false;
            }

            names = namesBuilder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}
