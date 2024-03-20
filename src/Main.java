
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