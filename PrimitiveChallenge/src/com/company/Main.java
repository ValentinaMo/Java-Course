package com.company;

public class Main {

    public static void main(String[] args) {
        byte ExampleByte = 40;
        short ExampleShort = 50;
        int ExampleInt = 60;
        long ExampleLong = 50000L + 10L * (ExampleByte + ExampleInt + ExampleShort);
        System.out.println(ExampleLong);
        short shortTotal = (short) (1000 + 10 * (ExampleByte + ExampleInt + ExampleShort));
    }
}
