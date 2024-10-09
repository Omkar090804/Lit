class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr []=new int[m+n];
        int k=0,i=0,j=0;

        while(m>i && n>j)
{
            if(nums1[i]>=nums2[j])
{
                arr[k++]=nums2[j++];
            }

            else{
                arr[k++]=nums1[i++];
            }
        }

        while(m>i){
            arr[k++]=nums1[i++];
        }
        while(n>j){
            arr[k++]=nums2[j++];
        }
     
     for(int x=0;x < arr.length; x++){
         nums1[x]=arr[x];

     }
     }
    }
