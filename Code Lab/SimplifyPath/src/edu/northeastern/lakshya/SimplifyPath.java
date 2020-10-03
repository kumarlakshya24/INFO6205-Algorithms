package edu.northeastern.lakshya;

import java.util.Stack;

public class SimplifyPath {
  public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    String[] vals = path.split("/");

    for(String v : vals) {
      if (v.equals("..") && !stack.isEmpty()) {
        stack.pop();
      } else if (!v.equals(".") && !v.equals("..") && !vals.equals("")) {
        stack.push(v);
      }
    }
    return String.join("/", stack);
  }
}