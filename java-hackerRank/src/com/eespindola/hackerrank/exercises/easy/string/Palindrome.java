package io.trazo.exercises.easy.string;

import java.util.Objects;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String inputRevers = new StringBuilder(input).reverse().toString();
    String isPalindromo = Objects.equals(input, inputRevers)? "Yes" : "No";
    System.out.println(isPalindromo);
  }
}
