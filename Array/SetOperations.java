public class SetOperations {
    //sorted union
    public static int[] sortedUnion(int arr1[],int arr2[]){
        int c[] = new int[arr1.length+arr2.length];
        int i = 0,j = 0,k = 0;
        while(i!=arr1.length && j!=arr2.length){
            if(arr1[i]<arr2[j]){
                c[k++] = arr1[i++];
            }else if(arr1[i]>arr2[j]){
                c[k++] = arr2[j++];
            }else if(arr1[i]==arr2[j]){
                c[k++] = arr1[i++];
                j++;
            }
        }
        while(i<arr1.length){
            c[k++] = arr1[i++];
        }
        while(j<arr2.length){
            c[k++] = arr2[j++];
        }
        return c;
    }
    //unsorted union
    public static int[] union(int arr1[],int arr2[]){
        int c[] = new int[arr1.length+arr2.length];
        int k = 0;
        //checks if element is present in array 2
        for(int i = 0;i <arr1.length;i++){
            for(int j = 0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr2[j] =-1;
                }

            }
            c[k++] = arr1[i];
        }
        //add only the non duplicate elements
        for(int i = 0;i<arr2.length;i++){
            if(arr2[i]!=-1){
                c[k++]= arr2[i];
            }
        }
        return c;
    }
    //unsorted intersection
    public static int[] intersection(int a[],int b[]){
        int c[];
        if(a.length<b.length){
            c = new int[a.length];
        }else{
            c = new int[b.length];
        }
        int k = 0;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(a[i] == b[j]){
                    c[k++] = a[i]; 
                }
            }
        }
        return c;


    }
    //sorted intersection
    public static int[] sortedIntersection(int arr1[],int arr2[]){
        int c[];
        if(arr1.length<arr2.length){
            c = new int[arr1.length];
        }else{
            c = new int[arr2.length];
        }
        int i = 0,j = 0,k = 0;
        while(i!=arr1.length && j!=arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }else if(arr2[j]<arr1[i]){
                j++;
            }else if(arr1[i]==arr2[j]){
                c[k++] = arr1[i++];
                j++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        //union
        int arr1[] = {3,5,10,4,6};
        int arr2[] = {12,4,7,2,5};
        int unsorted[] = union(arr1, arr2);
        for(int x:unsorted){
            System.out.print(x + " ");
        }

        //sorted union
        System.out.println("\n--Sorted Union--");
        int a[] = {3,4,5,6,10,12,14};
        int b[] = {2,4,5,7,12};
        int sorted[] = sortedUnion(a, b);
        for(int x:sorted){
            System.out.print(x + " ");
        }
          //intersection
        System.out.println("\n--Intersection--");
        int intersect[] = intersection(a, b);
        for(int x: intersect){
            System.out.print(x + " ");
        }
        System.out.println(("\n--Sorted Intersection--"));
        int sortedIntersect[] = sortedIntersection(a, b);
        for(int x: sortedIntersect){
            System.out.print(x + " ");
        }

      

        //sorted intersection

        //difference
    }
}
