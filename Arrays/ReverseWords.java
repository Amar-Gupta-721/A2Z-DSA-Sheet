package Arrays;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String str = ".i.like.this.program.very.much.";
        System.out.println(reverseWords(str));
    }

     public static String reverseWords(String s) {
        // Code here
        StringBuilder ans = new StringBuilder("");
        String[] str = s.split("[.]");
        System.out.println(Arrays.toString(str));
        for(int i=str.length-1; i>=0; i--){
            if(str[i].length()==0) continue;
            if (i==str.length-1)ans.append(str[i]);
            else ans.append(".").append(str[i]);
        }
        
        return ans.toString();
    }
}
