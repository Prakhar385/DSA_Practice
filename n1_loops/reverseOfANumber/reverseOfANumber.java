package n1_loops.reverseOfANumber;

import java.util.Scanner;

public class reverseOfANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int num2 = num;
        int rev_num = 0;

        while (num2 > 0) {
            rev_num = (10 * rev_num) + (num2 % 10);
            num2 /= 10;
        }

        System.out.println("Reverse of " + num + " is " + rev_num);
        sc.close();
    }
}