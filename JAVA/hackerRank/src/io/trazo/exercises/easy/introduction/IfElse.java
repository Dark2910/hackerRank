package io.trazo.exercises.easy.introduction;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args){
    // even -> par
    // odd -> impar

    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();
    int remainder = number % 2;

    if(remainder == 0){
      // even
      if(number >= 2 && number <= 5){
        System.out.print("Not Weird");
      }
      if(number >= 6 && number <= 20){
        System.out.print("Weird");
      }
      if(number > 20){
        System.out.print("Not Weird");
      }
    }else {
      // odd
      System.out.print("Weird");
    }
    scanner.close();
  }
}
