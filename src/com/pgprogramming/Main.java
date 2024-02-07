package com.pgprogramming;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMOperationInterface op= new ATMOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!!!");
        System.out.println("Enter ATM Number: ");
        int atmNumber=in.nextInt();
        System.out.println("Enter Pin: ");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)) {
            while(true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.DepositAmount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter the choice: ");
                int ch = in.nextInt();
                if (ch == 1) {
                    op.viewBalance();

                }
                else if (ch == 2) {
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if (ch == 3) {
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if (ch == 4) {
                    op.viewMiniStatement();
                }
                else if (ch == 5) {
                    System.out.println("Collect your respective ATM Card\n Thank you for ATM Machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter a correct choice");
                }
            }
        }
        else{
            System.out.println("Entered ATM Number or pin is incorrect");
            System.exit(0);
        }
    }
}
