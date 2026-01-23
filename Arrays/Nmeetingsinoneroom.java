package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Nmeetingsinoneroom {
    public static void main(String[] args) {
        int[] start = {25,0,14,24,18,3,17};
        int[] end = {29,25,24,26,25,23,18};
        System.out.println(maxMeetings(start, end));
    }

    public static int maxMeetings(int start[], int end[]) {
        
        // add your code here
        List<int[]> temp = new ArrayList<>();
        for(int i=0; i<end.length; i++){
            temp.add(new int[]{start[i],end[i]});
        }
        Collections.sort(temp, (a,b)->a[1]-b[1]);
        for(int i=0; i<temp.size(); i++){
            System.out.println(Arrays.toString(temp.get(i)));
        }
        int meetings = 1;
        int[] curr = temp.get(0);
        for(int i=1; i<temp.size(); i++){
            if(curr[1]<temp.get(i)[0]){
                meetings++;
                curr[0] = temp.get(i)[0];
                curr[1] = temp.get(i)[1];
            }
        }
        return meetings;
    }
}
