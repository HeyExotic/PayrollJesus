package org.example;

import java.util.Scanner; 

public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Payroll Calculator!");

System.out.println("\nHow many hours did you work this week? ");
    Scanner scanner = new Scanner(System.in);
    int Hours = scanner.nextInt();

    System.out.println("\nHow many children do you have? ");
    int Dependents = scanner.nextInt();

    scanner.close();

    double grossPay = Hours * 16.78;
    double deductions = Dependents * 3.0;
    double netPay = grossPay - deductions;

    System.out.println("\nPayroll Stub: ");
    System.out.println("\nHours Worked: " + Hours);
    System.out.println("Hourly Rate: $16.78");
    System.out.println("\nYour gross pay is: $" + grossPay);
    System.out.println("Your deductions are: $" + deductions);
    System.out.println("Your net pay is: $" + netPay);
  }
}
