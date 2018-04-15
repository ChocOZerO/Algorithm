package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No10801 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int check = 0;
        Scanner scan = new Scanner(System.in);
        while (check < 10) {
            a[check] = scan.nextInt();
            if (a[check] > 0 && a[check] < 11) {
                check++;
            }
        }
        check = 0;
        while (check < 10) {
            b[check] = scan.nextInt();
            if (b[check] > 0 && b[check] < 11) {
                check++;
            }
        }
        
        String[] c = new String[10];
        for (int i = 0; i<10; i++) {
            if (a[i] > b[i]) {
                c[i] = "A";
            } else if (a[i] < b[i]) {
                c[i] = "B";
            } else {
                c[i] = "D";
            }
        }
        int count = 0;
        for (int i = 0; i < 10 ; i++) {
            if ("A".equals(c[i])) {
                count++;
            } else if ("B".equals(c[i])) {
                count--;
            }
        }
        String result = "D";
        if (count > 0) {
            result = "A";
        } else if (count < 0) {
            result = "B";
        }
        System.out.println(result);
    }
}