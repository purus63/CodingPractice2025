package tuf;

public class MajorityElementL169 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int key=nums[0];
        int val=1;

        for(int i=1;i<n;i++)
        {
            if(nums[i]==key)
            {
                val++;continue;
            }

            if(nums[i]!=key && val>1)
            {
                val--;
            }
            else
            {
                key=nums[i];
                val=1;
            }
        }
        return key;
    }
}
