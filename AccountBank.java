package Secao09.AccountBankPOO;

import java.util.Scanner;
import java.util.Locale;

public class AccountBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        AccountBankMembers accountBankMembers = new AccountBankMembers();

        System.out.println("Enter a account number: ");
        accountBankMembers.setAccount(scan.nextInt());
        System.out.println("Enter a account holder: ");
        accountBankMembers.name = scan.next();
        System.out.println("Is there na initial deposit (y/n) ? ");
        accountBankMembers.answer = scan.next();
        if (accountBankMembers.answer.equals("y")){
            System.out.println("Enter a initial value: ");
            accountBankMembers.depositInitial = scan.nextDouble();
            System.out.println(accountBankMembers.toString());
            System.out.println("Enter a deposit value: ");
            accountBankMembers.deposit = scan.nextDouble();
            System.out.println(accountBankMembers.toString2());
            System.out.println("Enter a withdraw value: ");
            accountBankMembers.withdraw = scan.nextDouble();
            System.out.println(accountBankMembers.toString3());

        }else if (accountBankMembers.answer.equals("n")){
            System.out.println(accountBankMembers.toString5());
            System.out.println("Enter a deposit value: ");
            accountBankMembers.deposit = scan.nextDouble();
            System.out.println(accountBankMembers.toString2());
            System.out.println("Enter a withdraw value: ");
            accountBankMembers.withdraw = scan.nextDouble();
            System.out.println(accountBankMembers.toString6());
        }else System.out.println("Please, type it y or n.");
    }
}
