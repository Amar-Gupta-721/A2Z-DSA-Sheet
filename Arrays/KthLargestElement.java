package Arrays;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {
        
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest1(arr, k));
        System.out.println(findKthLargest2(arr, k));
    }

    // Priority Queue Method 
    public static int findKthLargest1(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
            System.out.println(pq);
        }
        for(int i=k; i<arr.length; i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
            System.out.println(pq);
        }
        return pq.peek();
    }


    // Quick Select Method
    public static int findKthLargest2(int[] nums, int k) {
        return sort(nums, 0, nums.length-1, nums.length-k);
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