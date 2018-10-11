package vongLap;

import java.util.Scanner;

public class KTSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao 1 so:");
        int so = scanner.nextInt();
        if (so == 0 || so == 1) {
            System.out.println(" k la so nguyen to");
        }else{
        int i = 2;
        boolean check = true;
        while (i <= Math.sqrt(so)) {
            if (so % i == 0) {
                check = false;
                break;
            }
            i++;
            if (check) {
                System.out.println(" day la so nguyen to ");
            } else {
                System.out.println(" day k la so nguyen to ");
            }
        }
    }
}
}
