package com.example.demo;

import java.util.List;

public class MathService {

  public String showPI() {
    final double PI = 3.141592653589793;
    return String.format("%.15f", PI);
  }

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

  public String multipleNumSum(List<Integer> nums) {
    return String.format("%s",(nums.stream().mapToInt(i -> i.intValue()).sum()));
  }


  public String volume(int x, int y, int z) {
    return String.format("%s", (x*y*z));
  }


}
