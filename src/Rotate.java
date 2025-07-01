public class Rotate {
    private Node1 head;

    Rotate(){
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
}
class Node2{
    char data;
    Node2 next;
    Node2 prev;

    Node2(int data){

    }
}
