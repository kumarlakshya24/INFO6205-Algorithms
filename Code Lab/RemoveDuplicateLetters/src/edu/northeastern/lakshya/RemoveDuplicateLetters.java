package edu.northeastern.lakshya;

public class RemoveDuplicateLetters {
  public String removeDuplicateLetters(String s) {
    int distinct = 0;
    int[] count = new int[26];
    boolean[] used = new boolean[26];
    char[] array = s.toCharArray();
    for (char c : array) {
      if (count[c - 'a'] == 0) {
        distinct++;
      }
      count[c - 'a']++;
    }

    char[] result = new char[distinct];
    int i = 0;
    for (char c : array) {
      count[c - 'a']--;
      if (used[c - 'a']) {
        continue;
      } else {
        while (i > 0 && result[i - 1] > c && count[result[i - 1] - 'a'] > 0) {
          used[result[i - 1] - 'a'] = false;
          i--;
        }
        result[i++] = c;
        used[c - 'a'] = true;
      }
    }

    return String.valueOf(result);
  }
}