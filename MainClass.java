import java.util.Scanner;

public class MainClass{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    LoanManagementSystem Loan = new LoanManagementSystem();
    Loan.Display();
    int choice = input.nextInt();
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
    }

    
    }
}