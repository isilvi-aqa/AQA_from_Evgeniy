package org.example.lecture1;

public class Lecture1 {

    public static String classMessage = "Some class message";

    public static void main(String[] args) {
//        Example 1
        printHelloWorld();
//        Example 2
        printMessage(classMessage);
//        Example 3
        classMessage = "New " + classMessage + "!!!";
        printMessage(classMessage);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}