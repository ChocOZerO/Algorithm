package HackerRank;

import java.util.Scanner;

public class Day01_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int iPut;
        double dPut;
        String strPut;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        iPut = Integer.parseInt(scan.nextLine());
        dPut = Double.parseDouble(scan.nextLine());
        strPut = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+iPut);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+dPut);
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        System.out.println(s+strPut);
        
        scan.close();
    }
}
