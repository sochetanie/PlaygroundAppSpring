package com.example.demo;

public class MathService {
  static final double PI = 3.141592653589793;

  public String getCalculate(String operation, int x, int y) {
    String result;
    float z;

      switch (operation) {
        case "add":
          z = x+y;
          break;
        case "multiply":
          z = x*y;
          break;
        case "subtract":
          z = x-y;
          break;
        case "divide":
          z = x/y;
          break;
        default:
          z = x+y;
      }


      if(z == (long) z) result = String.format("%d",(long) z);
      else  result = String.format("%s",z);


      return result;

  }


}
