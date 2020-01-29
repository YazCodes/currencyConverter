package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        double amount, dollar, pound, code, singaporeDollar;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, Welcome to Yasmin's Currency Converter!");
        System.out.println("which currency would you like to convert?");

        System.out.println("1:Dollar \t2:Pound \t3: Singapore Dollar");
        code=sc.nextInt();

        System.out.println("How much money would you like to convert?");
        amount = sc.nextFloat();

        //Converting Dollars

        if (code == 1) {

            singaporeDollar = amount * 1.36095;
            System.out.println(amount + "  " + "dollars is" + "  " + f.format(singaporeDollar) + "  " + "Singapore Dollars");

            pound = amount * 0.768669;
            System.out.println(amount + "  " + "dollars is" + "  " + f.format(pound) + "  " + "pounds, you're saving 8x more with TransferWise than leading UK high street banks!");


        } else if (code == 2) {
            //converting into pounds

            dollar = amount * 1.30105;
            System.out.println(amount + "  " + "pounds is" + "  " + f.format(dollar) + "  " + "dollars");

            singaporeDollar = amount * 1.77087;
            System.out.println(amount + "  " + "pounds is" + "  " + f.format(dollar) + "  " + "Singapore dollars, you're saving 8x more with TransferWise than leading UK high street banks!");

        } else if (code == 3) {
            // converting into Singapore dollars

            dollar = amount * 0.734727;
            System.out.println(amount + "  " + "pounds is" + "  " + f.format(dollar) + "  " + "dollars");

            pound = amount * 0.564653;
            System.out.println(amount + "  " + "dollars is" + "  " + f.format(pound) + "  " + "pounds, you're saving 8x more with TransferWise than leading UK high street banks!");

        } else System.out.println("invalid input, please try again"); }

}




