public class SelectionSort {
    public static void main(String[] args)
    {
        int arr[] = {18,45,12,22,14,10,9,5};
        
        for(int i = 0 ; i < arr.length ; i++ )
        {
            int min =i;
            for(int j = i+1 ; j < arr.length ;j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int no: arr)
            System.out.println(no+"");
    }
}
