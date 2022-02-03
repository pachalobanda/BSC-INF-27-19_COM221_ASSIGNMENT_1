class Main{
   public static void main(String args[]){
     //create array of student object  
     Array[] obj = new Array[2] ;
 
     //create actual student object
     obj[0] = new Array();
     obj[1] = new Array();
 
     //assign data to student objects
     obj[0].setData(100,"Keston");
     obj[1].setData(200,"Pachalo");
 
     //display the student object data
     System.out.println("Student Object 1:");
     obj[0].showData();
     System.out.println("Student Object 2:");
     obj[1].showData();
  }
}
//Student class with StdAcc and Name as attributes
class Array{
    int StdAcc;
    String Name;
    public void setData(int c,String d){
        StdAcc = c;
        Name = d;
     }
    public void showData(){
        System.out.print("Student Account = "+StdAcc + "  " + " Student Name = "+Name);
        System.out.println();
     }
}