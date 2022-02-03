 
public class OrderNotKnownSearch{

    public static int decendingsearch(int arr[],int low,int high,int element)
    {
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==element)
            {
                return mid;
            }
          if(arr[mid]>element)
         {
             
             low=mid+1;

         }
         else
         {
           high=mid-1;
         }

        }

        return -1;
    }

    public static int acendingsearch(int arr[],int low,int high,int element)
    {
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==element)
            {
                return mid;
            }
          if(arr[mid]>element)
         {
             
             low=mid-1;

         }
         else
         {
           high=mid+1;
         }

        }

        return -1;
    }


    public static void main(String args[]) {
       
        int arr[]={20,18,16,14,12,10,8,6,4,2,1};
        int low =0;
        int high=arr.length;
        int element=16;
        if(arr[0]<arr[1])
        System.out.println(acendingsearch(arr, low, high,element));
        else
        System.out.println(decendingsearch(arr, low, high,element));
    
    }
}






