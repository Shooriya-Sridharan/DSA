//This is a node in linkedList. It has head -> Starting node, tail->last node, and data is the the number stored
class Node{ 
    static Node head = null; //head ref (Static since it keeps changing and shouldnt change for new object)
    Node next;
    static Node tail = null;
    int data;
    public Node(){
        this.next = null; 
    }
}
public class LinkedListImplementation {
    //adding last
    public static void add(int n){
        Node node = new Node();//node created
        node.data = n;//initialising the data
        
        if(Node.head == null){
            //case where no element
            caseEmpty(node);
        }else{
           addLast(node);
        }  
    }
    //empty case
    public static void caseEmpty(Node node){
            //make the head
            Node.head = node;
            //make the tail
            Node.tail = node;
    }
    //adding last
    public static void addLast(Node node){
            //just make the current tail's next point to the node
           Node.tail.next= node;
           //make the current node as tail
           Node.tail = node;
    }
    public static void addFirst(int n){

        Node curr_head = Node.head;
        Node node = new Node();
        node.data = n;
        if(curr_head==null){
            caseEmpty(node);  
        }else{
            //make the curr node point to next node. 
            node.next = Node.head;
            //make the current node head
            Node.head = node;
        }
    }
    public static void add(int index, int n){
        //will add next to the "n" value else it will add at last
        Node node = new Node();
        node.data = n;
        Node iterator = Node.head;
        
        if(index<=0){
            //when index is less than 0
            addFirst(n);
        }else{
            for(int i = 0;i<index-1;i++){
                iterator = iterator.next;
                if(iterator == null){
                    break;
                }
            }
            //temp has next node
            Node temp = iterator.next;
            //let the curr node point temp
            node.next = temp;
            iterator.next = node;
        }
        
    }
    public static void display(){
        Node iterator = Node.head;
      
        while(iterator!=null){
            
            System.out.println(iterator.data);
            iterator = iterator.next;

        }

    }

    public static void main(String[] args) {
        
        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        add(70);
        addFirst(60);
        add(3,69);
        add(4,699);
        display();
        
    }
}
