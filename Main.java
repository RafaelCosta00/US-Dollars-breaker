//This program breaks down a value input into US dollars and coins.
//CCSF Class 111A
//Student Rafael Ferreira Costa
//Created on 06/11/2018
//Assignment 1
//Q3. Write a Java program to take the input of amount in Dollars, and then display
//the total number of $10, $1, $ 5, 50 cents, quarter, dime, and pennies which make up the total amount.
//For example :
//amount=157.86
//$ 10 =15
//$ 5 =5
//$ 1 =2
//50 cents =1
//Quarters= 1
//Dime=1
//Penny=1

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dollarsInput;
        double balance;
        int tenDollars = 10;
        int fiveDollars = 5;
        int oneDollar = 1;
        double fifthCents = 0.50;
        double quarterCents = 0.25;
        double dimeCents = 0.10;
        double nickelCents = 0.05;
        double pennyCents = 0.01;


        System.out.print("Please enter a value: ");
        dollarsInput = input.nextDouble();
        if(dollarsInput>0){
            System.out.println("Amount: " + dollarsInput);

            int dollars10 = (int) (dollarsInput/tenDollars);

            System.out.println("$10 = " + dollars10);

            balance = dollarsInput - (dollars10 * tenDollars);

            int dollars5 = (int) (balance/fiveDollars);
            System.out.println("$5 = " + dollars5);

            balance -= dollars5 * fiveDollars;

            int dollars1 = (int) (balance/oneDollar);
            System.out.println("$1 = " + dollars1);

            balance -= dollars1;

            int cents50 = (int) (balance/(fifthCents));
            System.out.println("50 cents = " + cents50);

            balance -= cents50 * fifthCents;

            int cents25 = (int) (balance/(quarterCents));
            System.out.println("Quarters = " + cents25);

            balance -= cents25 * quarterCents;

            int cents10 = (int) (balance/(dimeCents));
            System.out.println("Dime = " + cents10);

            balance -= cents10 * dimeCents;

            int cents05 = (int) (balance/(nickelCents));
            System.out.println("Nickel = " + cents05);

            balance -= cents05 * nickelCents;

            balance = (balance / pennyCents);
            System.out.println("Penny = " + (int) (balance));

        }else{
            System.out.println("Invalid input.");
        }
    }
}
