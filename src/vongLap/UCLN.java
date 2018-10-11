package vongLap;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao a:");
        int a = scanner.nextInt();
        System.out.println(" nhap vao b:");
        int b = scanner.nextInt();
        if (a == 0 || b == 0) {
            System.out.println(" k co UCLN");
        } else if ((a == 0 & b != 0)) {
            b = Math.abs(b);
            System.out.println("co UCLN la : " + b);
        } else if ((a != 0 & b == 0)) {
            a = Math.abs(a);
            System.out.println("co UCLN la : " + a);
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            System.out.println(" UCLN la:" + a);
        }
    }
}