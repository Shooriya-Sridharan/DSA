import java.util.*;
class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    public static void addNode(ArrayDeque<Node> q, Scanner sc){

        while(!q.isEmpty()){
            Node p = q.poll();
            //poll the element from the q, then assign its left and right node. Do the steps iteratively until
            //we get leaf nodes (all null) - enter -1 for null
            System.out.println("Enter the left element");
            int data = sc.nextInt();
               if(data!=-1){  
                    Node temp = new Node(data);
                    q.add(temp);//added left node to q
                    p.left = temp;
               }else{
                    p.left = null;
               }

               System.out.println("Enter the right element");
               data = sc.nextInt();
               if(data!=-1){
                    Node temp = new Node(data);
                    q.add(temp);//added right node to q
                    p.right = temp;
               }else{
                    p.right = null;
               }     
       }
    }

    public static void preOrder(Node t){
        if(t!=null){
            System.out.println(t.data);
            preOrder(t.left);
            preOrder(t.right);
        }
    }

    public static void postOrder(Node t){
        if(t!=null){
            postOrder(t.left);
            postOrder(t.right);
            System.out.println(t.data);
        }
    }

    public static void inOrder(Node t){
        if(t!=null){
            inOrder(t.left);
            System.out.println(t.data);
            inOrder(t.right);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayDeque<Node> q  = new ArrayDeque<Node>();
       System.out.println("Enter the head");
       int head = sc.nextInt();
       Node h = new Node(head);
    
       q.add(h);
       addNode(q,sc);     
       System.out.println("preorder");
       preOrder(h);
       System.out.println("---");
       System.out.println("postorder");
       postOrder(h);
       System.out.println("---");
       System.out.println("Inorder");
       inOrder(h);
    }
}
/*
                8
              /    \
            3       5
           /  \    /  \ 
         4     9  7    2
 */