package tuf;

import java.util.ArrayList;

public class ArrayLeadersGFG {
    /*
    * Input: arr = [16, 17, 4, 3, 5, 2]
    Output: [17, 5, 2]
    * */
    ArrayList<Integer> leaders(int arr[]) {
        int n=arr.length;
        int max=arr[n-1];
        ArrayList<Integer> al = new ArrayList<>();
        al.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=max) {
                al.add(0, arr[i]);
                max = arr[i];
            }
        }
        return al;
    }
}
