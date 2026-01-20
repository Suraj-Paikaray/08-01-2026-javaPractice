package javaPrograms.leetcodeJavaPractice;

    import java.util.ArrayList;
import java.util.List;

class Solution { // <--- You need this "Container"
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        // 1. Find the current Champion (the max)
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }

        // 2. Create the result list
        List<Boolean> result = new ArrayList<>();

        // 3. The "What If" test
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}

