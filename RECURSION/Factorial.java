public abstract class Factorial {
    /*
        1*2*3*...(n-1)*n

        1           if n =1
        (n-1)*n     otherwise
     */
    static int fact(int n){
        if(n ==0)
            return 1;
        if(n ==1){
            return 1;
        }else{
            return fact(n-1)*n;
        }
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
}
