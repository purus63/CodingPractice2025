package tuf;

import java.util.HashSet;

public class LongestConsecutiveSeqL128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset= new HashSet<>();
        for(int x:nums)
            hset.add(x);

        int maxstreak=0;
        for(int a:nums)
        {
            if(!hset.contains(a-1)){
                int num=a+1;
                int currstreak=1;

                while(hset.contains(num))
                {
                    num++;
                    currstreak++;
                }
                maxstreak=Math.max(maxstreak,currstreak);
            }
        }
        return maxstreak;
    }
}
