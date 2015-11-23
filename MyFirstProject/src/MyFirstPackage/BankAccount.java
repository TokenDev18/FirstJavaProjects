package MyFirstPackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by aaron on 10/16/15.
 */
public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountNumber;
    private double balance;
    private double withdrawAmount;
    private int pinNumber;
    private boolean authenticated = false;
    private BankAccount transferAccount;

    //Constructor area of the program
    public BankAccount(){

    }
    public BankAccount(String firstName, String lastName, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = 150.00;

    }
    public BankAccount(String firstName, String lastName, int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Printing out the arguments that are passed to objects of the BankAccount class.
    public void printAccountInfo() {
        System.out.println("Name on the account is " + this.firstName + " " + this.lastName + " "
                + "with the following account # " + this.accountNumber + " with balance of " + this.balance);
        }
    //Method to withdraw funds from the BankAccount
    public void withdraw(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
        //pinNumber = this.pinNumber;
        if (authenticated && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("New account balance after withdrawal of " + withdrawAmount + " is: " + balance);
        } else if(!authenticated) {
            System.out.println("You have entered an invalid pin number");
        } else {
            System.out.println("You have insufficient funds, cannot make withdrawal of: " + withdrawAmount);
            System.out.println("Current balance is: " + balance);
        }
    }
    //Method to deposit money into the Bank Account
    public void deposit(double depositAmount){
        if(authenticated){
            balance += depositAmount;
            System.out.println("Your new balance after deposit of " + depositAmount + " is: " + balance);
        }
    }
        //Method to Authenticate users
        public boolean authenticate(int pinNumber){
            if(pinNumber == this.pinNumber)){
                authenticated = true;
            } else {
                logout();
            }
            return false;
        }
    public void logout(){
            authenticated = false;
    }

    public void transfer(BankAccount transferAccount, int transferAmount){
        transferAccount.balance -= transferAmount;
        System.out.println("Account balance after transfer is: " + transferAccount.balance);
        balance += transferAmount;
        System.out.println("Account balance after receiving transfer is: " + balance);
    }

    //Setter area of the program
    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber; 
    }

    //Getter area of the program
    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getPinNumber(){
        if(this.pinNumber == 0){
            this.pinNumber = ThreadLocalRandom.current().nextInt(1000, 10000);
            setPinNumber(this.pinNumber);
        }

        return this.pinNumber;
    }
}
