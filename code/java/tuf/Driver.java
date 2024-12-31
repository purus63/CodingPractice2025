package tuf;

public class Driver {
    public static void main(String[] args) {
        TwoSum twoSumSol = new TwoSum();
        int res[] = twoSumSol.twoSum(new int[] {2, 7, 11, 15},9);
        for(int a:res)
            System.out.print(a + " ");
    }
}
