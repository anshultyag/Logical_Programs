import java.util.Scanner;

public class Uc_03_prime_number {
    public static int primeNumber(int num) {
        int i = 1;
        while (i < num) {
            if (num % i == 0) {
                System.out.println("This is not a prime number");
                  break;
            } else {
                System.out.println("This is a prime number");
            }
            i++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter Your number :: ");
        int num = obj.nextInt();
        primeNumber(num);
    }
}
