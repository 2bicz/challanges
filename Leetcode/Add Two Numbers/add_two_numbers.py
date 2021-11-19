# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: [ListNode], l2: [ListNode]) -> [ListNode]:
        len1 = 0
        len2 = 0
        list1 = []
        list2 = []
        result = []
        item_cur1 = l1.first
        item_cur2 = l2.first

        while item_cur1 is not None:
            len1 += 1
            list1.append(item_cur1)
        while item_cur2 is not None:
            len2 += 1
            list2.append(item_cur2)
        print(len1)
        print(len2)
        if len1 == len2:
            for i in range(len1):
                result.append(list1[i] + list2[i])
        return result
