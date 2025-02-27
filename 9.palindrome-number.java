/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String strNum = String.valueOf(x);
        for(int i = 0; i < strNum.length(); i++) {
            if(strNum.charAt(i) != strNum.charAt(strNum.length() - 1 - i)) return false;
        }
        return true;
    }
}
// @lc code=end

