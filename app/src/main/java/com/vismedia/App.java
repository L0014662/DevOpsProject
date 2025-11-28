package com.vismedia;

public class App {
  public static void main(String[] args) {

    int a = 5, b = 7;
    System.out.println("Adding " + a + " plus " + b + " equals: " + add(a, b));
  }

  // Add function
  public static int add(int a, int b) {
    return a + b;
  }

  // Multiply function
  public static int multiply(int a, int b) {
    return a * b;
  }

  // Divide function
  public static int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero is not allowed.");
    }
    return a / b;
  }

  // Check if number is positive
  public static boolean isPositive(int x) {
    return x > 0;
  }
}
