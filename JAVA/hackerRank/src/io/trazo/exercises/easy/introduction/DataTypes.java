//package io.trazo.exercises.easy.introduction;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//import java.util.stream.IntStream;
//
//public class DataTypes {
//
//  //**
//  // DataTypes
//  // char, int, long, short, float, double, boolean, byte
//  //
//  // A byte is an 8-bit signed integer.
//  // A short is a 16-bit signed integer.
//  // An int is a 32-bit signed integer.
//  // A long is a 64-bit signed integer.
//  //
//  // *//
//
//  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//    int inputLoops = Integer.parseInt(bufferedReader.readLine());
////    List<String[]> data = new ArrayList<>();
//
////    for (int i = inputLoops; i > 0; i--) {
////      data.addAll(getData(bufferedReader));
////    }
//
////    List<String[]> data = (List<String[]>) Arrays.stream(bufferedReader.readLine().split(" "))
////            .toList();
//
//    List<String[]> data = IntStream.range(0, inputLoops)
//            .mapToObj(i -> {
//                try {
//                  return bufferedReader.readLine();
//                } catch (IOException e) {
//                  System.out.printf("Error getting data: %s", e);
//                  return new String[0];
//                }
//              })
//            .toList();
//
//    for(var x : data){
//      System.out.println(Arrays.toString(x));
//    }
//
//  }
//
//}
