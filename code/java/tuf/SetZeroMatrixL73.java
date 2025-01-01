package tuf;

import java.util.HashSet;

public class SetZeroMatrixL73 {
    public void setZeroes(int[][] mat) {

        HashSet<Integer> rl= new HashSet<>();
        HashSet<Integer> cl= new HashSet<>();

        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    rl.add(i);
                    cl.add(j);
                }
            }
        }

        for(int r:rl)
        {
            for(int c=0;c<n;c++)
                mat[r][c]=0;
        }
        for(int c:cl)
        {
            for(int r=0;r<m;r++)
                mat[r][c]=0;
        }
    }
}
