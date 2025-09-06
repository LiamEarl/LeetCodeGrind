/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;
        List<Character> currentSubstring = new ArrayList<>();
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            for(int j = 0; j < currentSubstring.size(); j++) {
                if(charArr[i] == currentSubstring.get(j)) {
                    longestSubstring = Math.max(longestSubstring, currentSubstring.size());
                    currentSubstring = currentSubstring.subList(j+1, currentSubstring.size());
                } 
            }
            currentSubstring.add(charArr[i]);
        }
        longestSubstring = Math.max(longestSubstring, currentSubstring.size());
        return longestSubstring;
    }
}
// @lc code=end

