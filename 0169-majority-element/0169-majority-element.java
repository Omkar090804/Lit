class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int cand=0;
         for(int i=0;i<nums.length;i++){
             
            if(count==0){
               cand=nums[i];
            }  
             if(cand==nums[i]){
                 count++;
             }
             else{
                 count--;
             }
         }
        return cand;
    }
}