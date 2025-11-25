package io.trazo.exercises.easy.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsI {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int value = Integer.parseInt(bufferedReader.readLine().trim());
    int result = 0;

    for (int i = 1; i <= 10; i++) {
      result = value * i;
      System.out.printf("%s x %s = %s\n", value, i, result);
    }
  }
}
