import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={12,2,45,34,78,56,90,36};

       
        System.out.println("unsorted array");
        Arrays.stream(arr).forEach(x->System.out.print(x+" , "));
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        Arrays.stream(arr).forEach(y->System.out.print(y+" , "));
    }
}
