package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Unionof2SortedArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5}, b[] = {1, 2, 3, 6, 7};
        System.out.println(findUnion1(a, b));
        System.out.println(findUnion2(a, b));
        System.out.println(findUnion3(a, b));
    }

    //Method 1 : with Set with Sorting
    public static ArrayList<Integer> findUnion1(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
                ans.add(a[i]);
            }
        }
        for(int i=0; i<b.length; i++){
            if(!set.contains(b[i])){
                set.add(b[i]);
                ans.add(b[i]);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    //Method 2 : with Set without Sorting
    public static ArrayList<Integer> findUnion2(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(!set.contains(a[i])){
                    ans.add(a[i]);
                    set.add(a[i]);
                }
                i++;
            }
            else{
                if(!set.contains(b[j])){
                    ans.add(b[j]);
                    set.add(b[j]);
                }
                j++;
            }
        }
        
        for(int k=i; k<a.length; k++){
            if(!set.contains(a[k])){
                set.add(a[k]);
                ans.add(a[k]);
            }
        }
        for(int k=j; k<b.length; k++){
            if(!set.contains(b[k])){
                set.add(b[k]);
                ans.add(b[k]);
            }
        }
        return ans;
    }

    //Method 3 : without Set
     public static ArrayList<Integer> findUnion3(int a[], int b[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=a[i]){
                    ans.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1)!=b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
            else{       // both no.s are equal
                if(ans.isEmpty() || ans.get(ans.size()-1)!=a[i]){
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }
        
        for(int k=i; k<a.length; k++){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=a[k]){
                ans.add(a[k]);
            }
        }
        for(int k=j; k<b.length; k++){
            if(ans.isEmpty() || ans.get(ans.size()-1)!=b[k]){
                ans.add(b[k]);
            }
        }
        return ans;
    }
}
