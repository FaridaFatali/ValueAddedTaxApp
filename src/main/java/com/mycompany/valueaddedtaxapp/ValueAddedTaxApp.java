package com.mycompany.valueaddedtaxapp;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=huh4Z_AJ5qY&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=3&t=333s
 * @author Farida Fatali
 */

/*
Program that calculates the VAT price and VAT amount of the amount received from the user and prints it on the screen.
If the entered amount is between 0 and 500, the VAT rate is 18%, and if the amount is greater than 500, the VAT rate is 8%.
*/

public class ValueAddedTaxApp {

    public static void main(String[] args) {
        
// method 1
	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        double percentage;
        double vatRate;
        
        if(amount <= 500){
            percentage = 18;
            System.out.println("VAT percentage: %" + (int)percentage);
        
            vatRate = amount * (percentage / 100);
            System.out.println("VAT rate: " + vatRate);
        } else {
            percentage = 8;
            System.out.println("VAT percentage: %" + (int)percentage);
        
            vatRate = amount * (percentage / 100);
            System.out.println("VAT rate: " + vatRate);
        }
        
        double valueAddedTax = amount + vatRate;
        System.out.println("VAT amount: " + valueAddedTax);
        
        
        System.out.println();
        
        
// method 2        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        int amount1 = scan.nextInt();
        double percentage1;
        double vatRate1;
        
        if(amount1 <= 500){
            percentage1 = 0.18;
            vatRate1 = amount1 * percentage1;
            
            System.out.println("Vat percentage: %" + (int)vatRate1);
            System.out.println("VAT rate: " + vatRate1);
        } else {
            percentage1 = 0.08;
            vatRate1 = amount1 * percentage1;
            
            System.out.println("Vat percentage: %" + (amount1 * percentage1));
            System.out.println("VAT rate: " + vatRate1);
        }
        
	double valueAddedTax1 = amount1 + vatRate1;
	System.out.println("VAT amount: " + valueAddedTax1);
		
        System.out.println();
        
// method 3
        Scanner sc = new Scanner(System.in);
        double price, total, vatPrice, rate;
        
        System.out.print("Enter the amount: ");
        price = sc.nextDouble();
        
        if(price <= 500){
            rate = 18;
            System.out.println("VAT rate: %" + (int)rate);
            vatPrice = price * (rate / 100);
            System.out.println("VAT price: " + vatPrice);
        } else {
            rate = 8;
            System.out.println("VAT rate: %" + (int)rate);
            vatPrice = price * (rate / 100);
            System.out.println("VAT price: " + vatPrice);
        }
        
        total = vatPrice + price;
         System.out.println("VAT amount: " + total);
    }
}
