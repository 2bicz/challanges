class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int shoot = nums.length / 2;
        while(left <= right){
            if(target == nums[shoot]) return shoot;
            else if(target < nums[shoot]) right = shoot - 1;
            else if(target > nums[shoot]) left = shoot + 1;
            shoot = (left + right) / 2;
        }
        return -1;
    }
}