package com.eespindola.hackerrank.exercises.easy.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Tokens {
  public static void main(String[] args) {
    String regex = "[^A-Za-z]+";
    Pattern pattern = Pattern.compile(regex);

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine().trim();

    if (input.isBlank()) {
      System.out.println(0);
      return;
    }

    String[] tokens = pattern.split(input);

    List<String> list = new ArrayList<>();
    list.addFirst(String.valueOf(tokens.length));
    for (String token : tokens) {
      if (!token.isBlank()) {
        list.add(token);
      }
    }

    for(String x : list){
      System.out.println(x);
    }
  }
}
