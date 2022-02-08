//importing scanner
import java.util.Scanner;
public class Undergraduate extends LoanAccounts{
    Undergraduate(){

    }
    Undergraduate(double Balance,double LoanAmount){
        super(Balance, LoanAmount);
    }
    Scanner input=new Scanner(System.in);
    public void undergraduate(){
        //choosing loan type for undergraduate
        System.out.println("TYPE OF LOANS YOU CAN BORROW:");
        System.out.println("1.Tuition");
        System.out.println("2.Subsistence");
        System.out.println("3.Stationery");
       
       int choice=input.nextInt();

       LoanAccounts stud=new LoanAccounts();

       if(choice==1){
           System.out.println("Your Choice Is tuition Loan(10% interest): How Much You Need To Borrow?");
           double LoanAmount=input.nextDouble();

        stud.setLoanAmount(LoanAmount);
        stud.setBalance(LoanAmount);
        System.out.println("The Money You Have Borrowed Is: "+stud.getLoanAmount()+" The Total Amount Of Loan Is: "+Math.round(stud.getBalance()*1.1)); 
       }
       else if(choice==2){
        System.out.println("Your Choice Is Subsistence Loan(11% interest): How Much You Need To Borrow? ");
        double LoanAmount=input.nextDouble();

        stud.setLoanAmount(LoanAmount);
        stud.setBalance(LoanAmount);
        System.out.println("The Money You Have Borrowed Is:"+stud.getLoanAmount()+" The Total Amount Of Loan Is:"+Math.round(stud.getBalance()*1.1)); 
       }
       else if(choice==3){
        System.out.println("You Have Selected Stationery Loan(15%).How Much Do You Want?"); 
        double LoanAmount=input.nextDouble();

        stud.setLoanAmount(LoanAmount);
        stud.setBalance(LoanAmount);
        System.out.println("The Money You Have Borrowed Is: "+stud.getLoanAmount()+" The Total Amount Of Loan Is: "+Math.round(stud.getBalance()*1.1));
       }
    }
}