package pl.patryktubicz;

import java.util.Arrays;

public class TwoSum {
    private static int[] sum_of_two(int[] nums, int target) {
        if(nums.length != 0) {
            for(int i = 0; i < nums.length; i++) {
                for(int x = 0; x < nums.length; x++) {
                    if(nums[i] + nums[x] == target && i != x) {
                        return new int[] {i, x};
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int goal = 9;

        System.out.println(Arrays.toString(sum_of_two(numbers, goal)));
    }
}
