package Backtracking;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }

    public static void helper(int[] nums, boolean[] marked, List<List<Integer>> ans, List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(curr);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!marked[i]){
                marked[i] = true;
                curr.add(nums[i]);
                helper(nums, marked, ans, new ArrayList<>(curr));
                marked[i] = false;
                curr.remove(curr.size()-1);
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, new boolean[nums.length], ans, new ArrayList<>());
        return ans;
    }
}
