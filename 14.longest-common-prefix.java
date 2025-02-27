/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder prefix = new StringBuilder("");
        mainLoop:
        for(int i = 0; i < 200; i++) {
            if(i >= strs[0].length()) break;
            char thisChar = strs[0].charAt(i);
            for(String str : strs) {
                if(i >= str.length()) break mainLoop;
                if(str.charAt(i) != thisChar) break mainLoop;
            }
            prefix.append(thisChar);
        }
        return prefix.toString();
    }
}
// @lc code=end

