# The isBadVersion API is already defined for you.
# @param version, an integer
# @return an integer
# def isBadVersion(version):

class Solution:
    def firstBadVersion(self, n):
        left, right = 1, n
        shot = n // 2
        while left <= right:
            if isBadVersion(shot) is False:
                left = shot + 1
            elif isBadVersion(shot) is True:
                if isBadVersion(shot - 1) is False:
                    return shot
                right = shot - 1
            shot = (left + right) // 2
        return -1
