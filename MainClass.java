import java.util.Scanner;

public class MainClass{
    public static void main(String[] args){

        //generate random numbers
 int number1 = (int)(Math.random() * 10);
 int number2 = (int)(Math.random() * 10);
 int number3 = (int)(Math.random() * 10);

    Scanner input = new Scanner(System.in);

    LoanManagementSystem Loan = new LoanManagementSystem();

    StudentD stud = new StudentD();
 
        System.out.println("      SELECT YOUR CHOICE");
        System.out.println("     ----------***-------");
        System.out.println("1. Undergraduate");
        System.out.println("2. Postgraduate");
        int choice = input.nextInt();
        if (choice == 1){
            Loan.Display();
            int choice1 = input.nextInt();
        
    if (choice == 1){
        StudentD student = new StudentD();
        System.out.println("Enter Your Name:");
        String n = input.next();
        student.setName(n);
        System.out.println("Enter Year Of Study:");
        int y = input.nextInt();
        student.setYearOfStudy(y);
        System.out.println("Enter Name Of Programe:");
        String p = input.next();
        student.setNameOfPrograme(p);
        System.out.println("Enter subsitence amount");
        double subsidence = input.nextDouble();
        System.out.println("Enter stationay amount");
        double statioanay = input.nextDouble();

        String account = "UG"+number1+number2+number3;
System.out.println("............YOUR ACCOUNT DETAILS..........." );
System.out.println("");
System.out.println("name       year   program       loan ammount    Account number");
System.out.println("-------------------------------------------------------------------------");
System.out.println(Name+" "+"   "+YearOfStudy+" "+NameOfPrograme+"   "+(stud.getInterestRate()* Subsistence+ Subsistence)+"      "+account);

System.out.println("..............PLACE YOUR CHOICE.............");
System.out.println("1. Check your account balance");
System.out.println("2. Create another account");
System.out.println("3. payback");
int choice2 = input.nextInt();
if(choice2 ==1){
    System.out.println("your account balance is "+(stud.getInterestRate()* Subsistence+ Subsistence));
}
else if(choice2==2){
    
}
  }

    }

    }
}