package com.eespindola.hackerrank.exercises.easy.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaticInitializerBlock {

  private static int b;
  private static int h;
  private static boolean flag;

  static {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    try {
      b = Integer.parseInt(bufferedReader.readLine());
      h = Integer.parseInt(bufferedReader.readLine());
      if(b <= 0 || h <= 0){
        System.out.printf("java.lang.Exception: Breadth and height must be positive");
        flag = false;
      }else{
        flag = true;
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    if(flag){
      int area = b * h;
      System.out.print(area);
    }
  }
}
