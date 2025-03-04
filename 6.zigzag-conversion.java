/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        char[] output = new char[s.length()];
        int mappedIndex = 0;
        int currentRow = 1;
        int offsetToNext = numRows + (numRows - 2);
        for(int i = 0; i < s.length(); i++) {
            output[mappedIndex] = s.charAt(i);  
            if(mappedIndex + offsetToNext >= output.length) {
                currentRow ++;
                mappedIndex = currentRow;
            }else {
                mappedIndex += offsetToNext;
            }
        }
        return new String(output);
    }
}
// @lc code=end

