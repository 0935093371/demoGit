package vongLap;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        double sotien, tilelaixuat;
        int sothang;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vap so tien :");
        sotien = scanner.nextDouble();
        System.out.println(" nhap vap ti le lai xuat :");
        tilelaixuat = scanner.nextDouble();
        System.out.println(" nhap vap so thang :");
        sothang = scanner.nextInt();
        double tonglaixuat = 0;
        for (int i = 0; i < sothang; i++) {
            tonglaixuat = sotien * (tilelaixuat / 100) / 12 * sothang;
        }
        System.out.println("so tien lai theo thang :" +tonglaixuat);
    }
}
