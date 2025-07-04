package BinarySearch;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.left=null;
        this.data=data;
        this.right=null;
    }
}
public class BST {
    Node root;

    BST(){
        root=null;
    }

    private Node insertRec(Node root,int data){
       if(root==null){
           Node n=new Node(data);
           return n;
       }
       if(data<root.data){
           root.left=insertRec(root.left,data);
       }
       else if(data>root.data){
           root.right=insertRec(root.right,data);
       }
       return root;
    }

    void insert(int data){
        root=insertRec(root,data);
    }

    static void inDFS(Node root){
        if(root==null){
            return;
        }
        inDFS(root.left);
        System.out.print(root.data+" ");
        inDFS(root.right);

    }
    private boolean searchRec(Node root,int data){
        if(root==null){
            return false;
        }
        if(data== root.data){
            return true;
        }
        if(data<root.data){
            return searchRec(root.left,data);
        }
        else {
            return searchRec(root.right,data);
        }
    }

    boolean search(int data){
        return searchRec(root,data);
    }
    Node findSuccessor(Node root){
        Node temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp;
    }
    private Node deleteRec(Node root,int data){
        if(root==null){

        }
        if(data<root.data){
            root.left=deleteRec(root.left,data);
        }
        else if(data>root.data){
            root.right=deleteRec(root.right,data);
        }
        else{
            //found the node to be deleted

            //Case1:Node has 0 or 1 children
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }

            //Case2: with 2 children
            Node successor=findSuccessor(root.right);
            root.data=successor.data;
            root.right=deleteRec(root.right,successor.data);
        }
        return root;
    }
    void remove(int data){
        root=deleteRec(root,data);
    }
    private boolean isBSTHelper(Node root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min||root.data>=max){
            return false;
        }
        return isBSTHelper(root.left,min,root.data)&&isBSTHelper(root.right,root.data,max);
    }
    boolean isBST(){
        return isBSTHelper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
class DriverCode{
    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(80);
        bst.insert(10);
        bst.insert(40);
        bst.insert(70);
        bst.insert(100);
        bst.insert(35);
        bst.insert(60);
        bst.insert(75 );
        BST.inDFS(bst.root);
        int data=50;
        System.out.println(bst.search(data));
    }
}
//to find the correct successor got the right node and then the leftmost node of the node to find inorder successor
//Another way is finding the inorder and then the next node is the inorder successor of that node