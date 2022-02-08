//importing scanner
import java.util.Scanner;
public class Undergraduate extends LoanAccounts{
    Undergraduate(){}
    Undergraduate(double balance,double loanAmount){
        super(balance, loanAmount);
    }
    Scanner input=new Scanner(System.in);
    public void undergraduate(){
        //choosing loan type for undergraduate
        System.out.println("These are the Loans types you can borrow");
        System.out.println("1.Tuition");
        System.out.println("2.Subsistence");
        System.out.println("3.Stationery");
       System.out.println("What do you want to borrow?");
       int choice=input.nextInt();
       LoanAccounts x=new LoanAccounts();
       if(choice==1){
           System.out.println("You have selected tuition loan(10% interest).How do you want?");
           double loanAmount=input.nextDouble();

        x.setloanAmount(loanAmount);
        x.setbalance(loanAmount);
        System.out.println("You have borrowed "+x.getloanAmount()+" your total loan is "+Math.round(x.getbalance()*1.1)); 
       }
       else if(choice==2){
        System.out.println("You have selected subsistence loan(11% interest).How much do you want? ");
        double loanAmount=input.nextDouble();

        x.setloanAmount(loanAmount);
        x.setbalance(loanAmount);
        System.out.println("You have borrowed "+x.getloanAmount()+" your total loan is "+Math.round(x.getbalance()*1.1)); 
       }
       else if(choice==3){
        System.out.println("You have selected stationery loan(15%).How much do you want?"); 
        double loanAmount=input.nextDouble();

        x.setloanAmount(loanAmount);
        x.setbalance(loanAmount);
        System.out.println("You have borrowed "+x.getloanAmount()+" your total loan is "+Math.round(x.getbalance()*1.1));
       }
    }
}