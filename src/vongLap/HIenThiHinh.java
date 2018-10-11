package vongLap;

public class HIenThiHinh {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++)
                System.out.print("*");
            System.out.println("");
        }
        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= k; l++)
                System.out.print("*");
            System.out.println("");
        }
        for (int m = 5; m >= 1; m--) {
            for (int n = 1; n <= m; n++)
                System.out.print("*");
            System.out.println("");
        }
    }
}