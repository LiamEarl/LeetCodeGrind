/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int num : nums) {
            if(num == val) continue;
            nums[i] = num;
            i++; 
        }
        return i;
    }
}
// @lc code=end

