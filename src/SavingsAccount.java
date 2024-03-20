public class SavingsAccount {
    static double annualInterestRate;

    private int savingsBalance;//private field can be accessed only thr constructor

    SavingsAccount(int balance){
        this.savingsBalance=balance;
        this.savingsBalance += calculatemonthlyinterest(annualInterestRate,balance);
    }

    public float calculatemonthlyinterest(double interest,int savingsbalance){
        //you can access a private member variable inside the methods of the same class
                float monthlyinterest =(float)(savingsbalance*interest)/12;
                return monthlyinterest;

    }

    public static void modifyinterestrate(double newvalue){
                annualInterestRate=newvalue;
                //with static method we can change static field value
            }

    public int getsavingsBalance() {
        return savingsBalance;
        //getter to get the value of private savingsBalance
    }
}
