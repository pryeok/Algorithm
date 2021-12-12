package com.eomcs.algorithm.DataStructure;
import java.util.Scanner;


public class stack2 {


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int count = Integer.parseInt(in.nextLine());

    StringBuilder sb = new StringBuilder();

    int N = in.nextInt();


    for(int i = 0; i < count; i++) {

      String str = in.nextLine() + "\n";
      stack st = new stack();

      for (int j=0; j<st.length(); j++) {
        if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
          while (!st.empty()) {
            sb.append(st.pop());
          }
          sb.append(str.charAt(j));
        }
        else { st.add(str.charAt(j));
        }
      }
    }
    System.out.println(sb.toString());
  }
}