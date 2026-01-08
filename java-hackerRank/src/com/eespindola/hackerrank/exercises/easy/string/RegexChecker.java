package com.eespindola.hackerrank.exercises.easy.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RegexChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer limit =Integer.parseInt(scanner.nextLine());

    List<String> data = IntStream.range(0, limit)
            .mapToObj(x -> scanner.nextLine())
            .collect(Collectors.toCollection(ArrayList::new));

    List<String> results = new ArrayList<>();

    for (String x : data){
      try{
        Pattern.compile(x);
        results.add("Valid");
      }catch (PatternSyntaxException e){
        results.add("Invalid");
      }
    }

    for (String result : results){
      System.out.println(result);
    }
  }
}
