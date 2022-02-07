class UnderGraduate extends StudentD {

    private double Stationary = 2333.4;
    private double StuInterestRate;
    
    
    public UnderGraduate(){
       super();
    
    }
    public UnderGraduate (double Stationary, double StuInterestRate, double InterestRate, double LoanAmount, String Name, int YearOfStudy, String NameOfPrograme, double Subsistence){
    super( InterestRate, LoanAmount, Name, YearOfStudy, NameOfPrograme, Subsistence);
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