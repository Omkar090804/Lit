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


//Using TreeSet
import java.util.TreeSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        for (int x : nums) {     // Add elements to the TreeSet to remove duplicates
            ts.add(x);
        }
        
        int index = 0;           //Transfer elements from TreeSet back to the array
        for (int x: ts) {
            nums[index++] = x;
        }

        return ts.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 2, 5, 5, 4};

        int newLength = s.removeDuplicates(nums);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
