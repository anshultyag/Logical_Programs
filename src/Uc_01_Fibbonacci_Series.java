import java.util.Scanner;

public class Uc_01_Fibbonacci_Series {
    public static int series(int num) {                     //  int series(int num) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(n1 + ",");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n1;}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int num = sc.nextInt();
        series(num);
        // Uc_01_Fibonacci_Series obj = new Uc_01_Fibonacci_Series();
        // int c=obj.series(num);
        //System.out.println(c);
    }
}
