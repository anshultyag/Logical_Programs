import java.util.Scanner;

public class Uc_04_reverse_number {
    public static int reverseNumber(int num){
        int reverse=0;
        while(num!=0){
         int remainder = num % 10;
         reverse = num* 0 + remainder;
         num = num/10;
            System.out.print(remainder);
        }
        return num;
    }
    public static void main(String[] args) {
    Scanner obj =new Scanner(System.in);
        System.out.println("Enter your number :: ");
        int num=obj.nextInt();
        reverseNumber(num);

    }
}
