package com.csc;

import java.util.Arrays;

public class Calculator {
  public int maximumUsingForLoop(int[] nums) {
    if (nums == null || nums.length == 0) { return 0; }
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    return max;
  }
  public int minimumUsingForLoop(int[] nums) {
  if (nums == null || nums.length == 0) { return 0; }
  int min = nums[0];
  for (int i = 1; i < nums.length; i++) {
    if (min > nums[i]) {
      min = nums[i]; }
  }
  return min;
  }
  public int sumUsingForLoop(int[] nums) {
  if (nums == null || nums.length == 0) { return 0; }
  int sum = 0;
      for (int num : nums) {
          sum += num;
      }
  return sum;
  }
  public double averageUsingForLoop(int[] nums) {
    if (nums == null || nums.length == 0) { return 0; }
    int sum = 0;
      for (int num : nums) {
          sum += num;
      }
      return (double) sum / nums.length;
  }

  public int maximumUsingStream(int[] nums) {
  if (nums == null || nums.length == 0) { return 0; }
  return Arrays.stream(nums).max().getAsInt();
  }
  public int minimumUsingStream(int[] nums) {
  if (nums == null || nums.length == 0) { return 0; }
  return Arrays.stream(nums).min().getAsInt();
  }
  public int sumUsingStream(int[] nums) {
  if (nums == null || nums.length == 0) { return 0; }
  return Arrays.stream(nums).sum();
  }
  public double averageUsingStream(int[] nums) {
  if (nums == null || nums.length == 0) { return 0; }
  return Arrays.stream(nums).average().getAsDouble();
  }
  int[] filterEven(int[] nums){
    int[] even = Arrays.stream(nums).filter(x -> x % 2 == 0).toArray();
    return even;
  }
  public static void main(String[] args) {
    System.out.println("This class can house your driver program and / or your functions.");
  }
}
