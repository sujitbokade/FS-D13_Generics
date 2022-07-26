package com.bridgelabz.generics;

public class Main {
    public static void main(String[] args) {
        MaxFloat maxFloat=new MaxFloat();
        System.out.println("First Test Case:-");
        maxFloat.maxValue(7.2F,4.5F,9.4F);
        System.out.println("Second Test Case:-");
        maxFloat.maxValue(4.4F,8.6F,2.5F);
        System.out.println("Third Test Case:-");
        maxFloat.maxValue(6.4F,5.4F,2.3F);
    }

}
