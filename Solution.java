package javaPrograms;

import java.util.Arrays;

public class Solution {

    // Two-pointer shuffle method
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        int i = 0;      // pointer for x-part
        int j = n;      // pointer for y-part
        int k = 0;      // pointer for result array

        while (j < 2 * n) {
            result[k++] = nums[i++];
            result[k++] = nums[j++];
        }

        return result;
    }

    // Main method (program execution starts here)
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        int[] output = sol.shuffle(nums, n);

        System.out.println(Arrays.toString(output));
    }
}
