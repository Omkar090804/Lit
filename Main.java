// merge sorted arrays

/* class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1=m-1;
        int index2=n-1;
        int mergeindex= m+n-1;
        while(index1>=0 && index2>=0){
            if(nums1[index1] > nums2[index2]) {
                nums1[mergeindex]=nums1[index1];
                mergeindex--;
                index1--;
            }
            else{
                nums1[mergeindex]=nums2[index2];
                mergeindex--;
                index2--;

            }
        }
        while (index2 >= 0) {
            nums1[mergeindex--] = nums2[index2--];
        }
    }
}
*/




