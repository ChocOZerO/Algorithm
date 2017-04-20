package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No10798 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] input = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextLine();
            if (input[i].length()>15) {
                System.out.println("Input length has to be under 15");
                i--;
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < input.length; i++) {
                if (j < input[i].length()) {
                    sb.append(input[i].charAt(j));
                }
            }
        }
        System.out.println(sb);       
    }
    
}