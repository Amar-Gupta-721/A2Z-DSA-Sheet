package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopinCandyStore {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4};
        int k = 2;
        System.out.println(minMaxCandy(arr, k));
    }

    public static ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        int min = 0;
        int max = 0;
        int idx = 0;
        int n = prices.length-1;
        while(idx<=n){
            min = min + prices[idx++];
            n = n - k;
        }
        n = prices.length-1;
        idx = 0;
        while(idx<=n){
            max = max + prices[n--];
            idx = idx + k;
        }
        return new ArrayList<>(List.of(min, max));
    }
}
