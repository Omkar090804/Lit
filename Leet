public class RemoveElement {
    public int removeElements(int[] nums, int val) {
        int index = 0;
        int n = nums.length;
        while (index < n) {
            if (nums[index] == val) {
                nums[index] = nums[n - 1];
                n--;
            } else {
                index++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int length = removeElement.removeElements(nums, val);

        System.out.println("New Length: " + length);
        System.out.print("Remaining elements: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
