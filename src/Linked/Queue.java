package Linked;

public class Queue {
    int[] arr;
    int front,back;
    int size;
    Queue(int size){
        this.size=size;
        front=back=-1;
        arr=new int[size];
    }
    void Enqueue(int x)
    {
        if(back==size-1){
            System.out.println("Overflow");
            return;
        }
        back++;
        arr[back]=x;
        if(front==-1){
            front=0;
        }
    }
    void Dequeue(){
        if(front==-1||front>back){
            System.out.println("Underflow");
            return;
        }
        front++;
    }
    int peek(){
        if(front==-1||front>back){
            System.out.println("Underflow");
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty()
    {
       return front>back;

    }
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= back; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
class Main
{
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.Enqueue(50);
        q.Enqueue(60);
        q.Enqueue(80);
        q.display();
        q.Dequeue();
        q.peek();
        q.isEmpty();
        q.display();
    }
}
