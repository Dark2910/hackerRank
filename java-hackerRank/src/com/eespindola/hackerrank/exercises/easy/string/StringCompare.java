package com.eespindola.hackerrank.exercises.easy.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringCompare {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    String word = scanner.nextLine();
    int value = Integer.parseInt(scanner.nextLine());

    List<String> words = new ArrayList<>();

    for(int i = 0; i <= (word.length() - value); i++){
      words.add(word.substring(i, i + value));
    }

    List<String> sortedWords = words.stream()
            .sorted()
            .collect(Collectors.toList());

    System.out.println(sortedWords.getFirst());
    System.out.println(sortedWords.getLast());
  }
}
