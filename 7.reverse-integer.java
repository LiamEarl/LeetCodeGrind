/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int factor = 1;
        int[] max = {2, 1, 4, 7, 4, 8, 3, 6, 4, 7};
        
        if(x < 0) {
            x = Math.abs(x);
            factor = -1;
            max[9] = 8;
        }
        
        int digitCount = (int) (Math.log10(x) + 1);
        
        if(digitCount == 10) {
            int temp = x;
            
            for(int i = 0; i < 10; i ++) {
                int rightMostDigit = temp % 10;
                if(rightMostDigit % 10 > max[i]) return 0;
                if(rightMostDigit % 10 < max[i]) break;
                temp -= rightMostDigit;
                temp /= 10;
            }
        }
        
        int reversedNum = 0;
        int multiple = (int) Math.pow(10, digitCount - 1);
        while(x != 0) {
            int rightMostDigit = (x % 10); 
            int val = rightMostDigit * multiple;
            reversedNum += val;
            x -= rightMostDigit;
            digitCount--;
            multiple /= 10;
            x /= 10;
        }
        
        return factor * reversedNum;
    }
}
// @lc code=end

