package edu.northeastern.lakshya;

class Pattern {
  public boolean pattern132(int[] nums) {
    if(nums == null || nums.length < 3) {
      return false;
    }

    for(int i = 0; i < nums.length - 2; i++) {
      int largerNumber = nums[i];
      for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] <= nums[i]) {
          continue;
        }
        if(nums[j] >= largerNumber) {
          largerNumber = nums[j];
        }
        else {
          return true;
        }
      }
    }
    return false;
  }
}