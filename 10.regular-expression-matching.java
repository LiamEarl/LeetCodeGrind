/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isMatch(String s, String p) {
        if(s.equals(p)) return true;
        boolean[] matchingChars = new boolean[s.length()];
        for(int i = 0; i < p.length(); i++) {
            if(s.charAt(i) == p.charAt(i)) matchingChars[i] = true;
            else if(p.charAt(i) == '.') matchingChars[i] = true;
            else if(p.charAt(i) == '*') {
                for(int j = i; j < s.length(); j++) {
                    matchingChars[i] = true;
                }
                break;
            } else return false;
            
        }
        for(int i = 0; i < matchingChars.length; i++) {
            if(!matchingChars[i]) return false;
        }
        return true;
    }
}
// @lc code=end

