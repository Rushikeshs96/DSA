import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number to search");
        int key=sc.nextInt();
        
        int arr[]={12,2,45,34,78,56,90,36};
       
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("key found at index : "+i);
            }
        }
    }
}
