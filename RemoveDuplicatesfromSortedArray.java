class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0; 

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; 
            }
        }

        return i + 1; 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int newLength = solution.removeDuplicates(arr);

        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
