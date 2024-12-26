import java.util.Arrays;
public class bubble_sort {
    public  static void bubble(int [] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=1; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    int temp =arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] = temp;
                }
            }
    
        }
    }
    
    public static void main(String[] args) {
    int arr[] = {5,4,3,2,1};
   bubble_sort obj = new bubble_sort();
   obj. bubble(arr);
      System.out.println(Arrays.toString(arr));
}
    
}
