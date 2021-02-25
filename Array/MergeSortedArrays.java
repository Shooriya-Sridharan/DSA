public class MergeSortedArrays {
    public static int[] merge(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        int i =0,j = 0,k = 0;
        //loop will end if either of these returns falsw
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++] = a[i];
                i++;
            }else{
                c[k++] = b[j];
                j++;
            }
            //by the end of the loop, atleast one of the array is sorted into its position
        }

        //add the remaing elements if availabe (array a)

        while(i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
         //add the remaing elements if availabe (array b)
        while(j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        return c;

    }
    public static void main(String[] args) {
        int A[] = {3,8,10,20,25,27,3,87,90,97,108,140};
        int B[] = {4,10,12,22,23,46,76,88,90,150};
        int c[] = merge(A, B);
        for(int x:c){
            System.out.print(x + " ");
        }
    }
}
