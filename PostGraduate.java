
    class PostGraduate extends StudentD{
        double ResearchGrant = 6.6;
        
        
        public PostGraduate(){
        super();
        }
        public PostGraduate ( double ResearchGrant, double InterestRate, double LoanAmount, String Name, int YearOfStudy,String NameOfPrograme, double Subsistence){
        super( InterestRate, LoanAmount, Name, YearOfStudy, NameOfPrograme, Subsistence);
        
        this.ResearchGrant = ResearchGrant;
        
        }
        
        public double getResearchGrant(){
            return ResearchGrant;
        
        }
        public void setResearchGrant(double ResearchGrant){
            this.ResearchGrant = ResearchGrant;
        }
        
        }