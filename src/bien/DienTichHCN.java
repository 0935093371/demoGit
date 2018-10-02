package bien;

import java.util.Scanner;

public class DienTichHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu dai:");
        float chieudai = scanner.nextFloat();
        System.out.println("nhap vao chieu rong:");
        float chieurong = scanner.nextFloat();
        float dienTich = chieudai * chieurong ;
        System.out.println("dien tich:" +dienTich);
    }
}
