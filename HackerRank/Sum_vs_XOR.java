package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sum_vs_XOR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        List<Long> liN = new ArrayList<Long>();
        
        while (n > 1) {
            liN.add(n % 2);
            n = n / 2;
        }
        liN.add(n);
        int count = 0;
        for (Long loN : liN) {
            if (loN == 0) {
                count++;
            }
        }
        
        long result = 1;
        if (n != 0) {
            for (int i = 0; i < count; i++) {
                result *= 2;
            }
        }
        System.out.println(result);
    }
}