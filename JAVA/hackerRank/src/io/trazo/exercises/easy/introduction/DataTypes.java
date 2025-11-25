package io.trazo.exercises.easy.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

//**
// DataTypes
// char, int, long, short, float, double, boolean, byte
//
// A byte is an 8-bit signed integer.
// A short is a 16-bit signed integer.
// An int is a 32-bit signed integer.
// A long is a 64-bit signed integer.
// *//

public class DataTypes {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int inputLoops = Integer.parseInt(bufferedReader.readLine());

    String[] data = IntStream.range(0, inputLoops)
            .mapToObj(i -> {
              try {
                return bufferedReader.readLine();
              } catch (IOException e) {
                return null;
              }
            })
            .toArray(String[]::new);

    for (String x : data) {
      try{
        Long y = Long.parseLong(x);
        System.out.println(y + " can be fitted in:");
        if(y >= Byte.MIN_VALUE && y <= Byte.MAX_VALUE){
          System.out.println("* byte");
        }
        if(y >= Short.MIN_VALUE && y <= Short.MAX_VALUE){
          System.out.println("* short");
        }
        if(y >= Integer.MIN_VALUE && y <= Integer.MAX_VALUE){
          System.out.println("* int");
        }
        System.out.println("* long");
      }catch (Exception e){
        System.out.println(x + " can't be fitted anywhere.");
      }
    }
  }
}
