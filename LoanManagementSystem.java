import java.util.Scanner;
public class LoanManagementSystem {
    public static void main(String[] args) {
        while(true) {
        Scanner input = new Scanner(System.in);
         LoanAccounts loan = new LoanAccounts();
         int choice3;
       
       loan.Display();
       int choice = input.nextInt();
       do {
        System.out.print("Enter Choice: ");
        choice3 = input.nextInt();

    }while(choice3 < 1 || choice3 > 3);
        

        if (choice == 1) {
            System.out.println("Enter Your Name:");
         
            String Name = input.next();
            loan.setName(Name);
            
            System.out.println("Enter Name Of Programe:");
            String Program = input.next();
            loan.setProgram(Program);

            System.out.println("Enter Year Of Study:");
            int Year = input.nextInt();
            loan.setYear(Year);
            System.out.println("Name: " + loan.getName() + " Year: " + loan.getYear() + " Program: " + loan.getProgram());

            System.out.println("Choose Whether You Are An Undergraduate Or a Postgraduate");
            System.out.println("1.Postgraduate");
            System.out.println("2.Undergraduate");
            int option = input.nextInt();
            Postgraduate post=new Postgraduate();
            if(option==1){
                post.postgraduate();
            }
            else if(option==2){
                Undergraduate under=new Undergraduate();
                under.undergraduate();
            }
            else{
                System.out.println("Select The Right Option:");
            }
            
        }
        else if (choice == 2) {

        }
        else if (choice == 3) {
            System.exit(0);
        }
        else {
            System.out.println(" Invalid Option ");
        }
    }
    }
}