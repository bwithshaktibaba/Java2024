public class delete1 {
    static int count = 5;
    public static void main(String[] args) {
        int a[]  = {12 ,34 , 50,60,78  };
        delete1 obj = new delete1();
       // obj.print(a);
        //obj.dltfrmend(a);
       //obj.print(a);
     //   obj.deleteValue(a,34);
   //     obj.print(a);
        obj.deletefrompos(a, 2,50);
        obj.print(a);
    }
    public void  print(int a[]) {
        for(int i =0; i<count;i++){
            System.out.println(a[i] + "");
        }System.out.println();
    }
    public void dltfrmend(int a[]){
        if( a.length <= 0)
        return;
        count--;
    }
    public void deleteValue(int a[] ,int val){
     int i;
     for ( i =0; i<count; i++){
        if (a[i] ==  val){break;}
     }
     if(i == count){
        System.out.println("value does not exist");
        return;
     }
     for (int j = i ;j<count -1; j++){
        a[j] = a[j=1];
    }
    count--;
    }

 public void deletefrompos(int a[] , int pos,int val){
    if (pos > count || pos <= 0){
        System.out.println("invalid pos");
        return;
    }
    for(int  i= pos-1; i<count-1;i++){
        a[i] =a[i+1] ;

    }
    count--;

 }    
}
