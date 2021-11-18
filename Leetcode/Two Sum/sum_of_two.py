def sum_of_two(nums, target):
    if nums is not []:
        for i in range(len(nums)):
            for x in range(len(nums)):
                if nums[i] + nums[x] == target and i != x:
                    return [i, x]
    return None
