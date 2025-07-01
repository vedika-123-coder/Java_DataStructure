class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class SLL {
    private Node head;

    SLL(){
        head=null;
    }

    void InsertAtHead(int val){
        Node n=new Node(val);
        n.next=head;
        head=n;

    }
    void display()
    {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    void InsertAtTail(int val)
    {
        Node n=new Node(val);
        if(head==null){
           // InsertAtHead(val);
            //return;
            head=n;
            return;
        }
        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;

    }
    int getsize(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
    void InsertAtPos(int val,int pos)
    {
        Node n=new Node(val);
        int count=0;
        int llsize=getsize();
        if(pos<0||pos>llsize){
            System.out.println("Invalid position entered");
        }
        else if(pos==0){
            n.next=head;
            head=n;
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                pos--;
                count++;
                if(pos==0)
                {
                    n.next=temp.next;
                    temp.next=n;
                    return;
                }
                temp=temp.next;
            }
        }
    }
    void DeleteAtHead(){
        if(head==null){
            return;
        }
        Node temp=head;
        head=head.next;
        temp=null;
    }
    void DeleteByVal(int val){
        if(head==null){
            return;
        }
        else if(head.data==val){
            DeleteAtHead();
            return;
        }
        else{
            Node temp=head;
            while(temp.next!=null && temp.next.data!=val){
               temp=temp.next;
            }
            if(temp.next==null)
            {
                System.out.println("the number "+val+" not found in the list");
                return;
            }
            else{
                Node todelete=temp.next;
                temp.next=temp.next.next;
            }
        }
    }
}
class DriverClass{
    public static void main(String[] args) {
        SLL ll=new SLL();
        ll.InsertAtPos(25,0);
        ll.InsertAtTail(90);
        ll.display();
        ll.InsertAtHead(40);
        ll.InsertAtHead(20);
        ll.InsertAtHead(10);
        ll.InsertAtTail(70);
        ll.display();
        ll.InsertAtPos(35,0);
        ll.display();
        ll.DeleteAtHead();
        ll.display();
        ll.DeleteByVal(500);
        ll.display();
    }
}
