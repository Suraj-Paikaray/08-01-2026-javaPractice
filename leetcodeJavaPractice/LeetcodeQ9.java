package javaPrograms.leetcodeJavaPractice;

public class LeetcodeQ9 {

    class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int max = 0;
        while(x > 0){
            int reminder = x % 10;
            max = max * 10 + reminder;
            x = x / 10;
        }
        return (max == temp );
            
    
        
    }
}
    
}
