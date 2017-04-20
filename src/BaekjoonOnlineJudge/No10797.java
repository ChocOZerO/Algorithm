package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No10797 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int check = 0;
        int inCount = 0;
        int[] inCarNo = new int[5];
        
        Scanner sc = new Scanner(System.in);
        inCount = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            inCarNo[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            if (inCarNo[i] == inCount) {
                check++;
            }
        }
        System.out.println(check);
    }

}