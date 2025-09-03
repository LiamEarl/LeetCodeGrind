/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        HashSet<Integer> hashCandidates = new HashSet<>();

        for (int candidate : candidates) {
            hashCandidates.add(candidate);
        }
        for(int candidate : candidates) {
            ArrayList<Integer> combo = checkIndividual(candidate, target, hashCandidates);
            if(combo.isEmpty()) continue;
            output.add(combo);
        }
        return output;
    }

    public ArrayList<Integer> checkIndividual(int candidate, int target, HashSet<Integer> hashCandidates) {
        ArrayList<Integer> output = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i + candidate <= target; i+= candidate) {
            output.add(candidate);
            sum += candidate;
        }
        int diff = target - sum;
        for(int cur : hashCandidates) {
            if(cur == diff) {
                output.add(cur);
                sum += cur;
                break;
            }
        }
        if(sum == target) 
            return output;
        return new ArrayList<>();
    }


}
// @lc code=end

