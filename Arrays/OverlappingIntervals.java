package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2, 4}, {6, 8}, {9, 10}};
        ArrayList<int[]> ans = mergeOverlap(arr);
        for (int[] is : ans) {
            System.out.println(Arrays.toString(is));
        }
    }

    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(arr, (a,b) -> a[0]-b[0]);
        int curr[] = arr[0];
        for(int i=1; i<arr.length; i++){
            if(curr[1]>=arr[i][0]){
                curr[1] = Math.max(curr[1], arr[i][1]);
            }
            else{
                ans.add(curr);
                curr = arr[i];
            }
        }
        ans.add(curr);
        return ans;
    }
}
