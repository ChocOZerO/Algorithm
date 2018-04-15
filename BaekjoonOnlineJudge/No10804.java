package BaekjoonOnlineJudge;

import java.io.*;
import java.util.*;

public class No10804 {
    public static void main(String[] args) throws IOException {
        int[] card = new int[20];
        for (int i = 0; i < 20; i++) {
            card[i] = i +1;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] temp = new int[2];
        
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine()," ");
            temp[0] = Integer.parseInt(st.nextToken());
            temp[1] = Integer.parseInt(st.nextToken());
            int[] cardTemp = new int[temp[1]-temp[0]+1];
            for (int j = (temp[0]-1); j < temp[1]; j++) {
                cardTemp[j-(temp[0]-1)] = card[j];
            }
            for (int j = (temp[0]-1); j < temp[1]; j++) {
                card[j] = cardTemp[temp[1]-j-1];
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(card[i] + " ");
        }
    }
}