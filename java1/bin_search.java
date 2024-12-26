public class bin_search {
    public static void main(String[] args) {
        int a[] ={12,15,99,76, 84};
        bin_search o = new bin_search();
        int i = o.sarchindex1(a,12,0,a.length-1);
        if (i ==-1){
            System.out.println("value does not exist");

        }else{
            System.out.println(i);
        }

    }
    public  int sarchindex1( int a[], int val, int start, int end){
        if(a.length == 0 || start>end){
            return -1; 
        }
        int mid = (start + end)/2;
            if(val == a[mid]){
                return mid;
            }
            if (val < a[mid]){
                return sarchindex1(a, val, start, mid-1);
            }else{ return sarchindex1(a, val,  mid + 1, end);
            }
        }
    }
    

