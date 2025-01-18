package tuf;

import java.util.HashMap;

public class LongestSubarrayWithSumZeroGFG {
    int maxLen(int arr[]) {
        int n=arr.length;
        HashMap<Integer,Integer> hmap= new HashMap<>();
        hmap.put(arr[0],0);
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
                ans=Math.max(ans,i+1);
            else if(hmap.get(sum)!=null)
            {
                ans=Math.max(ans,i-hmap.get(sum));
            }
            else
                hmap.put(sum,i);
        }
        return ans;
    }
    }
