class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        for i in range(k):
            removed_element = nums.pop(len(nums)-1)
            nums.insert(0, removed_element)
