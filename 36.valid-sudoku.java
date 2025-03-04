/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i ++) {
            if(!isLineValid(board, i, true)) return false;        
            if(!isLineValid(board, i, false)) return false;
    
            for(int j = 0; j < 9; j += 3) {
                if(i % 3 != 0) continue; 
                if(!is3x3Valid(board, i, j)) return false;
            }
        }
        return true;
    }
    public boolean isLineValid(char[][] board, int loc, boolean vertical) {
        HashMap<Character, Boolean> numbers = new HashMap<>();
        
        for(int i = 0; i < 9; i++) {
            char gridSpace = vertical ? board[i][loc] : board[loc][i];
            if(gridSpace == '.') continue;
            if(numbers.containsKey(gridSpace)) return false;
            numbers.put(gridSpace, true);
        }
        return true;
    }

    public boolean is3x3Valid(char[][] board, int xLoc, int yLoc) {
        HashMap<Character, Boolean> numbers = new HashMap<>();
        for(int i = yLoc; i < yLoc + 3; i++) {
            for(int j = xLoc; j < xLoc + 3; j++) {
                char gridSpace = board[i][j];
                if(gridSpace == '.') continue;
                if(numbers.containsKey(gridSpace)) return false;
                numbers.put(gridSpace, true);
            }
        }
        return true;
    }
}
// @lc code=end

