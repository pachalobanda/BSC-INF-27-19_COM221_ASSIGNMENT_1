//import javax.sound.sampled.SourceDataLine;
//a class called LoanAccounts
public class LoanAccounts {
    //
    private String name;
    private String program;
    private int year;
    private double loanAmount;
    private double balance;
    //adding an empty constructor LoanAccounts
    LoanAccounts(){
    }
    //a constructor
    LoanAccounts(double balance,double loanAmount){
        this.balance=balance;
        this.loanAmount=loanAmount;
       
    }
    //another constructor    
    LoanAccounts(String name, String program, int year,double loanAmount,double balance){
        this.name = name;
        this.program = program;
        this.year = year;
        this.loanAmount=loanAmount;
        this.balance=balance;
    }
    //setting a name
    public void setname(String name){
        this.name =name;
    }
    //getting a name
    public String getname(){
        return name;
    }
    //setting a program
    public void setprogram(String program){
        this.program = program;
    }
    //getting a program
    public String getprogram(){
        return program;
    }
    //setting a year
    public void setyear(int year){
        this.year = year;
    }
    //getting a year
    public int getyear(){
        return year;
    }
    
    public void setloanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public double getloanAmount(){
        return loanAmount;
    }

    public void setbalance(double amount){
        balance=balance-amount;
    }
    public double getbalance(){
        return balance;
    }
    //displaying the first page/opening page
    public void Display() {
        System.out.println("WELCOME TO LOAN MANAGEMENT SYSTEM:");
        System.out.println("---**--------**-------**-----**---");
        System.out.println("     MAIN MENU");
        System.out.println(" ~~~~~~~~~~~~~~~~~");
        System.out.println("1. Create an Account:");
        System.out.println("2.Sign in");
        System.out.println("3.Sign out");
    }

}