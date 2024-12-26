public class subarray
{
    public  int cntigousarray(int [] arr){
    int max_so_far, current_max;
    max_so_far = current_max =arr[0];
    
    for(int  i= 1; i<arr.length ; i++){
        current_max  =Math.max(arr[i], current_max + arr[i]);
        max_so_far = Math.max(current_max, max_so_far);
    }
    return max_so_far;
    }
    public static void main(String[] args) {
       subarray obj = new subarray();
        int arr[] = {-3,-4,4,-1,-2,1,5,-3};
        System.out.println(obj.cntigousarray(arr));
    }
}