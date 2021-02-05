public class TaylorSeries{
    static double prod = 1;
    static double facto =1;
    static double taylor(int x,int n){
       
        
        if(n==0)
            return 1;
        double r = taylor(x, n-1);
        prod *=x;
        facto*=n;
        return r+(prod/facto);

    }
    public static void main(String[] args) {
        
        System.out.println(taylor(1, 10));
    }
}