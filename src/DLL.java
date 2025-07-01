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
        n.prev=null;
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
    void InsertAtTail(){

    }
}
class DuplicateClass{
    public static void main(String[] args) {
        DLL dd=new DLL();
        dd.InsertAtHead(40);
        dd.InsertAtHead(80);
        dd.display();
    }
}