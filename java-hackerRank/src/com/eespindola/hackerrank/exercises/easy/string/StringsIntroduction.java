package com.eespindola.hackerrank.exercises.easy.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StringsIntroduction {
  public static void main(String[] args){
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String[] inputsSorted = IntStream.range(0, 2)
            .mapToObj(x -> {
              try {
                String input = bufferedReader.readLine();
                return input.isBlank()
                        ? input
                        : input.substring(0, 1).toUpperCase() + input.substring(1);
              } catch (IOException e) {
                throw new RuntimeException(e);
              }
            })
            .sorted()
            .toArray(String[]::new);

    int totalLength = Arrays.stream(inputsSorted).mapToInt(String::length).sum();

//    String aGreaterThanB = Arrays.stream(inputsSorted)
//            .reduce((a, b) -> (a.compareTo(b) > 0)? "Yes":"No")
//            .orElse("");

//    String newWord = Arrays.stream(inputsSorted)
//            .reduce((a,b) -> (a + " " + b))
//            .orElse("");

    String aGreaterThanB = (inputsSorted[0].compareTo(inputsSorted[1]) > 0)
            ? "Yes"
            : "No";

    String newWord = String.join(" ", inputsSorted);

    System.out.println(totalLength);
    System.out.println(aGreaterThanB);
    System.out.println(newWord);
  }
}
