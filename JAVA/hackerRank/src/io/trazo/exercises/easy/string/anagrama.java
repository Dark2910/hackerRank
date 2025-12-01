package io.trazo.exercises.easy.string;

import java.util.Arrays;
import java.util.Scanner;

public class anagrama {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String inputA = scanner.nextLine().toLowerCase();
    String inputB = scanner.nextLine().toLowerCase();

    char[] charsA = inputA.toCharArray();
    char[] charsB = inputB.toCharArray();

    Arrays.sort(charsA);
    Arrays.sort(charsB);

    if(Arrays.equals(charsA, charsB)){
      System.out.println("Anagrams");
    } else {
      System.out.println("Not Anagrams");
    }
  }
}
