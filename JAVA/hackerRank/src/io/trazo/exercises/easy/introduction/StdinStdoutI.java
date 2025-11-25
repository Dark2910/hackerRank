package io.trazo.exercises.easy.introduction;

import java.util.Scanner;

public class StdinStdoutI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();

    scanner.close();

    System.out.print(n1 + "\n" + n2 + "\n" + n3);

  }
}
