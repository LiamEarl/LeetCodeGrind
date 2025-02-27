/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        ); 
        int value = 0;
        for(int i = 0; i < s.length(); i++) {
            int thisVal = map.get(s.charAt(i));
            if(i < s.length() - 1) {
                int nextVal = map.get(s.charAt(i+1));
                if(nextVal - thisVal > 0) {
                    thisVal *= -1;
                }
            }
            value += thisVal;
        }
        return value;
    }
}
// @lc code=end

