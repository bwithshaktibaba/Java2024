 import java.util.Scanner;
public class insertion_sort {
public static void main(String[] args){
        int  n,j,loc,arr[] ,ptr,temp;
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter no of elements");
        n =sc.nextInt();
        arr = new int[n];
        System.out.println([n]);
        System.out.println(" elements in array");
        for (int i= 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
         }
         for(int i=1; i <=n-1;i++)
         {
            temp =arr[i];
            j = i-1;
            while (temp<arr[j]  && j>=0) 
            {
                arr[j+1] =arr[j];
                j=j-1;
            }
            arr[j+1]  = temp;
         }
    
    for(int i=1; i<=arr.length -1;i++){
        System.out.print(arr[i]+ " ");
    }
}}