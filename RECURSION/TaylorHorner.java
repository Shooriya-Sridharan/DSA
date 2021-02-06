public class TaylorHorner {
    static double s = 1;
    static double horner(int x,int n){
        if(n ==0)
            return s;
        else{
        s = 1+(double)x/n*s;
       // System.out.println("check "+horner(x, n-1));
        return horner(x,n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(horner(1,4));
    }
}
