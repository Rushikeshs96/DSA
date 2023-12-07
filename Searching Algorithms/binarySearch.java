import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={12,2,45,34,78,56,90,36};

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to search");
        int key=sc.nextInt();
         sc.close();

        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                System.out.println("key found at"+mid);
                break;
            }
            else if(arr[mid]>key)
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    
}
