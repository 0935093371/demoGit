package com.codegym;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongVilla;
        do {
            System.out.print("Nhập số lượng villa: ");
            soLuongVilla = scanner.nextInt();
            if (soLuongVilla > 0) break;
            else System.out.println("Ko hop le! Nhap lai");
        } while (true);
        int[][] viLla = new int[2][soLuongVilla];
        for (int i = 0; i < viLla.length; i++) {
            System.out.print("Nhập số giường: ");
            viLla[0][i] = scanner.nextInt();
            System.out.print("Nhập hồ bơi: ");
            viLla[1][i] = scanner.nextInt();
        }
        for (int i = 0; i < viLla.length; i++) {
            System.out.print("số giường: " + viLla[0][i]);
            System.out.println("\t________số hồ bơi: " + viLla[1][i]);
        }
    }
}


