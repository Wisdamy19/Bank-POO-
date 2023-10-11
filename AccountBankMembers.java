package Secao09.AccountBankPOO;

public class AccountBankMembers {
    private int account;
    public String name;
    public double depositInitial;
    public double deposit;
    public double withdraw;
    public double balance = 00.00;

    public int setAccount(int account) {
        this.account = account;
        return account;
    }
    public int getAccount(){
        return account;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public double addDeposit(){
        return depositInitial += deposit;
    }
    public double withdrawValue(){
        return  depositInitial - withdraw;
    }
    public double taxValue(){
        return withdrawValue() - 5.00f;
    }
    public double negativeValue(){
        return (deposit - withdraw - 5.00f);
    }
    public String toString(){
        return "Account Data: " + this.getAccount() + ", " + "Holder: " + this.getName() + ", " + "Balance: " + "$" + this.depositInitial;
    }
    public String toString2(){
        return "Account Data: " + this.getAccount() + ", " + "Holder: " + this.getName() + ", " + "Balance: " + "$" + addDeposit();
    }
    public String toString3(){
        return "Account Data: " + this.getAccount() + ", " + "Holder: " + this.getName() + ", " + "Balance: " + "$" + taxValue();
    }
    public String toString4(){
        return "Updated account data: %n" + this.getAccount() + ", " + "Holder: " + this.name + ", " + "Balance: " + "$" + addDeposit();
    }
    public String toString5(){
        return "Updated account data: " + this.getAccount() + ", " + "Holder: " + this.name + ", " + "Balance: " + "$" + getBalance();
    }
    public String toString6(){
        return "Updated account data: " + this.getAccount() + ", " + "Holder: " + this.name + ", " + "Balance: " + "$" + negativeValue();
    }
}
