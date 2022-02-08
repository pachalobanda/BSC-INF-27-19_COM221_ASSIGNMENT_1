//importing scanner
import java.util.Scanner;
//extending postgraduate
public class Postgraduate extends LoanAccounts{
    Postgraduate(){}
    Postgraduate(double loanAmount,double balance){
        super(loanAmount,balance);
    
    }
    Scanner input=new Scanner(System.in);
    public void postgraduate(){
        //choosing loan types for postgraduate
        System.out.println("These are the Loans types you can borrow");
        System.out.println("1.Tuition");
        System.out.println("2.Subsistence");
        System.out.println("3.Research Grant");

       int choice=input.nextInt();
       LoanAccounts x=new LoanAccounts();
       if(choice==1){
           System.out.println("Your Choice Is tuition Loan(10% interest): How Much You Need To Borrow?");
           double loanAmount=input.nextDouble();

        x.setloanAmount(loanAmount);
        x.setbalance(loanAmount);
        System.out.println("The Money You Have Borrowed Is: "+x.getloanAmount()+" The Total Amount Of Loan Is:"+Math.round(x.getbalance()*1.1));
       }
       else if(choice==2){
        System.out.println("You have selected subsistence loan(15% interest).How much do you want?"); 
        double loanAmount=input.nextDouble();

        x.setloanAmount(loanAmount);
        x.setbalance(loanAmount);
        System.out.println("You have borrowed "+x.getloanAmount()+" your total loan is "+Math.round(x.getbalance()*1.15));
        
       }
       else if(choice==3){
        System.out.println("You have selected research grant loan.Enter the amount"); 
        double loanAmount=input.nextDouble();

        x.setloanAmount(loanAmount);
        x.setbalance(loanAmount);
        System.out.println("You have borrowed "+x.getloanAmount()+" your total loan is "+Math.round(x.getbalance()));
       }

    }
}