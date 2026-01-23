package javaPrograms.leetcodeJavaPractice;
// java practice

class Solution {
    public int largestAltitude(int[] gain) {
        //-5,1,5,0,-7
    int sum =0;
        int res = 0;
    for (int i = 0; i < gain.length; i++) {
        sum = sum + gain[i];  // Add current gain
        res = Math.max(res, sum);
    }
    return res;
    }
}