package edu.northeastern.lakshya;
import java.util.HashSet;
import java.util.Set;

public class AllUnique {
  public static void main(String[] args) {
    String str1 = "aabbccddeerr"; //false
    String str2 = "qwerty"; //true
    String str3 = ""; //true because string is null/empty
    System.out.println(checkAllUnique(str1));
    System.out.println(checkAllUnique(str2));
    System.out.println(checkAllUnique(str3));
  }

  private static boolean checkAllUnique(String str) {
    Set<Character> charSet = new HashSet<>();
    for(char c: str.toCharArray()) {
      if(charSet.contains(c)) {
        return false;
      }
      charSet.add(c);
    }
    return true;
  }
}

