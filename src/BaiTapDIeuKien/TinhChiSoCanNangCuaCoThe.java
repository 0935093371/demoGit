package BaiTapDIeuKien;

import java.util.Scanner;

public class TinhChiSoCanNangCuaCoThe {
        public static void main(String args[]) {
            float cannang, chieucao;
            Scanner scanner = new Scanner(System.in);
            System.out.println(" nhap cannang:");
            cannang = scanner.nextFloat();
            System.out.println(" nhap chieucao:");
            chieucao = scanner.nextFloat();
            float BMI = cannang / (chieucao * chieucao);
            System.out.println(" chi so BMI:" +BMI);
            if (BMI < 18.5) {
                System.out.println(" underweight");
            } else if (BMI < 25) {
                System.out.println(" normal");
            } else if (BMI < 30) {
                System.out.println(" overweight");
            } else if (BMI >= 30) {
                System.out.println(" ovese");
            }
        }
    }
