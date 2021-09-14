/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("What is your name? ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + ", nice to meet you!");
    scanner.close();
  }
}
