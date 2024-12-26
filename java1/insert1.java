public class insert1 {
     int count  =0;
    public static void main(String[] args) {
        insert1 o  = new insert1();
        int a[] = new int [5];
        for (int   j=0 ; j<a.length; j++ )  {
          //  a[j] =j;
        o.insert(a , j +1); }
        //for (int  i =0; i < a.length; i++){
           // System.out.print(a[i] + " ");
       // }
       o.print(a);
       o.insertAtStart(a,78);
       o.print(a);
    
    }


    public void insert(int a[] ,int val)
    {
        a[count++] =val;
    }
        public void insertAtStart(int a[] ,int val){
            for(int i = a.length  - 1; i>0; i--){
                a[i] =a[i-1];
            }
            a[0]  =val;
        
    }
    public void print(int a[]){
        for (int  i =0; i < a.length; i++){
            System.out.println(a[i] + " ");}

    }
    
}
