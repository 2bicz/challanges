package pl.patryktubicz;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int shot = left + (right - left) / 2;
        while(left <= right) {
            if(nums[shot] == target) return shot;
            else if(nums[shot] < target) left = shot + 1;
            else if(nums[shot] > target) right = shot - 1;
            shot = left + (right - left) / 2;
        }
        if(left > right) return left;
        return -1;
    }
}
