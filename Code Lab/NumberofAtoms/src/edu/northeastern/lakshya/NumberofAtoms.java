package edu.northeastern.lakshya;

import java.util.*;

public class NumberofAtoms {
  private int i;
  public String countOfAtoms(String formula) {
    StringBuilder ans = new StringBuilder();
    i = 0;
    Map<String, Integer> counts = countRecursive(formula.toCharArray());
    for (String name: counts.keySet()){
      ans.append(name);
      int count = counts.get(name);
      if (count > 1){
        ans.append("" + count);
      }
    }
    return ans.toString();
  }

  private Map<String, Integer> countRecursive(char[] f){
    Map<String, Integer> ans = new TreeMap<String, Integer>();
    while (i != f.length){
      if (f[i] == '('){
        i += 1;
        Map<String, Integer> tmp = countRecursive(f);
        int count = getCount(f);

        for(Map.Entry<String, Integer> entry: tmp.entrySet()){
          ans.put(entry.getKey(), ans.getOrDefault(entry.getKey(), 0) + entry.getValue() * count);
        }
      }
      else if(f[i] == ')'){
        i += 1;
        return ans;
      }
      else{
        String name = getName(f);
        ans.put(name, ans.getOrDefault(name, 0) + getCount(f));
      }
    }
    return ans;
  }

  private String getName(char[] f){
    String name = "" + f[i];
    i += 1;
    while (i < f.length && 'a' <= f[i] && f[i] <= 'z'){
      name += f[i];
      i += 1;
    }
    return name;
  }

  private int getCount(char[] f){
    int count = 0;
    while (i < f.length && '0' <= f[i] && f[i] <='9'){
      count = count * 10 + (f[i] - '0');
      i += 1;
    }
    return count == 0 ? 1: count;
  }
}


