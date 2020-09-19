package edu.northeastern.lakshya;

import java.util.HashMap;
public class TwoSums {
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 13;
    int[] result = twoSum(nums, target);
    System.out.println("Indices:");
    for (int value : result) {
      System.out.println(value);
    }
  }

  private static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++)
      map.put(nums[i], i);
    for (int i = 0; i < nums.length; i++) {
      int otherNumber = target - nums[i];
      if (map.containsKey(otherNumber) && map.get(otherNumber) != i)
        return new int[] {i, map.get(otherNumber)};
    }
    return new int[]{};
  }
}


