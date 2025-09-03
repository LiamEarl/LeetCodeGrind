/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        if(target < nums[0]) return 0;
        if(target > nums[nums.length - 1]) return nums.length;
        int leftBound = 0, rightBound = nums.length - 1;
        return searchRecursive(nums, target, leftBound, rightBound);
    }
    public int searchRecursive(int[] nums, int target, int leftBound, int rightBound) {
        int i = leftBound + ((rightBound - leftBound) / 2);
        if(nums[i] == target) {
            return i;
        }else if(leftBound + 1 == rightBound) {
            return rightBound;
        }else if(nums[i] < target) {
            leftBound = i;
        }else {
            rightBound = i;
        }
        return searchRecursive(nums, target, leftBound, rightBound);
    }
}
// @lc code=end

