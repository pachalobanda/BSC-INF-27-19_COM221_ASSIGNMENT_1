public class StudentD{
    private double InterestRate = 0.15;
    private double LoanAmount;
    private String Name;
    private int YearOfStudy;
    private String NameOfPrograme;
    private double Subsistence;
    private double Stationary;

public StudentD(){
}
public StudentD(double InterestRate, double LoanAmount, String Name, int YearOfStudy, String NameOfPrograme, double Subsistence, double Stationary){
    this.InterestRate = InterestRate;
    this.LoanAmount = LoanAmount;
    this.Name = Name;
    this.YearOfStudy= YearOfStudy;
    this.NameOfPrograme = NameOfPrograme;
    this.Subsistence = Subsistence;
    this.Stationary = Stationary;

}
class Undergraduate extends StudentD {

    private double Stationary = 2333.4;
    private double StuInterestRate;
    
    
    public Undergraduate(){
       super();
    
    }
    public Undergraduate ( double InterestRate, double StuInterestRate,  double LoanAmount, String Name, String YearOfStudy, String NameOfPrograme ){
    //super( InterestRate, LoanAmount, Name, YearOfStudy, NameOfPrograme, Subsistence);
    /*this.InterestRate = InterestRate;
    this.LoanAmount = LoanAmount;
    this.Name = Name;
    this.YearOfStudy = YearOfStudy;
    this.NameOfPrograme = NameOfPrograme;
    this.Subsistence = Subsistence;**/
    this.Stationary = Stationary;
    this.StuInterestRate = StuInterestRate;
    
    }
    public void setStationary(double Stationary){
        this.Stationary = Stationary;
    }
    public double getStationary(){
        return Stationary;
    }
    public void setStuInterestRate(double StuInterestRate){
        this.StuInterestRate = StuInterestRate;
    }
    public double getStuInterestRate(){
        return 15/100 * Stationary;
    }
    
    }


public void setInterestRate(double InterestRate){
    this.InterestRate = InterestRate;
}
public double getInterestRate(){
    return InterestRate;
}
public void setLoanAmount(double LoanAmount){
    this.LoanAmount = LoanAmount;
}
public double getLoanAmount(){
    return LoanAmount;
}
public void setName(String Name){
    this.Name = Name;
}
public String getName(){
    return Name;
}
public void setYearOfStudy(int YearOfStudy){
    this.YearOfStudy = YearOfStudy;
}
public int getYearOfStudy(){
    return YearOfStudy;
}
public void setNameOfPrograme(String NameOfPrograme){
    this.NameOfPrograme = NameOfPrograme;
}
public String getNameOfPrograme(){
    return NameOfPrograme;
}
public void setSubsistence(double Subsistence){
    this.Subsistence = Subsistence;
}
public double getSubsistence(){
    return Subsistence;
}
public void setStationary(double Stationary){
    this.Stationary = Stationary;
}
public double getStationary(){
    return Stationary;
}
}
