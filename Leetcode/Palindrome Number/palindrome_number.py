class Solution:
    def is_palindrome(self, x: int) -> bool:
        x = 121
        str_x = str(x)
        length = len(str_x)
        from_left = ""
        from_right = ""

        for char in str_x:
            from_left += char
        for i in range(length - 1, -1, -1):
            from_right += str_x[i]

        print(from_left)
        print(from_right)

        if from_left == from_right:
            return True
        return False

