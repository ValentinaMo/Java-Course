package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int sum = 0;
        {
            while (true) {
                int order = cont + 1;
                System.out.println("Enter  number " + order + ":");
                boolean entero = scanner.hasNextInt(); //check the valid numbers

                if (entero) {
                    int number = scanner.nextInt();
                    cont++;
                    sum += number;
                    if (cont == 10) {
                        break;
                    }
                } else {
                    System.out.println("Invalid number");
                }
                scanner.nextLine();
            }

            System.out.println("sum =" + sum);
            scanner.close();
        }
    }
}
