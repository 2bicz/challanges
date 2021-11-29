package pl.patryktubicz;

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length != 1) {
            Arrays.sort(nums);
            int zeros = 0, z = 0;
            while(nums[z] == 0 && z < nums.length) {
                zeros++;
                z++;
            }
            for(int i = zeros, x = 0; x <= zeros; i++, x++) {
                nums[i - zeros] = nums[i];
            }
            for(int i = nums.length - zeros; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
