package com.arron.project.util;



public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String str = "How are you ?";
        //say(str);
        getSay(str);
        SecondClass sc = new SecondClass();
        System.out.println(sc.getName());
    }

    public static void say(String str) {
        System.out.println(str);
    }

    public static void getSay(String str) {
        say(str);
    }
}
