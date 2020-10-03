package edu.northeastern.lakshya;

public class MinimumAddtoMakeParenthesesValid {
  public int minAddToMakeValid(String S) {
    if(S == null || S.length() == 0) {
      return 0;
    }
    int open = 0;
    int count = 0;
    for (char c : S.toCharArray()) {
      if(c == '(') {
        open++;
      }
      else if (--open < 0) {
        open++;
        count++;
      }
    }
   return count + open;
  }
}