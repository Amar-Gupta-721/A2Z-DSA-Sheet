package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }

    public static void helper(int[] nums, int idx, List<List<Integer>> ans, List<Integer> curr){
        if(idx==nums.length){
            ans.add(curr);
            return;
        }
        helper(nums, idx+1, ans, new ArrayList<>(curr));
        curr.add(nums[idx]);
        helper(nums, idx+1, ans, new ArrayList<>(curr));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans, new ArrayList<>());
        return ans;
    }
}
