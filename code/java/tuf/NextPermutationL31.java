package tuf;

//4 5 3 2
public class NextPermutationL31 {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0);
            return;
        }

        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }
        reverse(nums, idx + 1);
    }

    void reverse(int arr[], int idx) {
        int n = arr.length;
        int mid = (idx + n) / 2;
        int cnt = 0;
        for (int i = idx; i < mid; i++) {
            swap(arr, i, n - 1 - cnt);
            cnt++;
        }
    }

    void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
