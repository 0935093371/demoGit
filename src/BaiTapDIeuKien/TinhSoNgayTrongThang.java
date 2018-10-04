
    package BaiTapDIeuKien;

import java.util.Scanner;

    public class TinhSoNgayTrongThang {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" nhap thang :");
            int thang = scanner.nextInt();
            switch ( thang ){
                case 2:
                    System.out.println(" tháng có 28 hoặc 29 ngày");break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(" tháng có 31 ngày");break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(" tháng có 30 ngày");break;
                default:
                    System.out.println(" tháng k hợp lệ");break;
            }
        }
    }