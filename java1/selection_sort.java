public class selection_sort {
public static void ssort(int arr[]){

    for(int i = 0; i< arr.length-1;i++ ){
        int min_index = i;
        //relative index is verry important
        // here error is due  to  j = 1 instead  of  j = i+1
            for(int j = i+ 1; j< arr.length;j++){
                if(arr[j] < arr[min_index]){
                min_index =j;
            }}
           // if (min_index = i ) 
            //{
                int temp =arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
        


}}
   
public static void main(String[] args) {
    int arr [] =  {9,8,7,6 };
ssort(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
}
}