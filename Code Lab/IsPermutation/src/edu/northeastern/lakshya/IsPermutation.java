package edu.northeastern.lakshya;

import java.util.Arrays;

public class IsPermutation {
  public static void main(String[] args) {
    int[] twoSumsArray = {1, 3, 4, 2, 6, 5, 8, 7};
    System.out.println(TwoSums(twoSumsArray, 10));
  }

  private static int[] TwoSums(int[] nums, int target) {
    Arrays.sort(nums);
    int leftIndex = 0;
    int rightIndex = nums.length - 1;
    while (leftIndex < rightIndex) {
      if (nums.length == 0) {
        return nums;
      }
      if (nums[leftIndex] + nums[rightIndex] > target) {
        leftIndex++;
      } else {
        rightIndex--;
      }
      if (nums[leftIndex] + nums[rightIndex] == target) {
        return new int[]{nums[leftIndex], nums[rightIndex]};
      }
    }
    return new int[]{};
  }
}
