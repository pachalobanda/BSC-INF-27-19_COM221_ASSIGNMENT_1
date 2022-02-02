public class StudentD{
    private String Name;
    private int YearOfStudy;
    private String NameOfPrograme;

public StudentD(){
}
public StudentD(String Name, int YearOfStudy, String NameOfPrograme){
    this.Name = Name;
    this.YearOfStudy= YearOfStudy;
    this.NameOfPrograme = NameOfPrograme;

}
public void setName(String Name){
    this.Name = Name;
}
public String getName(){
    return Name;
}
public void UnderGraduate(){
    

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
}
