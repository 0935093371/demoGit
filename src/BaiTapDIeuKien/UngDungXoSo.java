package BaiTapDIeuKien;

import java.util.Scanner;
public class UngDungXoSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giaithuong = 17, sodau, socuoi;
        System.out.println(" nhap vao so dau:");
        sodau = scanner.nextInt();
        System.out.println(" nhap vao so cuoi:");
        socuoi = scanner.nextInt();
        int veso = sodau * 10 + socuoi;
        System.out.println(" ket qua la:" + veso);
        if (veso == giaithuong) {
            System.out.println(" ban da trung doc dac va phan thuong cua ban la: 10000$");
        } else {
            int ketqua1 = veso % 10;
            int ketqua2 = veso / 10;
            int ketquadung = ketqua1 * 10 + ketqua2;
            if (ketquadung == giaithuong) {
                System.out.println(" ban da trung duoc giai nhi va phan thuong cua ban la: 3000$");
            } else {
                System.out.println("nhap vao 1 so:");
                int ketquaveso = scanner.nextInt();
                if ((ketquaveso == sodau & ketquaveso != socuoi) || (ketquaveso == socuoi & ketquaveso != sodau)) {
                    System.out.println(" ban da trung duoc 1 so trong giai thuong va phan thuong cua ban la: 1000$");
                }
            }
        }
    }
}
