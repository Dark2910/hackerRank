package com.eespindola.hackerrank.exercises.easy.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndOfFile {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String line;
    int lineNumber = 0;

    while ((line = bufferedReader.readLine()) != null){
      lineNumber ++;
      System.out.printf("%s %s\n",lineNumber,line);
    }

  }
}
