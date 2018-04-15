package BaekjoonOnlineJudge;

import java.util.Scanner;

public class No7567 {
    
    public static void main(String[] args) {
        int totSum = 0;
        String input = "";
        
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        
        if (input.length() < 3 && input.length()>50) {
           System.out.println("Out of Length Condition");
        } else {
            char[] chArray = input.toCharArray();
            char chCheck = '(';
            for (int i = 0; i < chArray.length; i++) {
                if (i == 0) {
                    totSum += 10;
                } else {
                    if (chArray[i] != chCheck) {
                        totSum += 10;
                    } else {
                        totSum += 5;
                    }
                }
                chCheck = chArray[i];
            }
            System.out.println(totSum);
        }

    }

}