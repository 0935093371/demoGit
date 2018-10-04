package vongLap;

public class BaiHoc {
    public static void main(String[] args) {
        int so = 1;
        for (int i = 1; i <=11; i++) {
            System.out.println("hien thi ra man hinh:" + so);
            if (i == 6) {
                so = so*2;
                continue;
            }
            so = so + i;
        }
        int i = 0;
        do {
            i++;
            if (i == 4) {
                break;
            }
            System.out.println("show i" + i);
        } while (i < 10);
        int j = 0;
        while (j < 10) {
            j++;
            if (j == 4) {
                continue;
            }
            System.out.println("show j" + j);
        }
        for (int k = 0; k < 10; k++) {
            if (k == 2) {
                continue;
            } else if (k == 3) {
                break;
            }
            System.out.println("show k" + k);
        }
        int m,n;
        for(m=0;m<=5;m++) {
            for (n = 1; n <= 6 - m; n++)
                System.out.print("*");
            System.out.println("");
        }
    }
}