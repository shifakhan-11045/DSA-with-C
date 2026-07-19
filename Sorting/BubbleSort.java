public class BubbleSort {
    public static void main(String[] args)
    {
        int[] arr = {23,11,56,32,1,8};
        int length = arr.length;
        int temp;
        for(int i = 0 ; i < length ; i++)
        {
            boolean swapped = false; 
            for(int j = 0 ; j < length-i-1 ; j++)
            { 
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                 break;
            }
        }
            
        for(int no: arr)
            System.out.println(no+"");
    }
}
