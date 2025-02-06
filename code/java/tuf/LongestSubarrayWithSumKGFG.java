package tuf;

import java.util.HashMap;

public class LongestSubarrayWithSumKGFG {
    //https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
    public int lenOfLongestSubarr(int[] arr, int k) {
        // code here

        int n=arr.length;
        int sum=arr[0];

        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(sum,0);
        int ans=0;
        if(hmap.containsKey(k))
            ans=1;
        for(int i=1;i<n;i++)
        {
            sum+=arr[i];

            if(sum==k)
                ans=Math.max(ans,i+1);
            if(hmap.containsKey(sum-k))
                ans=Math.max(ans,i-hmap.get(sum-k));
            if(hmap.get(sum)==null)
                hmap.put(sum,i);
        }
        return ans;
    }
}
