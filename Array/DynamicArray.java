public class DynamicArray {
    public static void main(String[] args) {
        int A[]= {1,2,3,4,5};
        int B[] = new int[A.length*2];

        for(int i = 0;i<A.length;i++){
            B[i] = A[i];
        }
        A = B;
        B=null;
        for(int x:A){
            System.out.println(x);
        }
        System.out.println("Size of A is "+A.length);
    }
}
