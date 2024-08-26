class Solution 
{
    public boolean canJump(int[] nums)             // [2, 3, 1, 1, 4]
  {
        int maxReach = 0; 

        for (int i = 0; i < nums.length; i++)           
        {
           if (i > maxReach) {                   
                return false;
            }
            
            maxReach = Math.max(maxReach, i + nums[i]);           // iteration 1= 0+2=2=maxreach;
                                                                  // iteration 2= 1+2=3=maxreach;
                                                                  // iteration 3= 2+ 3=5=maxreach;
                                                                  // so maxreach > nums.length-1;
            
            if (maxReach >= nums.length - 1) 
            {
                return true;
            }
        }
        return false;
    }
}
