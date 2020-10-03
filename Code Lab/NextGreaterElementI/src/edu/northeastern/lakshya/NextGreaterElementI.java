package edu.northeastern.lakshya;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
  public int[] nextGreaterElement(int[] findNums, int[] nums) {

    Map<Integer, Integer> mapToIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      mapToIndex.put(nums[i], i);
    }

    int[] result = new int[findNums.length];
    for (int i = 0; i < findNums.length; i++) {
      result[i] = -1;
      int start = mapToIndex.get(findNums[i]);

      for (int j = start + 1; j < nums.length; j++) {
        if (nums[j] > findNums[i]) {
          result[i] = nums[j];
          break;
        }
      }
    }

    return result;
  }
}

