public class quicksort1 {
    static void displayarr( int[] arr){
        for(int val  : arr){
            System.out.println(val +" ");
        }
    }
    static void swap(int[] arr, int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]  = temp;
    }
    static int partition(int[] arr,int st,int end){
       int pivot = arr[end]; // Choose the last element as the pivot
        int i = st - 1; // Pointer for the smaller element

        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j); // Swap the smaller element with the current element
            }
        }
        swap(arr, i + 1, end); // Place the pivot in the correct position
        return i + 1; 
        }
        
    
     static void Qsort(int arr [], int st, int end)
     {
        if(st>=end)
           return ;
        
        int pi = partition(arr, st, end);
        Qsort(arr, st, pi-1);
        Qsort(arr, pi+1,end);
    }

    public static void main(String[] args) {
        int  arr[] = { 6,9,78,34 ,45,12};
        System.out.println("array before sorted");

        displayarr(arr);
        Qsort(arr, 0, arr.length - 1);
          System.out.print("array after sort" + "  ");
        displayarr(arr);
        
    }
}
    


