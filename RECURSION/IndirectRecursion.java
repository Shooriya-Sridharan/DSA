/*
                    funA(20)
                    /    \
                   20    funB(19)
                        /     \
                       19    funA(9)
                             /    \
                            9    funB(8)
                                 /    \
                                8     funA(4)
                                      /    \
                                     4     funB(3)
                                            /   \
                                           3    funA(1)
                                                /    \
                                               1    funB(0)
                                                      |
                                                      x
*/
public class IndirectRecursion {
    static void funA(int n){
        if(n>0){
        System.out.println(n);
        funB(n-1);
        }
    }
    static void funB(int n){
        if(n>0){
        System.out.println(n);
        funA(n/2);
        }
    }
    public static void main(String[] args) {
        funA(20);
    }
}
