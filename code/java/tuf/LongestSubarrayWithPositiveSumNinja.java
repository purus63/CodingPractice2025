package tuf;

public class LongestSubarrayWithPositiveSumNinja {
    //https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399
   /* public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here

        int n=a.length;

        int l=0;
        int r=0;
        int sum=0;
        int ans=0;
        while(r<n)
        {
            while(r<n && sum<=k)
            {
                if(sum==k){
                    ans=Math.max(ans,r-l);
                }
                sum+=a[r];
                r++;

            }
            if(sum>k)
            {
                sum-=a[l];
                l++;
            }
        }
        return ans;
    }*/

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here

        int n=a.length;

        int l=0;
        int r=0;
        long sum=a[0];
        int ans=0;
        while(r<n)
        {
            while(l<=r && sum>k){
                sum-=a[l];
                l++;
            }

            if(sum==k)
                ans=Math.max(ans,r-l+1);
            r++;
            if(r<n)
                sum+=a[r];

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestSubarrayWithSumK(new int[]{0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0
        },52));
    }
}

