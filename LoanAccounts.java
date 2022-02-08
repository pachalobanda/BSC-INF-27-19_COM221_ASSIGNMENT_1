//import javax.sound.sampled.SourceDataLine;
//a class called LoanAccounts
public class LoanAccounts {
    //
    private String Name;
    private String Program;
    private int Year;
    private double LoanAmount;
    private double Balance;

    //adding constructor of LoanAccounts without parameters
    LoanAccounts(){
        
    }
    // constructor
    LoanAccounts(double Balance,double LoanAmount){
        this.Balance=Balance;
        this.LoanAmount=LoanAmount;
       
    }
    //another constructor    
    LoanAccounts(String Name, String Program, int Year,double LoanAmount,double Balance){
        this.Name = Name;
        this.Program = Program;
        this.Year = Year;
        this.LoanAmount=LoanAmount;
        this.Balance=Balance;
    }
    //setting a name
    public void setName(String Name){
        this.Name =Name;
    }
    //getting a name
    public String getName(){
        return Name;
    }
    //setting a program
    public void setProgram(String Program){
        this.Program = Program;
    }
    //getting a program
    public String getProgram(){
        return Program;
    }
    //setting a year
    public void setYear(int Year){
        this.Year = Year;
    }
    //getting a year
    public int getYear(){
        return Year;
    }
    
    public void setLoanAmount(double LoanAmount){
        this.LoanAmount = LoanAmount;
    }
    public double getLoanAmount(){
        return LoanAmount;
    }

    public void setBalance(double Amount){
        Balance=Balance-Amount;
    }
    public double getBalance(){
        return Balance;
    }
    //displaying the first page/opening page
    public void Display() {
        System.out.println("WELCOME TO LOAN MANAGEMENT SYSTEM:");
        System.out.println("---**--------**-------**-----**---");
        System.out.println("     MAIN MENU");
        System.out.println(" ~~~~~~~~~~~~~~~~~");
        System.out.println("1. Create a New Account:");
        System.out.println("2.Log in");
        System.out.println("3.Log out");
    }

}