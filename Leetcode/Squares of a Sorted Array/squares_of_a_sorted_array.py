class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        result = []
        for num in nums:
            result.append(pow(num, 2))
        return sorted(result)
