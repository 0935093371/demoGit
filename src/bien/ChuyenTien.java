package bien;

import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so USD:");
        int USD = scanner.nextInt();
        int soTienVNDong =USD * 23000;
        System.out.println("tien USD:"+soTienVNDong);
    }
}
