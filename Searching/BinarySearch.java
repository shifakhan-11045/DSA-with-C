public class BinarySearch 
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50};
        int li = 0;
        int hi = arr.length-1;
        int element = 40;
        while(li <= hi)
        {
            int mid = (li + hi)/2;
            if(arr[mid] == element)
            {
                System.out.println("Element found at index = "+arr[mid]);
                break;
            }
            if(element > arr[mid])
            {
                li = mid + 1;
                hi = mid - 1;
            }
        }
        
    }
}
