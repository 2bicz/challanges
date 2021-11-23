class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        shot = left + (right - left) // 2
        while left <= right:
            if nums[shot] == target:
                return shot
            elif nums[shot] < target:
                left = shot + 1
            elif nums[shot] > target:
                right = shot - 1
            shot = left + (right - left) // 2
        if left > right:
            return left
        return -1
