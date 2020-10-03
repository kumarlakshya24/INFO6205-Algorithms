package edu.northeastern.lakshya;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
  public int[] nextGreaterElements(int[] nums) {
  int[] output = new int[nums.length];
  Stack<Integer> stack = new Stack<Integer>();
  Arrays.fill(output, -1);
  for(int i = 0; i < 2 * nums.length; i++)
  {
    while(!stack.isEmpty() && nums[stack.peek()] < nums[i % nums.length])
    {
      output[stack.pop()]=nums[i % nums.length];
    }
    if(i < nums.length) stack.push(i);
  }
  return output;
  }
}

