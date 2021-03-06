

public class LinkedList {
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
    public static Listnode deleteFirst(Listnode head){
        if(head==null){
            return head;
        }
        Listnode temp=head;
        head = head.next;
        temp.next=null;
        return temp;
    }
    
       
    



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
        Listnode first = LinkedList.deleteFirst(head);
        System.out.println(first.data);


       // head =ll.insertAt(head,111,3);
        //ll.display(head);
       // System.out.print("Length of Linked List is:- "+ll.length(head));


    }
}

