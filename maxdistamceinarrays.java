
You are given m arrays, where each array is sorted in ascending order.

You can pick up two integers from two different arrays and calculate the distance. We define the distance between two integers a and b to be their absolute difference |a - b|.

Return the maximum distance.


import java.util.*;

class Solution
  {
    public int maxDistance(List<List<Integer>> arrays) 
    {
        int min = arrays.get(0).get(0);                                  
        int max = arrays.get(0).get(arrays.get(0).size() - 1);            

        for (int i = 1; i < arrays.size(); i++) 
        {
            List<Integer> currentArray = arrays.get(i);
            int currentMin = currentArray.get(0);
            int currentMax = currentArray.get(currentArray.size() - 1);
            
            if (currentMax > min)
            {
                max = Math.max(max, currentMax);
            }
    
            if (currentMin < max) 
            {
                min = Math.min(min, currentMin);
            }
        }
        return max - min;
    }
}
