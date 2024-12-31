package tuf;

public class Driver {
    public static void main(String[] args) {
        SortColorL75 obj = new SortColorL75();
        int arr[] = new int[]{2,0,2,1,1,0};
        obj.sortColors(arr);
        for(int a:arr)
            System.out.print(a + " ");
    }
}
