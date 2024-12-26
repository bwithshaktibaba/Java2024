public class searchindex {
    public static void main(String[] args) {
        int a[] = { 12 ,45,67 ,89};
        searchindex  obj = new searchindex();
        int i  =obj.LS(a,52);
        if(i==-1){
            System.out.println("invalid number");
        }else{
            System.out.println(i);
        }
    }

    public int LS(int a[] ,int val){
        if(a.length ==0){
            return -1;

        }
        for(int  i = 0; i<a.length; i++){
            if(a[i] == val){
                return i;

            }
        }
        return -1;
    }
    
}
