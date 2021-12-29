import java.util.Scanner;

public class Uc_02_Perfect_Number {
    public static int perfectNumber(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num / 2) {
            if (num % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == num) {
            System.out.println("This is a perfect number");
        } else {
            System.out.println("This is not a perfect number");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your number");
        int num = obj.nextInt();
        perfectNumber(num);
    }
}