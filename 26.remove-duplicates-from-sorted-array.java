/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int lastNum = -200;
        int i = 0;
        for(int num : nums) {
            if(lastNum != num) {    
                nums[i] = num;
                i++;
                lastNum = num;
                continue;
            }
        }
        return i;
    }
}
// @lc code=end

