package com.arron.project.bao;

import com.arron.project.util.SecondClass;

public class Bao {
    public static void main(String[] args) {
        getName();
    }

    public static void getName() {
        SecondClass sc = new SecondClass();
        System.out.println(sc.getName());
    }
}
