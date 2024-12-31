package tuf;

//leetcode 75
public class SortColorL75 {

        //Solution 1
       /* public void sortColors(int[] nums) {

            int n = nums.length;
            int l=0;
            int r=0;
            int e=n-1;
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                    l++;
                if(nums[i]==2)
                    r++;
            }

            for(int i=l;i<n-r;i++)
                nums[i]=1;
            int x=0;
            while(l>0)
            {
                nums[x++]=0;
                l--;
            }
            while(r>0)
            {
                nums[e--]=2;
                r--;
            }
        }*/

    public void sortColors(int[] nums) {
        int n= nums.length;
        int li =0;
        int ri =n-1;

        for(int i=0;i<n ;i++)
        {
            if(nums[i]==0)
            {
                swap(nums,i,li);
                li++;
            }

            if(nums[i]==2 && i<ri)
            {
                swap(nums,i,ri);
                ri--;
                i--;
            }
        }
    }
        void swap (int [] arr,int i,int j)
        {
            int x= arr[i];
            arr[i]=arr[j];
            arr[j]=x;
        }
}
