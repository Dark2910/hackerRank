package io.trazo.exercises.easy.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LoopsII {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int inputLoops = Integer.parseInt(bufferedReader.readLine());
//    List<Integer[]> data = new ArrayList<>();
//
//    for (int i = inputLoops; i > 0; i--) {
//      data.addAll(getData(bufferedReader));
//    }

//    List<Integer[]> data = IntStream.range(0, inputLoops)
//            .mapToObj(i -> {
//              try {
//                return getData(bufferedReader);
//              } catch (IOException e) {
//                throw new RuntimeException(e);
//              }
//            })
//            .flatMap(List::stream)
//            .toList();

    List<Integer[]> data = IntStream.range(0, inputLoops)
            .mapToObj(i -> {
              try {
                return Arrays.stream(bufferedReader.readLine().split(" "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
              } catch (Exception e) {
                return new Integer[0];
              }
            }).toList();

    printData(data);
  }

  private static void printData(List<Integer[]> data) {
    for (Integer[] info : data) {
      int a = info[0];
      int b = info[1];
      int n = info[2];

      for (int i = 0; i < n; i++) {
        a = (int) (a + (Math.pow(2, i)) * b);
        System.out.printf("%s ", a);
      }
      System.out.print("\n");
    }
  }

  private static List<Integer[]> getData(BufferedReader bufferedReader) throws IOException {
    String input = bufferedReader.readLine();

    Integer[] data = Arrays.stream(input.split("\s"))
            .map(Integer::parseInt)
            .toArray(Integer[]::new);

    return Collections.singletonList(data);
  }

}
