package tuf;

public class RotateImageL48 {

    public void rotate(int[][] mat) {


        int m=mat.length;
        int n=mat[0].length;

        for(int i=0;i<m/2;i++)
        {
            for(int j=i;j<n-i-1;j++)
            {
                int temp=mat[i][j];

                mat[i][j]=mat[m-1-j][i];
                mat[m-1-j][i]=mat[m-1-i][n-1-j];
                mat[m-1-i][n-1-j]=mat[j][n-1-i];
                mat[j][n-1-i]=temp;
            }
        }
    }

}
