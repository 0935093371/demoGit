package bien;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ban kinh:");
        float bankinh = scanner.nextFloat();
        final double PI=3.14;
        double CV = bankinh * 2 * PI;
        System.out.println("chu vi hinh tron :" + CV);
        double DT = bankinh* bankinh *PI;
        System.out.println("chu vi hinh tron :" + DT);
    }
}
