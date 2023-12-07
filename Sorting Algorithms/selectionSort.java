import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={12,2,45,34,78,56,90,36};
        System.out.println("before sorting");
        Arrays.stream(arr).forEach(y->System.out.print(y+" , "));

        for(int i=0;i<arr.length-1;i++)
        {
            int index=i;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }

        System.out.println();
        System.out.println("after sorting");
        Arrays.stream(arr).forEach(x->System.out.print(x+" , "));
    }
    
}
