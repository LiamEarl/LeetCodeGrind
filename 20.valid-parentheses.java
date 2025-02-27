/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Map;

class Solution {
    class WrapInt {
        int value;
        WrapInt(int value) {this.value = value;}
    }

    Map<Character, Integer> justValues = Map.of(
        '(', -1,
        '{', -1,
        '[', -1,
        ')', 1,
        '}', 1,
        ']', 1
    );

    Map<Character, Character> matching = Map.of(
        '}', '{',
        ')', '(',
        ']', '[' 
    );

    public boolean isValid(String s) {
        boolean firstPass = checkDebts(s);
        if(!firstPass) return false;
        mainLoop:
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int result = justValues.get(c);
            if(result > 0) {
                String sub = "";
                for(int j = i; j >= 0; j--) {
                    if(matching.get(c) == s.charAt(j)) {
                        sub = s.substring(j + 1, i);
                        if(sub == "") continue mainLoop;
                        if(!checkDebts(sub)) return false;
                        break;
                    }
                }
            }
        }
        return true;
    }

    private boolean checkDebts(String s) {
        WrapInt paraDebt = new WrapInt(0);
        WrapInt curlyDebt = new WrapInt(0);
        WrapInt squareDebt = new WrapInt(0);
        Map<Character, WrapInt[]> values = Map.of(
            '(', new WrapInt[] {new WrapInt(-1), paraDebt},
            '{', new WrapInt[] {new WrapInt(-1), curlyDebt},
            '[', new WrapInt[] {new WrapInt(-1), squareDebt},
            ')', new WrapInt[] {new WrapInt(1), paraDebt},
            '}', new WrapInt[] {new WrapInt(1), curlyDebt},
            ']', new WrapInt[] {new WrapInt(1), squareDebt}
        );
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            WrapInt[] result = values.get(c);
            if(result == null) continue;
            if(result[0].value > 0 && result[1].value >= 0) return false;
            result[1].value += result[0].value;
        }

        return (paraDebt.value == 0 && squareDebt.value == 0 && curlyDebt.value == 0);
    }
}
// @lc code=end

