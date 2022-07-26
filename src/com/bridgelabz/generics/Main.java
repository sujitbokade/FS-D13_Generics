package com.bridgelabz.generics;

public class Main {
    public static void main(String[] args) {
        MaxString maxString=new MaxString();
        System.out.println("First Test Case:-");
        maxString.maxValue("Apple","Peach","Banana");
        System.out.println("Second Test Case:-");
        maxString.maxValue("Banana","Mango","coconut");
        System.out.println("Third Test Case:-");
        maxString.maxValue("Apple","Orange","Carrot");
    }

}
