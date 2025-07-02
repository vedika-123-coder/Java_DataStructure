public class Rotate {
    private Node2 head;

    Rotate(){
        head=null;
    }

    void InsertAtHead(char val){
        Node2 n=new Node2(val);
        if(head!=null){
            head.prev=n;
        }
        n.next=head;
        head=n;
    }
    void display()
    {
        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void RotateByN(int N){
        Node2 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;

        while(N-->0){
            head=head.next;
            temp=temp.next;
        }
        head.prev=null;
        temp.next=null;

    }
}
class Node2{
    char data;
    Node2 next;
    Node2 prev;

    Node2(char data){
        this.prev=null;
        this.data=data;
        this.next=next;
    }
}
class DDD{
    public static void main(String[] args) {
        Rotate l=new Rotate();
        l.InsertAtHead('a');
        l.InsertAtHead('b');
        l.InsertAtHead('c');
        l.display();
        l.RotateByN(1);
        l.display();
    }
}
