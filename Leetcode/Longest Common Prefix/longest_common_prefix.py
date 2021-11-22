class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        prefix = strs[0]
        for i in range(1, len(strs)):
            while strs[i].find(prefix):
                prefix = prefix[0: len(prefix) - 1]
                if prefix is None: return ""
        return prefix
