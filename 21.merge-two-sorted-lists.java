/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = null;
        ListNode newCurrent = null;
        while ((list1 != null) || (list2 != null)) {
            int nextNodeValue = 0;
            int value1 = 1000;
            int value2 = 1000;

            if(list1 != null) value1 = list1.val;
            if(list2 != null) value2 = list2.val;
            
            if(value1 > value2) {
                list2 = list2.next;
                nextNodeValue = value2;
            }else {
                list1 = list1.next;
                nextNodeValue = value1;
            }

            ListNode newNode = new ListNode(nextNodeValue);
            
            if(newHead == null) {
                newHead = newNode;
                newCurrent = newHead;
                continue;
            }

            newCurrent.next = newNode;
            newCurrent = newCurrent.next;
        }
        return newHead;
    }
}
// @lc code=end

