package BaiTapDIeuKien;

import java.util.Scanner;

    public class PTB2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a, b, c;
            System.out.println("nhap he so a la:");
            a = scanner.nextInt();
            System.out.println("nhap he so b la:");
            b = scanner.nextInt();
            System.out.println("nhap he so c la:");
            c = scanner.nextInt();
            if (a == 0) {
                if (b == 0) {
                    System.out.println("phuong trinh vo nghiem");
                } else {
                    System.out.println("phuong trinh mot nghiem:" + (-c / b));
                }
            } else {
                if (b == 0) {
                    System.out.println("pt vo nghiem");
                } else {
                    double delta = b * b - 4 * a * c;
                    if (delta == 0) {
                        double x12 = (-b / (2 * a));
                        System.out.println("phuong trinh co nghiem kep:" + x12);
                    } else if (delta < 0) {
                        System.out.println("phuong trinh vo nghiem");
                    } else if (delta > 0) {
                        double f = Math.sqrt(delta);
                        System.out.println("pt co 2 nghiem phan biet:" + (-b + f) / 2 + (-b - f) / 2);

                    }
                }

            }
        }
    }