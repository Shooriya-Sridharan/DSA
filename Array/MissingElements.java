public class MissingElements {
    //single missing element
    public static int missing1consecutive(int arr[]){
        int difference = arr[0];
        int i =0;
        while((arr[i]-i)==difference){
            i++;
        }
       return arr[i]-1;

    }
    //finding multiple missing elements in a sorted 
    public static void multipleMissing(int arr[]){
        int difference = arr[0]-0;
        for(int i = 0;i<arr.length;i++){
            if((arr[i]-i)!=difference){
                while(difference<arr[i]-i){
                 
                    System.out.println(i+difference);
                    
                    difference++;
                }
                
            }
        }
    }
    //using hash table,unsorted
    public static void multipleMissingUnsorted(int arr[]){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int hasharr[] = new int[max+1];
        for(int i = 0;i<arr.length;i++){
            hasharr[arr[i]] +=1;
        }
        for(int i = 1;i<hasharr.length;i++){
            if(hasharr[i] == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {

        int naturnalnoscons[] = {6,7,8,9,10,12};
        System.out.println("Missing Consecutive natural numbers");
        System.out.println(missing1consecutive(naturnalnoscons));

        int manymissing[] = {6,7,8,9,11,12,15,16,17,18,19};
        System.out.println("Many missing but sorted");
        multipleMissing(manymissing);

        int hasharr[] = {3,7,4,9,12,6,11,1,2,10};
        System.out.println("Many missing but unsorted using hash table");
        multipleMissingUnsorted(hasharr);
    }
}
