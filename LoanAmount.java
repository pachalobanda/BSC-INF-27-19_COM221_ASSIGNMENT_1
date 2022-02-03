publi class LoanAmount{
    private String Name;
    private String Account;
    private int Balance;
}
public LoanAmount(){

}
public LoanAmount( String Name, String Account, int Balance){
    this.Name = Name;
    this.Account = Account;
    this.Balance = Balance;

}
public void setName(String Name){
    this.Name = Name;
}
public String getName(){
    return Name;
}
public void setAccount(String Account){
    this.Account = Account;
}
public String getAccount(){
    return Account;
}
public void setBalance(int Balance){
    this.Balance = Balance;
}
public int getBalance(){
    return Balance;
}