
public class Fibonnaci {
    //recursive solution
    static int recFib(int n){
        if(n<=1)
            return n;
        else
            return recFib(n-2)+recFib(n-1);
    }
    //memoized solution
    static int memFib(int n,int mem[]){
       if(n<=1){
           mem[n]=n;
           return n;
       }else{
           if(mem[n-1]==-1){
               mem[n-1] = memFib(n-1, mem);
           }
           if(mem[n-2]==-1){
            mem[n-2] = memFib(n-2, mem);
            }
            mem[n] = mem[n-1]+mem[n-2];
           return mem[n];
       }
    }
    public static void main(String[] args) {
        int n = 6;
        int mem[]= new int[n+1];
        for(int i = 0;i<mem.length;i++)
            mem[i]=-1;
        System.out.println("Recursively "+recFib(n));
        System.out.println("memoized "+memFib(n, mem));
        System.out.println(mem[6]);
    }
}
