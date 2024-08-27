class Solution 
{
    public int jump(int[] nums)
  {
        int jumps = 0;        
        int currentEnd = 0;     
        int maxreach = 0;    
          
        for (int i = 0; i < nums.length - 1; i++) 
        {
            maxreach = Math.max(maxreach, i + nums[i]); 

            if (i == currentEnd) 
            {
                jumps++;               
                currentEnd = maxreach; 

                if (currentEnd >= nums.length - 1) 
                {
                    return jumps;
                }
            }
        }
   return jumps; 
    }
}
