package Linked;

public class Stacks {
    int[] arr;
    int top1,top2,size;

    Stacks(int size){
        this.size=size;
        top1=-1;
        top2=size;
        arr=new int[size];
    }
    void push1(int val)
    {
        if((top1+1)<top2){
            top1++;
            arr[top1]=val;
        }
        else{
            System.out.println("Stack1 overflow");
        }
    }
    void push2(int val)
    {
        if((top2-1)>top1){
            top2--;
            arr[top2]=val;
        }
        else{
            System.out.println("Stack2 overflow");
        }
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    int pop1(){
        if(top1>=0){

            int x=arr[top1];
            top1--;
            return x;
        }
        else{
            System.out.println("Underflow");
            return -1;
        }
    }
    void pop2(){
        if(top2==size){
            System.out.println("Stack2 Underflow");
        }
        else{

            top2++;
        }
    }
    void displayStack1() {
        if (top1 >= 0) {
            System.out.print("Stack 1: ");
            for (int i = 0; i <= top1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack 1 is empty");
        }
    }
    void displayStack2() {
        if (top2 < size) {
            System.out.print("Stack 2: ");
            for (int i = size-1; i >= top2; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack 2 is empty");
        }
    }
}
class TwoArray{
    public static void main(String[] args) {
        Stacks ss=new Stacks(10);
        ss.push1(30);
        ss.push1(70);
        ss.push1(80);
        ss.push1(90);
        ss.push2(50);
        ss.push2(10);
        ss.push2(20);
        ss.push2(100);
        ss.push2(200);
        ss.push2(500);
        ss.displayStack1();
        ss.displayStack2();
        ss.pop2();
        ss.pop1();
        ss.displayStack1();
        ss.displayStack2();
    }
}
