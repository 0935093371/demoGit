package BaiTapDIeuKien;

import java.util.Scanner;

public class PTB1 {
        public static void main( String args []){
            Scanner scanner = new Scanner ( System.in);
            double a,b,c ;
            System.out.println(" nhap a:");
            a = scanner.nextDouble();
            System.out.println(" nhap b:");
            b = scanner.nextDouble();
            if ( a!=0){
                double x = (-b/a);
                System.out.println(" nghiem cua phuong trinh la:" +x);
            } else {
                if ( b ==0 ){
                    System.out.println(" phuong trinh vo so nghiem");
                } else {
                    System.out.println(" phuong trinh vô nghiem");
                }
            }
        }
    }

