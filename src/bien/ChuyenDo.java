package bien;

import java.util.Scanner;
public class ChuyenDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao doF:");
        float F = scanner.nextFloat();
        float doC = 5* (F-32)/9;
        System.out.println("Do C la:" +doC);
    }
}
