public class InsertSortedArray {
    //inserting a number in a sorted array
    public static int[] insert(int arr[],int num){
        int newarr[] = new int[arr.length+1];
        for(int i = 0;i<arr.length;i++){
            newarr[i] = arr[i];
        }
        if(num>arr[arr.length-1]){
            newarr[newarr.length-1] = num;
        }else{
            int j = newarr.length-2;
            while(newarr[j]>num){
              newarr[j+1] = newarr[j] ;
              j--;
            }
            newarr[j] = num;
        }

        return newarr;
    }
    //Check if the array is sorted or not
     public static boolean isSorted(int arr[]) {
         for(int i = 0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                 return false;
             }
         }
        return true;
    }
    //move positive elements to one side and negative elements to the other
    public static void positiveNegativeShift(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            while(arr[i]<0){
                i++;
            }
            while(arr[j]>0){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int insertarr[] = {4,8,13,16,20,25,28,33};
        int newarr[]=insert(insertarr,18);
        for(int x: newarr){
            System.out.println(x);
        }
        int notsorted[] = {1,2,3,3,4,8,16};
        System.out.println(isSorted(notsorted));
        int negativePositive[] = {-1,2,-3,5,6,-4,2,5,-9,8};
        positiveNegativeShift(negativePositive);
        
    }
}
