package lib.cat.chapter1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(greatest_common_devisor(num1, num2));
    }

    public static int greatest_common_devisor(int p, int q) {
        if(q == 0) {
            return p;
        }
        int r = p % q;
        return greatest_common_devisor(q, r);
    }
}
