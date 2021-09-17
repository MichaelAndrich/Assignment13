/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Michael Andrich
 */
/*

    prompt user for principle amount of money
    prompt user for the roi
    prompt user for length in years
    prompt user for the amount of times the interest is compounded per year
    output the principle ad how much money was made on return


 */


import java.util.Scanner;

public class solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the principle amount? ");
        String num1 = sc.nextLine();
        int P = Integer.parseInt("" + num1);

        System.out.println("What is the rate? ");
        String num2 = sc.nextLine();
        float r = Float.parseFloat("" + num2);


        System.out.println("What is the number of years? ");
        String num3 = sc.nextLine();
        int t = Integer.parseInt("" + num3);

        System.out.println("What is the number of times the interest is compounded per year? ");
        String num4 = sc.nextLine();
        int n = Integer.parseInt("" +num4);

        double A = (P * Math.pow(1 + (r/100/n) , (n * t)));

        System.out.println("$"+(P)+" invested at "+(r)+ "% for "+(t)+ " years compounded "+(n)+ " times per year is $"+(A)+"");
    }

}