package edu.northeastern.lakshya;

import java.util.Stack;

class MinStack {
  Stack<Integer> userStack = null;
  Stack<Integer> minStack = null;
  /** initialize your data structure here. */
  public MinStack() {
    userStack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int x) {
    int min = x;
    if(!minStack.isEmpty())
      min = Math.min(min,  minStack.peek());
    minStack.push(min);
    userStack.push(x);
  }

  public void pop() {
    userStack.pop();
    minStack.pop();
  }

  public int top() {
    return userStack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}