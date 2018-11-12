package com.codegym;

import java.util.Scanner;

//Day1
public class Day1 {

    public static void main(String[] args) {
//        //Villa
//        int soLuongVilla;
//        int soLuongGiuongVilla;
//        int thoiGianThueVilla;
//        int soTienThueVilla;
//        //House
//        int soLuongNha;
//        int soLuongGiuongNha;
//        int thoiGianThueNha;
//        int soTienThueNha;
//        //HoBoi
//        int soLuongHoBoi;
//        int thoiGianMoHoBoi;
//        //KhachThue
//        String hoVaTen;
//        int doTuoi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten:");
        String hoVaTen = scanner.nextLine();
        System.out.println("Nhap vao tuoi:");
        int doTuoi = scanner.nextInt();
        System.out.println("Nhap vao loai phong:" +
                "1.Villa, " +
                "2.House, " +
                "3.Thoat.");
        System.out.println("Nen chon loai phong nao:");
        int luaChon = scanner.nextInt();
        switch (luaChon) {
            case 1:
                viLla();
                System.out.println("------------------------------------------------------");
                System.out.println("ten khach hang :" + hoVaTen + "\n so tuoi :" + doTuoi);
                break;
            case 2:
                house();
                System.out.println("------------------------------------------------------");
                System.out.println("ten khach hang :" + hoVaTen + "\n so tuoi:" + doTuoi);
                break;
            case 3:
                System.out.println("thoat");
                break;
        }
        System.out.println("-----------------------------------------------------");
        hoBoi();

    }

    private static void hoBoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n gio khach den:");
        int gioKhachDen = scanner.nextInt();
        if (gioKhachDen <= 8) {
            System.out.println("ho boi chua mo cua. vui long doi den 9h");
            return;
        } else if (gioKhachDen > 8) {
            System.out.println("moi khach vao");
        }
        System.out.println("so tien khach mang theo :");
        int soTienMangTheo = scanner.nextInt();
        soTienKhachMangTheo(soTienMangTheo);
    }

    private static void viLla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Một cái Villa thì có 1 cái giường. Nếu Khách có thuê cái Villa thì phải trả tiền 1 ngày là 10 USD. ");
        System.out.println("thue bao nhieu cai villa :");
        int villa = scanner.nextInt();
        int tinhTien = villa * 10;
        System.out.println("tien ban phai tra khi thue " + villa + "cai villa la: " + tinhTien);
    }

    private static void house() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Một cái House thì có 4 cái giường. Nếu khách có thuê cái House 1 ngày thì trả tiền 1 ngày là 5 USD. ");
        System.out.println("thue bao nhieu cai house :");
        int house = scanner.nextInt();
        int tinhTien = house * 5;
        System.out.println("tien ban phai tra khi thue " + house + "cai house la:" + tinhTien);
    }

    public static void soTienKhachMangTheo(int tien) {
        int soNgayO = tien / 10;
        System.out.println("vay o duoc trong villa:" + soNgayO);
    }
}