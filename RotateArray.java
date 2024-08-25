import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;                                  //{1,2,3,4,5,6,7}   k=3;
       
        reverse(nums, 0, n - 1);         // Reverse the entire array     {7,6,5,4,3,2,1}
        reverse(nums, 0, k - 1);         // Reverse the first k elements   {5,6,7,4,3,2,1}}
        reverse(nums, k, n - 1);         // Reverse the remaining elements    {5,6,7,1,2,3,4}

      
        System.out.println(Arrays.toString(nums));
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
