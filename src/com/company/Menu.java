package com.company;
import java.util.*;
public class Menu {

        public static int showFirstMenu() {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("|                     WELCOME TO TAX CALCULATOR                         |");
            System.out.println("------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println("\t [01]. Withholding Tax");
            System.out.println("\t [02]. Payable Tax");
            System.out.println("\t [03]. Income Tax");
            System.out.println("\t [04]. Social Security Contribution Levy (SSCL) Tax");
            System.out.println("\t [05]. Leasing Payment");
            System.out.println();
            System.out.println();
            System.out.println("Enter an option to continue >");
            Scanner input=new Scanner(System.in);
            int input01;
            input01=input.nextInt();

            return input01;
        }

    public static int WithholdingMenu() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             WITHHOLDING TAX                          |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("\t [01]. Rent Tax");
        System.out.println("\t [02]. Bank Interest Tax");
        System.out.println("\t [03]. Dividend Tax");
        System.out.println();
        System.out.println();
        System.out.println("Enter an option to continue >");
        Scanner input=new Scanner(System.in);
        int input02;
        input02=input.nextInt();

        return input02;
    }

    public static void RentTaxMenu() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             RENT TAX                          |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        while(true) {
            System.out.println("Enter your rent :");
            Scanner input = new Scanner(System.in);
            int rent;
            int renttax;
            rent = input.nextInt();
            String ch ="Y";
            if (rent > 100000) {
                renttax = (rent - 100000) * 10 / 100;
                System.out.println("You have to pay Rent Tax:" + renttax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            } else if ((0 < rent) && (rent <= 100000)) {

                System.out.println("You don’t have to pay Rent Tax...");
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();


            }
            else {

                System.out.println("Invalid Input... Enter the correct value again...");
            }

            if(ch.equals("N")){
                break;
            }



        }
    }

    public static void BankInterestTaxMenu() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                          BANK INTEREST TAX                          |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        while(true) {
            System.out.println("Enter your bank interest per year :");
            Scanner input = new Scanner(System.in);
            int interest;
            int interesttax;
            interest = input.nextInt();
            String ch ="Y";
            if (interest > 0) {
                interesttax = interest * 15 / 100;
                System.out.println("You have to pay Rent Tax:" + interesttax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else {

                System.out.println("Invalid Input... Enter the correct value again...");
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }

            if(ch.equals("N")){
                break;
            }

        }
    }


    public static void DivindendTaxMenu() {

            System.out.println("------------------------------------------------------------------------");
            System.out.println("|                             DIVIDEND TAX                          |");
            System.out.println("------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
            while(true) {
                System.out.println("Enter your dividend :");
                Scanner input = new Scanner(System.in);
                int dividend;
                int dividendtax;
                dividend= input.nextInt();
                String ch ="Y";
                if (dividend > 100000) {
                    dividendtax = (dividend - 100000) * 14 / 100;
                    System.out.println("You have to pay Rent Tax:" + dividendtax);
                    System.out.println("Do you want to calculate another rent tax(Y/N):");
                    ch = input.next();
                } else if ((0 <dividend) && (dividend <= 100000)) {

                    System.out.println("You don’t have to pay Dividend Tax...");
                    System.out.println("Do you want to calculate another rent tax(Y/N):");
                    ch = input.next();


                }
                else {

                    System.out.println("Invalid Input... Enter the correct value again...");
                }

                if(ch.equals("N")){
                    break;
                }



            }
        }



    public static void PayableTaxMenu() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             PAYABLE TAX                          |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        while(true) {
            System.out.println("Enter your employee payment per month :");
            Scanner input = new Scanner(System.in);
            int payment;
            int payabletax;
            payment = input.nextInt();
            String ch ="Y";

            if ((0 < payment) && (payment <= 100000)) {

                System.out.println("You don’t have to pay payable Tax...");
                System.out.println("Do you want to calculate another payable tax(Y/N):");
                ch = input.next();
            }
            else if ((100000<payment)&&(payment<141667)) {
                payabletax = (payment - 100000) * 6 / 100;
            System.out.println("You have to pay payable Tax:" + payabletax);
            System.out.println("Do you want to calculate another payable tax(Y/N):");
            ch = input.next();
            }
            else if ((141667<payment)&&(payment<=183333)) {
                payabletax = (payment - 100000) * 6 / 100;
                payabletax += (payment - 141667) * 12 / 100;
                System.out.println("You have to pay payable Tax:" + payabletax);
                System.out.println("Do you want to calculate another payable tax(Y/N):");
                ch = input.next();
            }
            else if ((183333<payment)&&(payment<=225000)) {
                payabletax = (payment - 100000) * 6 / 100;
                payabletax += (payment - 141667) * 12 / 100;
                payabletax += (payment - 183333) * 18 / 100;
                System.out.println("You have to pay payable Tax:" + payabletax);
                System.out.println("Do you want to calculate another payable tax(Y/N):");
                ch = input.next();
            }
            else if ((225000<payment)&&(payment<= 266667)) {
                payabletax = (payment - 100000) * 6 / 100;
                payabletax += (payment - 141667) * 12 / 100;
                payabletax += (payment - 183333) * 18 / 100;
                payabletax += (payment - 225000) * 24 / 100;
                System.out.println("You have to pay payable Tax:" + payabletax);
                System.out.println("Do you want to calculate another payable tax(Y/N):");
                ch = input.next();
            }
            else if ((266667<payment)&&(payment<= 308333)){
                payabletax = (payment - 100000) * 6 / 100;
                payabletax += (payment - 141667) * 12 / 100;
                payabletax += (payment - 183333) * 18 / 100;
                payabletax += (payment - 225000) * 24 / 100;
                payabletax += (payment - 266667) * 30 / 100;
                System.out.println("You have to pay payable Tax:" + payabletax);
                System.out.println("Do you want to calculate another payable tax(Y/N):");
                ch = input.next();
            }
            else if (308333<payment) {
                payabletax = (payment - 100000) * 6 / 100;
                payabletax += (payment - 141667) * 12 / 100;
                payabletax += (payment - 183333) * 18 / 100;
                payabletax += (payment - 225000) * 24 / 100;
                payabletax += (payment - 266667) * 30 / 100;
                payabletax += (payment - 308333) * 36 / 100;
                System.out.println("You have to pay payable Tax:" + payabletax);
                System.out.println("Do you want to calculate another payable tax(Y/N):");
                ch = input.next();
            }
            else {

                System.out.println("Invalid Input... Enter the correct value again...");
                System.out.println("Do you want to calculate another payable tax(Y/N):");
                ch = input.next();
            }

            if(ch.equals("N")){
                break;
            }



        }
    }

    public static void IncomeTaxMenu() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                             INCOME TAX                          |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        while(true) {
            System.out.println("Enter your total income per month :");
            Scanner input = new Scanner(System.in);
            int income;
            int incometax;
            income = input.nextInt();
            String ch ="Y";

            if ((0 < income) && (income <= 1200000)) {

                System.out.println("You don’t have to pay Rent Tax...");
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else if ((1200000<income)&&(income<1700000)) {
                incometax = (income - 1200000) * 6 / 100;
                System.out.println("You have to pay Rent Tax:" + incometax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else if ((1700000<income)&&(income<= 2200000)) {
                incometax = (income - 1200000) * 6 / 100;
                incometax += (income - 1700000) * 12 / 100;
                System.out.println("You have to pay Rent Tax:" + incometax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else if ((2200000 <income)&&(income<= 2700000)) {
                incometax = (income - 1200000) * 6 / 100;
                incometax += (income - 1700000) * 12 / 100;
                incometax += (income - 2200000) * 18 / 100;
                System.out.println("You have to pay Rent Tax:" + incometax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else if ((2700000<income)&&(income<=  3200000)) {
                incometax = (income - 1200000) * 6 / 100;
                incometax += (income - 1700000) * 12 / 100;
                incometax += (income - 2200000) * 18 / 100;
                incometax += (income - 2700000) * 24 / 100;
                System.out.println("You have to pay Rent Tax:" + incometax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else if ((3200000<income)&&(income<=  3700000)){
                incometax = (income - 1200000) * 6 / 100;
                incometax += (income - 1700000) * 12 / 100;
                incometax += (income - 2200000) * 18 / 100;
                incometax += (income - 2700000) * 24 / 100;
                incometax += (income - 3200000) * 30 / 100;

                System.out.println("You have to pay Rent Tax:" + incometax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else if (308333<income) {
                incometax = (income - 1200000) * 6 / 100;
                incometax += (income - 1700000) * 12 / 100;
                incometax += (income - 2200000) * 18 / 100;
                incometax += (income - 2700000) * 24 / 100;
                incometax += (income - 3200000) * 30 / 100;
                incometax += (income - 3700000) * 36 / 100;
                System.out.println("You have to pay Rent Tax:" + incometax);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }
            else {

                System.out.println("Invalid Input... Enter the correct value again...");
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            }

            if(ch.equals("N")){
                break;
            }



        }
    }


    public static void SSCLTaxMenu() {

        System.out.println("------------------------------------------------------------------------");
        System.out.println("|       SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                          |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        while(true) {
            System.out.println("Enter value of good or service :");
            Scanner input = new Scanner(System.in);
            double val;
            double saletax, VAT, SSCL;
            val = input.nextInt();
            String ch = "Y";
            if (val > 0) {
                saletax = (val * 2.5 / 100);
                VAT = (val + saletax) * 15 / 100;
                SSCL = VAT + saletax;
                System.out.println("You have to pay SSCL Tax:" + SSCL);
                System.out.println("Do you want to calculate another rent tax(Y/N):");
                ch = input.next();
            } else {

                System.out.println("Invalid Input... Enter the correct value again...");
            }

            if (ch.equals("N")) {
                break;
            }

        }



        }


    public static int LeasingMenu(){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("|                     LEASING PAYMENT                         |");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("\t [01]. Calculate Monthly Installment");
        System.out.println("\t [02]. Search Leasing Category");
        System.out.println("\t [03]. Find Leasing category");
        System.out.println("\t [04]. Exit");

        System.out.println();
        System.out.println();
        System.out.println("Enter an option to continue >");
        Scanner input=new Scanner(System.in);
        int input01;
        input01=input.nextInt();

        return input01;
    }



    }
































