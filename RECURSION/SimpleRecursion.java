public class SimpleRecursion{
    /*
            func1(3)
            /   \
            3   func1(2)
                /  \
               2    func1(1)
                    /   \
                   1    func1(0)
                            |
                            x
     */
    static void func1(int x){
        if(x>0){
            System.out.println(x);
            func1(x-1);
        }
    }
    static void func2(int x){
        if(x>0){
            func2(x-1);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        System.out.println("This recursion prints first, calls and returns");
        func1(3);
        System.out.println("This recursion calls first, while returning prints");
        func2(3);
    }
}