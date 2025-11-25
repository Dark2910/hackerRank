package io.trazo.exercises.easy.introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutputFormatting {
  public static void main(String[] args) {
    List<String[]> data = getData();
    printResult(data);
  }

  private static List<String[]> getData() {
    Scanner sc = new Scanner(System.in);
    List<String[]> data = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      String input = sc.nextLine();
      String[] parts = input.split(" ");

      String message = parts[0];
      String number = formatValue(parts[1]);

      data.add(new String[]{message, number});
    }
    sc.close();
    return data;
  }

  private static String formatValue(String number) {
    while (number.length() < 3) {
      number = "0" + number;
    }
    return number;
  }

  private static void printResult(List<String[]> data) {
    System.out.println("================================");
    for (String[] info : data) {

      String message = info[0];
      String number = info[1];

      // Calcula los espacios faltantes
      int spaces = 15 - message.length();
      if (spaces < 0) spaces = 0;

      System.out.print(message);
      for (int i = 0; i < spaces; i++) {
        System.out.print(" ");
      }
      System.out.println(number);
    }
    System.out.println("================================");
  }

}
