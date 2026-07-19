int removeDuplicates(int* nums, int numsSize) {
    if(numsSize == 0) return 0;
    int k = 1;
    int j = 1;
    for(int i = 0 ; j < numsSize ;)
    {
        if(nums[i] == nums[j])
        {
            j++;
        }
        else
        {   i++;
            nums[i] = nums[j];
            k++;
            j++;
        }
    }
    return k;
}