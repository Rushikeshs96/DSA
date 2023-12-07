import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={12,2,45,34,78,56,90,36};
        System.out.println("before sorting");
        Arrays.stream(arr).forEach(y->System.out.print(y+" , "));


        for(int i=0;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println();
        System.out.println("after sorting");
        Arrays.stream(arr).forEach(y->System.out.print(y+" , "));
    }
}
