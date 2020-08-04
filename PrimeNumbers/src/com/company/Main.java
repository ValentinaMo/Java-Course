package com.company;

public class Main {

    public static void main(String[] args) {


        int cont = 0;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)){
                cont++;
                System.out.println("Number"+i+" is a prime number");
                if(cont == 10){
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

