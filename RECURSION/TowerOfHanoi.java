public class TowerOfHanoi {
    static void Hanoi(int n,char A,char B,char C){
        if(n>0){
            Hanoi(n-1,A,C,B);
            System.out.println("From tower "+(char)A+ " to tower "+(char)C);
            Hanoi(n-1,B,A,C);
        }
    }
   public static void main(String[] args) {
       int n =3;
       Hanoi(n,'A','B','C');
   } 
}
