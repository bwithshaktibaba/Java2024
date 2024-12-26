public class linkedlist{
   //we hava to show both data and linking part//
   public static class Node{
    int data;
     Node next;
     Node (int data){
        this.data =data;
     }

   }
   public static void main(String[] args) {
   // Node o = new Node(); 
  
   //only data part is print here
   // System.out.println(o.data);
   
   // node linking   apart along with  
    // answer is null becouse no other data is lined here
  //  System.out.println(o.next);
    Node a= new Node(5);
    Node b= new Node(55);
    //System.out.println(b.next); it give null add becouse it is not linked
    Node d= new Node(555);
    Node e= new Node(50);
    Node f= new Node(500);
    Node g= new Node(545);
    a.next = b;
    b.next = e;
    d.next= b;
    System.out.println(a.next);
    System.out.println(a.data);
    System.out.println(b.data);
    System.out.println(b.next);
    System.out.println(b);
    




   }
}