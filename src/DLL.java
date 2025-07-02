class Node1{
    Node1 prev;
    int data;
    Node1 next;

    Node1(int data){
        this.prev=null;
        this.data=data;
        this.next=null;
    }
}
public class DLL {
    private Node1 head;

    DLL(){
        head=null;
    }

    void InsertAtHead(int val){
        Node1 n=new Node1(val);
        if(head!=null){
            head.prev=n;
        }
        n.next=head;
        head=n;
    }
    void display()
    {
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void InsertAtTail(int val){
        Node1 n=new Node1(val);
        if(head==null){
            head=n;
            return;
        }
    }
}
class DuplicateClass{
    public static void main(String[] args) {
        DLL dd=new DLL();
        dd.InsertAtTail(58);
        dd.InsertAtHead(40);
        dd.InsertAtHead(70);
        dd.InsertAtHead(80);
        dd.InsertAtHead(90);
        dd.InsertAtHead(100);
        dd.display();
    }
}