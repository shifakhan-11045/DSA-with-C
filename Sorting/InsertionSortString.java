public class InsertionSortString {
    public static void main(String[] args)
    {
       String [] arr = {"Shifa","Khan","ABC","PQR"};
        
        for(int i = 1 ; i < arr.length ; i++)
        {
            String temp = arr[i];

            int j = i - 1;

            while(j >= 0 && arr[j].compareTo(temp)>0)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for(String n: arr)
        {
            System.out.println(n+" ");
        }
    }
}
