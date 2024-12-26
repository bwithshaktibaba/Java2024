public class quick_sort {
    static void displayarr( int[] arr){
        for(int val  : arr){
            System.out.println(val +" ");
        }}
    static void swap(int[] arr, int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y]  = temp;
    }
    static int partition(int[] arr,int st,int end){
       int pivot = arr[st];
       int cnt = 0;
        for( int i = st+ 1 ; i <= end ;i++){
            if(arr[i]<= pivot)cnt++;
        }
            int pivotIdx = st + cnt;
            swap(arr, st, pivotIdx);
            int i = st;
            int j = end;
            while( i< pivotIdx && j > pivotIdx){
                while(arr[i] <= pivot)i++;
                while (arr[j] > pivot)j--;
                if(i< pivotIdx && j> pivotIdx){
                    swap(arr, i,j);
                    i++;
                    j--;
                }
                    
                }
            
            return pivotIdx;
        
    }}
    static void Qsort(int [] arr, int st, int end){
        if (st< end){
            return ;
        }
        int pi = partition(arr, st, end);
        Qsort(arr, st, pi-1);
        Qsort(arr, pi+1,end);
    }
    public static int main(String[] args) {
        int [] arr = { 6,9,78,34 ,45,12};
        System.out.println("array before sorted");
        Qsort o = new Qsort(arr,0,6);
        
        o.displayarr(arr);
        System.out.println();
}
