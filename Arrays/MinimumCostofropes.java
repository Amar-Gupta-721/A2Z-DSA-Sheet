package Arrays;
import java.util.PriorityQueue;

public class MinimumCostofropes {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 6, 9};
        System.out.println(minCost(arr));
    }

    public static int minCost(int[] arr) {
        // code here
        if(arr.length==1)return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int cost = 0;
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int rope1 = pq.poll();
            int rope2 = pq.poll();
            int currCost = rope1 + rope2;
            cost = cost + currCost;
            pq.add(currCost);
        }
        return cost;
    }
}
