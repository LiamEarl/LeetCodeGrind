/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int last = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }else if(nums[i] > target) {
                return i;
            }else {
                last = 
            }
        }
    }
}
// @lc code=end

