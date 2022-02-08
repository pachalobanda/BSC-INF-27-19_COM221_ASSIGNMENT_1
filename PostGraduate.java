//importing scanner
import java.util.Scanner;
//extending postgraduate
public class Postgraduate extends LoanAccounts{
    Postgraduate(){}
    Postgraduate(double LoanAmount,double Balance){
        super(LoanAmount,Balance);
    
    }
    Scanner input=new Scanner(System.in);
    public void postgraduate(){
        //choosing loan types for postgraduate
        System.out.println("TYPE OF LOAN YOU CAN BORROW:");
        System.out.println("1.Tuition");
        System.out.println("2.Subsistence");
        System.out.println("3.Research Grant");

       int choice=input.nextInt();
       LoanAccounts stud=new LoanAccounts();
       if(choice==1){
           System.out.println("Your Choice Is tuition Loan(10% interest): How Much You Need To Borrow?");
           double LoanAmount=input.nextDouble();

        stud.setLoanAmount(LoanAmount);
        stud.setBalance(LoanAmount);
        System.out.println("The Money You Have Borrowed Is: "+stud.getLoanAmount()+" The Total Amount Of Loan Is:"+Math.round(stud.getBalance()*1.1));
       }
       else if(choice==2){
        System.out.println("Your Choice Is Subsistence Loan(11% interest): How Much You Need To Borrow?"); 
        double LoanAmount=input.nextDouble();

        stud.setLoanAmount(LoanAmount);
        stud.setBalance(LoanAmount);
        System.out.println("The Money You Have Borrowed Is: "+stud.getLoanAmount()+" The Total Amount Of Loan Is:  "+Math.round(stud.getBalance()*1.15));
        
       }
       else if(choice==3){
        System.out.println("You Have Selected Research Grant Loan(15%).How Much Do You Want?"); 
        double LoanAmount=input.nextDouble();

        stud.setLoanAmount(LoanAmount);
        stud.setBalance(LoanAmount);
        System.out.println("The Money You Have Borrowed Is:  "+stud.getLoanAmount()+" The Total Amount Of Loan Is: "+Math.round(stud.getBalance()));
       }

    }
}