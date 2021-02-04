/*
                        fun(3)
                    /      |                   \
                   /       |                    \
                  3        f(2)                 f(2)
                       /    |    \             /  |         \ 
                      2   f(1)    f(1)        2  f(1)       f(1)

                    /     |   \   / |  \        /  |  \     /  |  \
                    1   f(0) f(0) 1 f(0) f(0)   1 f(0)f(0) 1 f(0)f(0)
                        |     |       |   |        |    |     |    |
                        x     x       x   x        x    x     x    x
 */
public class TreeRecursion {
    public static void treeRecur(int n){
        if(n>0){
        System.out.println(n);
        treeRecur(n-1);
        treeRecur(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        treeRecur(n);
    }
}
