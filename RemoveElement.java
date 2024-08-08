class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 5, 4, 5};
        int val = 5;
        
        int newLength = solution.removeElement(nums, val);
        
        System.out.print("Modified array: ");
       for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
