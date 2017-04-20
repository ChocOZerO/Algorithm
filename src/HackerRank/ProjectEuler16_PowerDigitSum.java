package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;
public class ProjectEuler16_PowerDigitSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = 0;
        BigInteger res = new BigInteger("1");
        int sum = 0;
        String ans = "";
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                res = res.multiply(new BigInteger("2"));
            }
            ans = String.valueOf(res);
            for (int j = 0; j < ans.length(); j++) {
                sum += Integer.parseInt(String.valueOf(ans.charAt(j)));
            }
            System.out.println(sum);
            ans = "";
            sum = 0;
            res = new BigInteger("1");
        }
        
    }
}