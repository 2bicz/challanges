package pl.patryktubicz;

import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int greatestSum = 0;

        for (int[] account : accounts) {
            int midSum = 0;
            for (int i : account) {
                midSum += i;
            }
            if (midSum > greatestSum)
                greatestSum = midSum;
        }
        return greatestSum;
    }
}
