
    package BaiTapDIeuKien;
import java.util.Scanner;
    public class TinhLuongNhanVien {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("he so luong la:");
            int hesoluong = scanner.nextInt();
            if(hesoluong <1){
                System.out.println("loi");
            } else if (hesoluong >5) {
                System.out.println("loi");
            }else{
                System.out.println("he so luong la:" +hesoluong);
            }
            System.out.println(" nam lam viec:");
            int namlamviec = scanner.nextInt();
            int luongthang = hesoluong * 4000000 + namlamviec * 500000;
            System.out.println(" luong nhan vien:" + luongthang);
        }
    }

