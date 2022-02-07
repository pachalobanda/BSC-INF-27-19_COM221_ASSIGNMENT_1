import java.util.Scanner;
        
public class MainClass{
    public static void main(String[] args){

        //generate random numbers
 int number1 = (int)(Math.random() * 10);
 int number2 = (int)(Math.random() * 10);
 int number3 = (int)(Math.random() * 10);

    Scanner input = new Scanner(System.in);

    LoanAccount loanacc [] = new LoanAccount[8];
     //  int NumAccount = 0;

    LoanManagementSystem Loan = new LoanManagementSystem();

    StudentD stud = new StudentD();
     
    int choice3;

    
       Loan.Display1();
        int choice = input.nextInt();
        if (choice == 1){
            Loan.Display();
            int choic = input.nextInt();
            if (choice == 1){
                Loan.MenuAccount();
                int choicee = input.nextInt();
        
   if (choice == 1){
        StudentD student = new StudentD();
        System.out.println("Enter Your Name:");
        String name = input.next();
        student.setName(name);
        System.out.println("Enter Year Of Study:");
        int year = input.nextInt();
        student.setYearOfStudy(year);
        System.out.println("Enter Name Of Programe:");
        String programe = input.next();
        student.setNameOfPrograme(programe);
        System.out.println("Enter subsitence amount");
        double subsistence = input.nextDouble();
        System.out.println("Enter stationay amount");
        double statioanay = input.nextDouble();
    
        String Account = "UG"+number1+number2+number3;
        System.out.println("............YOUR ACCOUNT DETAILS..........." );
        System.out.println("");
        System.out.println("Name          Year    Program      Loan Amount      Account Number");
        System.out.println("--------------------------------------------------------------------");
        System.out.println(name+"   "+"    "+year+"       "+programe+"        "+(stud.getInterestRate()* subsistence+ subsistence)+"           "+Account);
        Loan.Display2();
        int choice2 = input.nextInt();
        
if(choice2 ==1){
    System.out.println("your account balance is "+(stud.getInterestRate()* subsistence+ subsistence));
   /* else  (choice==2){
        StudentD studen = new StudentD();
        System.out.println("Enter Your Name:");
        String nam = input.next();
        student.setName(nam);
}
**/
}
else if(choice2==2){
   
}
   }
  }
}
    }
}