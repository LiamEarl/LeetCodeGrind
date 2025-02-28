/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start

import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, current = null;
        BigInteger num = new BigInteger("0");
        BigInteger pow10 = new BigInteger("1");
        while((l1 != null) || (l2 != null) || (num.subtract(pow10).signum() >= 0)) {
            if(l1 != null) {
                num = num.add(pow10.multiply(new BigInteger(String.valueOf(l1.val))));
                l1 = l1.next; 
            }
            if(l2 != null) {
                num = num.add(pow10.multiply(new BigInteger(String.valueOf(l2.val))));
                l2 = l2.next; 
            }
            System.out.println("POW10: " + pow10.toString() + " " + num.toString());
            int digit = num.divide(pow10).mod(new BigInteger("10")).intValue();
            

            if(head == null) {
                head = new ListNode(digit);
                current = head;
            }else {
                current.next = new ListNode(digit);
                current = current.next;
            }            
            pow10 = pow10.multiply(new BigInteger("10"));
        }   
        return head;
    }
}
// @lc code=end

