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
