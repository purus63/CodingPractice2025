package tuf;

import java.util.ArrayList;

public class UnionOFTwoSortedArrayWithDuplicates {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here

        ArrayList<Integer> al= new ArrayList<>();

        int m=a.length;
        int n=b.length;

        int ai=0;
        int bi=0;
        while(ai<m && bi<n)
        {
            if(ai>0  && a[ai-1]==a[ai])
            {ai++;continue;}
            if(bi>0 && b[bi-1]==b[bi])
            {bi++;continue;}

            if(a[ai]<=b[bi])
            {
                if(al.size()==0 || (al.size()>0 && al.get(al.size()-1)!=a[ai]))
                    al.add(a[ai]);
                ai++;
            }
            else
            {
                if(al.size()==0 || (al.size()>0 && al.get(al.size()-1)!=b[bi]))
                    al.add(b[bi]);
                bi++;
            }
        }

        while(ai<m)
        {
            if(ai>0 && a[ai-1]==a[ai])
            {ai++;continue;}
            if(al.size()==0 || (al.size()>0 && al.get(al.size()-1)!=a[ai]))
                al.add(a[ai]);
            ai++;
        }
        while(bi<n)
        {
            if(bi>0 && b[bi-1]==b[bi])
            {bi++;continue;}
            if(al.size()==0 || (al.size()>0 && al.get(al.size()-1)!=b[bi]))
                al.add(b[bi]);
            bi++;
        }


        return al;
    }

    public static void main(String[] args) {
        for(int a:findUnion(new int[]{1,1,1,2},new int[]{1,2,3}))
            System.out.println(a+" ");
    }
}
