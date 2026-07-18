double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) 
{  
    int totalSize = nums1Size + nums2Size;
    int merge[totalSize];
    int i = 0 , j = 0;

    //Merging and sorting two sorted arrays
    for(int k = 0 ; k < totalSize ; k++)
    {
      if(i < nums1Size && j < nums2Size)
      {
        if(nums1[i] <= nums2[j])
        {
            merge[k] = nums1[i];
            i++;
        }
        else
        {
            merge[k] = nums2[j];
            j++;
        }

      }
      // For remainings in nums1
      else if(i < nums1Size)
      {
        merge[k] = nums1[i];
        i++;
      }
      // For remianings in nums2
      else
      {
        merge[k] = nums2[j];
            j++;
      }
    }
    //Calculate median 
    if(totalSize % 2 == 0)
    {
        return (merge[totalSize / 2] + merge[(totalSize / 2) - 1 ]  ) / 2.0;
    }
    else
    {
        return merge[totalSize / 2];
    }
    
}