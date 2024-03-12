public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
      
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray.rotate(nums, k);

        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Adjust k if it's larger than the length of the array

        // Reverse the entire array
        reverse(nums, 0, n - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, n - 1);
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
