package BaiTapDIeuKien;

import java.util.Scanner;

public class KIemTraNamNhuan {
        public static void main ( String args []){
            Scanner scanner =  new Scanner (System.in);
            System.out.println( " nhap nam:");
            int nam = scanner.nextInt();
            if( nam%4==0 && nam%100!=0){
                System.out.println( " nam nhuan");
            } else if (nam % 100 == 0 && nam % 400 != 0) {
                System.out.println(" khong phai nam nhuan");
            } else if (nam % 100 == 0 && nam % 400 == 0) {
                System.out.println(" nam nhuan");
            }
        }
    }
