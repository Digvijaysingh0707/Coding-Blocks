

public class LinkedList {
    //private Listnode head;//Head node to hold the list
    private void display(Listnode head){
        if(head==null){
            return;
        }
        Listnode current =  head;

        while(current!=null){
            System.out.print(current.data+"--> ");
            current=current.next;
        }
        System.out.print(current);//this will print null at the end

    }

    private static class Listnode{
        private int data;
        private Listnode next;
        //constructor
        private Listnode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean find(Listnode head,int searchKey){
        if(head==null){
            return false;
        }
        Listnode current = head;
        while(current!=null){
            if(current.data==searchKey){
                return true;
            }
            current=current.next;
        }
        return false;

    }
    
    //Recursive way
    public static boolean find(Listnode head,int searchKey){
        if(head==null)return false;
        if(head.data==key) return true;
        else{
            return find(head.next,searchKey);






    public static void main(String[] args){
        Listnode head =new Listnode(10);
        Listnode second =new Listnode(1);
        Listnode third =new Listnode(15);
        Listnode fourth =new Listnode(4);
        head.next= second;
        second.next=third;
        third.next=fourth;


        LinkedList ll= new LinkedList();
        ll.display(head);
        System.out.println();
        if (LinkedList.find(head, 4)) {

            System.out.println("Linked List found");
        }


      

    }
}
  












