package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); //define an object of Car, we call it porsche and initialize
        Car volkswagen = new Car();
        porsche.setModel("911");
        System.out.println("Model is: " + porsche.getModel());


    }
}
