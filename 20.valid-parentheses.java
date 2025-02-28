/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> open = new Stack<>();
        Map<Character, Character> matching = Map.of(
            '}', '{',
            ']', '[',
            ')', '('
        );
        for(char c : s.toCharArray()) {
            Character match = matching.get(c);
            if(match != null) {
                if(open.isEmpty() || !open.pop().equals(match)) return false;
            }else {
                open.add(c);
            }
        }
        return open.isEmpty();
    }
}
// @lc code=end

