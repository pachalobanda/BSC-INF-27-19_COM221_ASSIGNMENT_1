public class LoanAccount{
    private int AccountNumber;
    private double Balance;

public LoanAccount(){

}
public LoanAccount(int AccountNumber, double Balance){
    this.AccountNumber = AccountNumber;
    this.Balance = Balance;

}
/*public class Account extends LoanAccount{
    private static final double FEE = 2.5;

    public Account(){
        super();
    }
    public Account(int AccountNumber, double FEE){
        super(AccountNumber);
        this.FEE = FEE;
    }
  
}
    public void Deposit(double amount){
        if (amount > 0){
            Balance += amount;
            System.out.printf("Amount %.2f deposited%n ", amount);

            Balance -= FEE;
            System.out.printf("Fee %.2% Applied%n  ", FEE);
            System.out.printf("Current Balance is: %.2f%n ", Balance);
        }else{
            System.out.println("negative amount can not be deposited");

        }
    }
    public class StudentAccount extends LoanAccount{
        private double InterestRate;
        private double calcInterestRate;
        
        public StudentAccount(){
           super();
        }
        public StudentAccount(int AccountNumber, double InterestRate, double calcInterestRate){ 
        super(AccountNumber);
        this.InterestRate = InterestRate;
        this.calcInterestRate = calcInterestRate;
        }
    }
        public double getInterestRate(){
            return InterestRate;
        }
        public void setInterestRate(double InterestRate){
            this.InterestRate = InterestRate;
        }
        public double calcInterestRate(){
            return Balance * InterestRate;
        }
    
        public void ApplyInterestRate(){
            double interest = calcInterestRate;
            System.out.printf("Interest Amount %.2f added to balance%n ", interest);
            deposit(interest);
        }
        public void deposit(double amount){
           if (amount > 0){
               Balance += amount;
               System.out.printf("Amount %.2f deposited%n ", amount);
           
               System.out.printf("Current Balance is: %.2f%n ", Balance);
           }else{
               System.out.println("negative amount can not be deposited");
        
           }
        
        
        }**/

public void setAccountNumber(int AccountNumber){
    this.AccountNumber = AccountNumber;
}
public int getAccountNumber(){
    return AccountNumber;
}
public void setBalance(double Balance){
    this.Balance = Balance;
}
//public int getBalance(){

 //   return Balance;
//}


}