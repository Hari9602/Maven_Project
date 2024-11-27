package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator!");

        while (true) {
            System.out.print("Enter first number (or type 'exit' to quit): ");
            String input1 = scanner.nextLine();
            if (input1.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter second number: ");
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Choose an operation (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);

            double result;
            switch (operation) {
                case '+':
                    result = Calculator.add(num1, num2);
                    break;
                case '-':
                    result = Calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = Calculator.multiply(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = Calculator.divide(num1, num2);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; // Skip to the next iteration
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    continue; // Skip to the next iteration
            }

            System.out.printf("The result of %.2f %c %.2f = %.2f%n", num1, operation, num2, result);
        }

        scanner.close();
        System.out.println("Thank you for using the calculator!");
    }
}