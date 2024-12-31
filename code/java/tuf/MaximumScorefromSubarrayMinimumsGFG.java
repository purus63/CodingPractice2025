package tuf;

class MaximumScorefromSubarrayMinimumsGFG {
    // Function to find pair with maximum sum

    public int pairWithMaxSum(int arr[]) {
        int maxsum=-1;

        for(int i=1;i<arr.length;i++)
            maxsum=Math.max(maxsum,arr[i]+arr[i-1]);
        return maxsum;
    }
}
