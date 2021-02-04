public class SumOfNaturalNos {

    static int sumOfNatural(int n){
        if(n ==0){
            return 0;
        }else{
            return sumOfNatural(n-1)+n;

        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNatural(n));
    }
}
