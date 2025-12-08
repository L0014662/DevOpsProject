package com.vismedia;

import java.util.logging.Logger;
import java.util.logging.Level;

public class App {

  private static final Logger logger = Logger.getLogger(App.class.getName());
  public static void main(String[] args) {

    logger.info("Application started.");

    int a = 5, b = 7, c = 10, d = 2;

    logger.fine("Preparing to perform math operations");

    System.out.println("Adding " + a + " plus " + b + " equals: " + add(a, b));
    System.out.println(a + " multiplied by " + b + " equals: " + multiply(a, b));

    try {
      System.out.println(c + " divivded by " + d + " equals: " + divide(c, d));
    } catch (ArithmeticException ex ) {
      logger.log(Level.SEVERE, "Error during division operation", ex);
    }
    
    System.out.println(a + " is a positive number? - " + isPositive(a));
    logger.info("Application finished");
  }

  // Add function
  public static int add(int a, int b) {
    logger.fine("Adding numbers: " + a + " + " + b);
    return a + b;
  }

  // Multiply function
  public static int multiply(int a, int b) {
    logger.fine("Multiplying numbers: " + a + " * " + b);
    return a * b;
  }

  // Divide function
  public static int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero is not allowed.");
    }
    logger.fine("Dividing numbers: " + a + " / " + b);
    return a / b;
  }

  // Check if number is positive
  public static boolean isPositive(int x) {
    logger.fine("Checking number is positive: " + x);
    return x > 0;
  }
}
