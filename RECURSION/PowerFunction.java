public class PowerFunction {
    /*
        pow(m,n)= m*m*m*...n-1 times*m
        pow(m,n) = pow(m,n-1)*m  

        0             n = 0
        pow(m,n-1)*m  otherwise    

        pow(2,5)
            |
        pow(2,4)*2
            |
        pow(2,3)*2
            |
        pow(2,2)*2
            |
        pow(2,1)*2
            |
        pow(2,0)*2
            |
            1
     */
    static int pow(int m,int n){
        if(n ==0)
            return 1;
        else
            return pow(m,n-1)*m;
    }
    /*
        pow(2,8) = (2^2)^4
        pow(2,9) = 2*(2^2)^4

        pow(2,5) = 32
            |
        2*pow(2*2,2)
            |
          pow(2^2*2^2,1)
            |
        2^4*pow(2^4*2^4,0)
            |
            1
     */
    static int optimizedPow(int m,int n){
        if(n ==0)
            return 1;
        if(n%2==0)
            return optimizedPow(m*m,n/2);
        else
            return optimizedPow(m*m, (n-1)/2)*m;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,9));
        System.out.println(optimizedPow(2, 9));
    }
}
