 class LoanManagementSystem{
    public void Display1(){
        System.out.println("      SELECT YOUR CHOICE");
        System.out.println("     ----------***-------");
        System.out.println("1. Undergraduate");
        System.out.println("2. Postgraduate");
     }
    public void Display(){
        System.out.println("WELCOME TO LOAN MANAGEMENT SYSTEM:");
        System.out.println("---**--------**-------**-----**---");
        
        System.out.println("     MAIN MENU");
        System.out.println(" ~~~~~~~~~~~~~~~~~");
        System.out.println("1. Create an Account:");
        System.out.println("2. Apply for the Loan");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        /*do {
            System.out.print("Enter Choice: ");
            choice3 = input.nextInt();

        }while(choice3 < 1 || choice3 > 4);
        return choice3;**/
    }
    public void MenuAccount(){
        System.out.println("SELECT ACCOUNT TYPE:");
        System.out.println("1. Loan Account");
        System.out.println("2. Student Account");

    }
    public void Display2(){ 
        System.out.println("..............PLACE YOUR CHOICE.............");

        System.out.println("1. Check your account balance");
        System.out.println("2. Create another account");
        System.out.println("3. payback");
    }
}