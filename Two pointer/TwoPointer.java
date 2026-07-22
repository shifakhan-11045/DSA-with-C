public class TwoPointer {
    public static void main(String[] args)
    {
        int [] arr = {2,3,7,11,15};
        int target = 10;
        int left = 0, right = arr.length - 1;

        while(left < right)
        {
            int sum = arr[left] + arr[right];

            if(sum == target)
            {
                System.out.println(arr[left]+"+"+arr[right]+"="+target);
                break;
            }
            else if(sum > target)
                right--;
            else
                left++;
        }
    }
}
