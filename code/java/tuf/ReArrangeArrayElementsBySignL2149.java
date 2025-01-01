package tuf;

public class ReArrangeArrayElementsBySignL2149 {
        public int[] rearrangeArray(int[] nums) {

            int n = nums.length;
            int arr1[] = new int[n/2];
            int arr2[] = new int[n/2];

            int xi=0,yi=0;

            for(int num:nums)
            {
                if(num>0)
                    arr1[xi++]=num;
                else
                    arr2[yi++]=num;
            }
            xi=0;yi=0;
            for(int i=0;i<n;i++){
                if(i%2==0)
                    nums[i]=arr1[xi++];
                else
                    nums[i]=arr2[yi++];
            }
            return nums;
        }
    }

