package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        System.out.println(kthSmallest1(arr, k));
        System.out.println(kthSmallest2(arr, k));
    }

    // Priority Queue Method
     public static int kthSmallest1(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        
        for(int i=k; i<arr.length; i++){
            if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    // Quik Select Method 
    public static int kthSmallest2(int[] arr, int k) {
        // Code here
        return sort(arr, 0, arr.length-1, k-1);
    }
    
    public static int sort(int[] arr, int s, int e, int k) {
        int pidx = partition(arr, s, e);
        if (s <= e) {
            if (pidx < k) {
               return sort(arr, pidx + 1, e, k);
            } else if (pidx > k) {
                return sort(arr, s, pidx - 1, k);
            } else
                return arr[pidx];
        }
        return -1;
    }

    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;
        return i;
    }
}