import java.util.Scanner;
public class LoanManagementSystem {
    public static void main(String[] args) {
        while(true) {
        Scanner input = new Scanner(System.in);
         LoanAccounts disp = new LoanAccounts();
         int choice3;
       
       disp.Display();
       int choice = input.nextInt();
       do {
        System.out.print("Enter Choice: ");
        choice3 = input.nextInt();

    }while(choice3 < 1 || choice3 > 3);
        

        if (choice == 1) {
            System.out.println("Enter Your Name:");
         
            String name = input.next();
            disp.setname(name);
            
            System.out.println("Enter Name Of Programe:");
            String program = input.next();
            disp.setprogram(program);

            System.out.println("Enter Year Of Study:");
            int year = input.nextInt();
            disp.setyear(year);
            System.out.println("Name: " + disp.getname() + " Year: " + disp.getyear() + " Program: " + disp.getprogram());

            System.out.println("Choose Whether You Are An Undergraduate Or a Postgraduate");
            System.out.println("1.Postgraduate");
            System.out.println("2.Undergraduate");
            int option = input.nextInt();
            Postgraduate p=new Postgraduate();
            if(option==1){
                p.postgraduate();
            }
            else if(option==2){
                Undergraduate ud=new Undergraduate();
                ud.undergraduate();
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