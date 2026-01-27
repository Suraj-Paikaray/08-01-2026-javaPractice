package javaPrograms.leetcodeJavaPractice;

public class LeetcodeQ1295 {
    class Solution {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static int digit(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = -num;
        }
        return (int)(Math.log10(num)) + 1;
    }

    static boolean even(int num) {
        int numberOfDigits = digit(num);
        return numberOfDigits % 2 == 0;
    }
}

    
}
