import java.io.*;
import java.util.*;
class ArrayOverflow extends Exception{
    public toString(){
        System.out.println("Array Overflow");
    }
}
class ArrayUnderflow extends Exception{
    public toString(){
        System.out.println("Array Underflow");
    }
}
public class ArrayOperations{
    static int add(int num,int arr[],int top){
        
            if(top == arr.length-1){
                try{
                    throw new ArrayOverflow();
                }catch(ArrayOverflow e){
                    System.out.println(e);
                }

            }else{
                arr[top+1] = num;
                return top+1;
            }
        
        return top;
    }
    static int delete(int index,int arr[],int top){
        
            if(top == 0){
                try{
                    throw new ArrayOverflow();
                }catch(ArrayOverflow e){
                    System.out.println(e);
                }

            }else{
                /*[1,2,3,4,5]
                  [1,2,0,4,5]
                */
                int del_num = arr[index];
                for(int i = index; i<top;i++){
                    arr[i] = arr[i+1];
                }                
                System.out.println(del_num+ " Has been deleted");
                return top-1;
            }
        
      return top;
    }
    static int insert(int index,int element,int top,int arr[]){
        /*[1,2,3,4,5, ]
        index = 2
        0 1 2 3 4 5
        1 2    ]=3   4   5 

        */
        for(int i = top;i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index]= element;
        System.out.println(arr[index]+ "has been added at index "+index);
        return top+1;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int n = sc.nextInt();
       int arr[] = new int[n];
       int top = n-1;
       System.out.println("Enter elements");
       for(int i = 0;i<n;i++){
           System.out.println("enter "+ (i+1) + " element");
           arr[i] = sc.nextInt();
       }
       int choice =0;
       do{
        System.out.println("1.Add\n2.Insert 'number 'Index'\n3.Delete at index\n4.Display\nPress -1 to exit");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a digit you wanna add");
                    int num = sc.nextInt();
                    top = add(num,arr,top);
                    break;
                case 2:
                    System.out.println("Insert");
                    if(top == arr.length-1){
                        try{
                            throw new ArrayOverflow();
                        }catch(Exception e){
                            System.out.println(e);
                        }
                    }else{
                        System.out.println("Enter the element");
                        int element = sc.nextInt();
                        System.out.println("Enter the index you wanna add");
                        int index = sc.nextInt();
                        top = insert(index,element,top,arr);
                    }
                    break;
                case 3:
                    System.out.println("Enter the index to be deleted");
                    int index = sc.nextInt();
                    top = delete(index,arr, top);
                    System.out.println("top is "+top);
                    break;
                case 4:
                    System.out.println("top is "+top);
                    for(int i = 0; i<=top;i++){
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case -1:
                    System.out.println("Closing the program");
                    break;
                default:
                    System.out.println("Not valid");
                    break;
            }
       }while(choice!=-1);
       sc.close();
    }
}