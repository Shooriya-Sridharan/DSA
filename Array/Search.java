public class Search {
    public static int linear(int arr[],int num){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num)
                return i;
        }
        return -1;
    }
    public static int binary(int arr[],int num,int l,int h){
        //base condition, when low becomes greater or equal to high, the array is scanned
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == num){
                return mid;
            }else if(num>arr[mid]){
                l = mid+1;
                return binary(arr, num, l, h);
            }else if(num<arr[mid]){
                h = mid-1;
                return binary(arr, num, l, h);
            }
        }
        
        return -1;//not found
    }
    public static void main(String[] args) {
        int lSearcharr[] = {8,9,4,7,6,3,10,5,14,2};
        System.out.println(linear(lSearcharr, 10));
        int bSearcharr[] = {4,8,10,15,18,21,24,27,29,33,34,37,39,41,43};
        System.out.println(binary(bSearcharr, 37, 0, bSearcharr.length-1));

    }
    

}
