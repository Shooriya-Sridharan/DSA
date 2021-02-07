public class Combination {
    //Combination using plane recursion
    static int C(int n,int r){
        if(r==0||n ==r)
            return 1;
        else{
            return C(n-1,r-1)+ C(n-1,r);
        }
    }
    //Combination using memoizaton
    static int memC(int n,int r,int mem[][]){
        if(r==0||n==r){
            return 1;
        }else{
            if(mem[n-1][r-1]==-1){
                mem[n-1][r-1] =memC(n-1,r-1,mem);
                
            }
            if(mem[n-1][r]==-1){
                mem[n-1][r] = memC(n-1,r,mem);
            }
            return mem[n-1][r-1]+mem[n-1][r];

        }
    }
    public static void main(String[] args) {
        int n =6,r = 4;
        System.out.println(C(n,r));
        int mem[][] = new int[n+1][r+1];
        for(int i = 0;i<mem.length;i++){
            for(int j = 0;j<mem[i].length;j++){
                mem[i][j]=-1;
            }
        }
        System.out.println(memC(n,r,mem));
    } 
}
