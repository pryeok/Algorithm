package com.eomcs.algorithm.DataStructure;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class stack3 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Stack<Character> stack = new Stack<Character>();
    String input = "";

    String nStr = br.readLine();   // scanner(System.in)
    int n = Integer.parseInt(nStr);

    for (int i = 0; i < n; i++) {
      input = br.readLine();
      input += "\n";
      StringBuilder sb = new StringBuilder("");

      for (int j = 0; j < input.length(); j++) {

        if (input.charAt(j) == ' ' || input.charAt(j) == '\n') {
          while (!stack.isEmpty()) {
            sb.append(stack.peek());
            stack.pop();
          }
          if (input.charAt(j) == ' ') {
            sb.append(input.charAt(j));
          }

        } else {
          stack.push(input.charAt(j));
        }
      }

      bw.write(sb.toString() + "\n");

    }

    br.close();
    bw.flush();
    bw.close();
  }

}