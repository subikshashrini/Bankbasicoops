/*Create a class named "SavingsAccount" with a static data member named "annualInterestRate" to store the annual interest rate for each saver.
    Each member of the class should have a private data member "savingsBalance" indicating the amount the saver currently has on deposit. 
    Implement a member function named "calculateMonthlyInterest" that calculates the monthly interest by multiplying the balance by the 
    annualInterestRate divided by 12, and adds this interest to the savingsBalance. Provide a static member function
    named "modifyInterestRate" that sets the static annualInterestRate to a new value. 
    Write a driver program to test the class "SavingsAccount". 
    Instantiate two different objects of class SavingsAccount, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively. 
    Set the annualInterestRate to 3 percent. Calculate the monthly interest and print the new balances for each of the savers.
    Then, set the annualInterestRate to 4 percent, calculate the next month's interest, and print the new balances for each of the savers.*/
public class Main {
    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyinterestrate(3);
        System.out.println("new balance with 3% interest");
        System.out.println("Saver1 balance:" +(saver1.getsavingsBalance() + saver1.calculatemonthlyinterest(SavingsAccount.annualInterestRate, saver1.getsavingsBalance())));
        System.out.println("Saver2 balance:" +(saver2.getsavingsBalance() + saver2.calculatemonthlyinterest(SavingsAccount.annualInterestRate, saver2.getsavingsBalance())));
        //used getter methods to get the value of private member
        SavingsAccount.modifyinterestrate(4);
        System.out.println("new balance with 4% interest");
        System.out.println("Saver1 balance:" +(saver1.getsavingsBalance() + saver1.calculatemonthlyinterest(SavingsAccount.annualInterestRate, saver1.getsavingsBalance())));
        System.out.println("Saver2 balance:" +(saver2.getsavingsBalance() + saver2.calculatemonthlyinterest(SavingsAccount.annualInterestRate, saver2.getsavingsBalance())));
    }
}
