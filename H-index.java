import java.util.*;

class Solution 
{
    public int hIndex(int[] citations) 
  {
      Arrays.sort(citations);
        for (int i = 0; i <  citations.length; i++)
          {
             int h =  citations.length - i;
            if (citations[i] >= h)
            {
                return h;  
            }
        }
         return 0;  
    }
}

//////////////////////////////////////////////////////////////////////////////////////
// earlier written by me ,not for all testcases like citations=[1];

import java.util.*;

class Solution 
{
    public int hIndex(int[] citations) 
    {
       
         int count=0;
        for(int i=0;i<citations.length-1;i++)
        {
            int j=0;
           
            if(citations[j]>=citations[i])
            {
                count++;
                j++;
            }
            j++;
            
          }
        return count;
    }
}
