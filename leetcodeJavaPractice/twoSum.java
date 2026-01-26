package javaPrograms.leetcodeJavaPractice;

public class twoSum {
    public int[] twoSum1(int[] nums, int target) {
        // First loop picks the first number
        for (int i = 0; i < nums.length; i++) {
            // Second loop picks a different number to add to it
            // We start 'j' at 'i + 1' so we don't use the same element twice
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Found them! Return their indices
                }
            }
        }
        return new int[] {}; // Should not happen based on problem constraints
    }
}  
    

