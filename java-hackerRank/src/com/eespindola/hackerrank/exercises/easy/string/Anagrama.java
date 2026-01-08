package com.eespindola.hackerrank.exercises.easy.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String inputA = scanner.nextLine().toLowerCase();
    String inputB = scanner.nextLine().toLowerCase();

    if(inputA.length() != inputB.length()){
      System.out.println("Not Anagrams");
    }

    char[] dataA = inputA.toCharArray();
    char[] dataB = inputB.toCharArray();

    Arrays.sort(dataA);
    Arrays.sort(dataB);

    String message = Objects.equals(dataA, dataB)? "Anagrams" : "Not Anagrams";
    System.out.println(message);
  }
}
