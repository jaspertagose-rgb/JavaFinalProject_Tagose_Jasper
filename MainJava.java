/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java;

import java.util.Scanner;

class UnitConverter {

    Scanner input = new Scanner(System.in);

    public void start() {
        int choice = 0;

        while (choice != 4) {
            System.out.println("\nUnit Converter");
            System.out.println("1. Length");
            System.out.println("2. Mass");
            System.out.println("3. Temperature");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();

            if (choice == 1) {
                length();
            } else if (choice == 2) {
                mass();
            } else if (choice == 3) {
                temperature();
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public void length() {
        System.out.println("\nLength Units");
        System.out.println("1. Meters");
        System.out.println("2. Kilometers");

        System.out.print("From: ");
        int from = input.nextInt();
        System.out.print("To: ");
        int to = input.nextInt();
        System.out.print("Value: ");
        double value = input.nextDouble();

        if (from == 1 && to == 2) {
            System.out.println("Answer: " + (value / 1000));
        } else if (from == 2 && to == 1) {
            System.out.println("Answer: " + (value * 1000));
        } else {
            System.out.println("Same unit: " + value);
        }
    }

    public void mass() {
        System.out.println("\nMass Units");
        System.out.println("1. Kilograms");
        System.out.println("2. Grams");

        System.out.print("From: ");
        int from = input.nextInt();
        System.out.print("To: ");
        int to = input.nextInt();
        System.out.print("Value: ");
        double value = input.nextDouble();

        if (from == 1 && to == 2) {
            System.out.println("Answer: " + (value * 1000));
        } else if (from == 2 && to == 1) {
            System.out.println("Answer: " + (value / 1000));
        } else {
            System.out.println("Same unit: " + value);
        }
    }

    public void temperature() {
        System.out.println("\nTemperature Units");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");

        System.out.print("From: ");
        int from = input.nextInt();
        System.out.print("To: ");
        int to = input.nextInt();
        System.out.print("Value: ");
        double value = input.nextDouble();

        if (from == 1 && to == 2) {
            System.out.println("Answer: " + ((value * 9 / 5) + 32));
        } else if (from == 2 && to == 1) {
            System.out.println("Answer: " + ((value - 32) * 5 / 9));
        } else {
            System.out.println("Same unit: " + value);
        }
    }
}

public class MainJava {

    public static void main(String[] args) {
        UnitConverter converter = new UnitConverter();
        converter.start();
    }
}
