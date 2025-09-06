/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int[] edgecase = new int[digits.length + 1];
        for(int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if(digits[i] == 10) {
                digits[i] = 0;
                if(i == 0) {
                    edgecase[0] = 1;
                    for(int j = 0; j < digits.length; j++) {
                        edgecase[j+1] = digits[j];
                    }
                    return edgecase;
                }
                carry = 1;
                continue;
            }
            carry = 0;
        }
        return digits;
    }
}
// @lc code=end

