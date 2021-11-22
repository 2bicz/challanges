class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        shoot = len(nums) // 2
        while left <= right:
            if target == nums[shoot]:
                return shoot
            if target < nums[shoot]:
                right = shoot - 1
            elif target > nums[shoot]:
                left = shoot + 1
            shoot = (left + right) // 2
        return -1