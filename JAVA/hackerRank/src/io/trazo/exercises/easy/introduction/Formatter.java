package io.trazo.exercises.easy.introduction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
  public static void main(String[] args) {
    Double amount = Double.parseDouble(getData());

    Locale india = new Locale("en", "IN");

    Locale[] types = {Locale.US, india, Locale.CHINA, Locale.FRANCE};
    String[] message = {"US: %s \n", "India: %s \n", "China: %s \n", "France: %s \n"};

    for(int i = 0; i < message.length; i++){
      NumberFormat nf = NumberFormat.getCurrencyInstance(types[i]);
      nf.setMinimumFractionDigits(2);
      nf.setMaximumFractionDigits(2);
      String amountFormatted = nf.format(amount);
      System.out.printf(message[i], amountFormatted);
    }
  }

  private static String getData(){
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String amout = "";
    try{
      amout = bufferedReader.readLine();
    }catch (IOException e){
      System.out.printf("Error al obtener dato: %s", e);
    }
    return amout;
  }

}
