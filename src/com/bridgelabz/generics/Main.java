package com.bridgelabz.generics;

public class Main {
    public static void main(String[] args) {
        MaxInteger maxInteger=new MaxInteger();
        System.out.println("First Test Case:-");
        maxInteger.maxValue(7,4,9);
        System.out.println("Second Test Case:-");
        maxInteger.maxValue(4,8,2);
        System.out.println("Third Test Case:-");
        maxInteger.maxValue(6,5,3);
    }

}
